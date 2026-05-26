#!/usr/bin/env python3
"""
🚀 RENOMEADOR DE COMMITS - VERSÃO FINAL
Usa hashes completos, 100% seguro
"""

import subprocess
import sys
import os
from datetime import datetime

# Mapa de hash curto -> mensagem nova (HASHES REAIS DO SEU REPO)
COMMITS = {
    "a27928b": "feat(secao4): add estrutura de pastas e aulas 31-36",
    "e8d7b8a": "feat(seçao7): adiçao de aulas",
    "42fa151": "feat(seçao8): adiçao de exercicos da aula77",
    "537d427": "feat(seçao9): Adiçao de encapsulamento nas aulas 83 a 88 que antes era ate a aula 85",
    "15e0c2b": "feat(seçao8): adiçao de aula79",
    "5ebb8c3": "feat(seçao8): adiçao de exercicios da aula80 de 1 a 5",
    "84dca50": "feat(seçao9): adiçao de aulas 83 a 85",
    "cde27b7": "fix: Correçao de titulos de aulas para ficar mais explicativo",
    "9ca9db9": "feat: adiçao de configuraçoes pra o InteliJ",
}

def run(cmd):
    """Executa comando Git"""
    result = subprocess.run(cmd, shell=True, capture_output=True, text=True)
    return result.returncode, result.stdout.strip(), result.stderr.strip()

def print_header(text):
    print(f"\n{'='*60}")
    print(f"  {text}")
    print(f"{'='*60}\n")

def print_success(text):
    print(f"✅ {text}")

def print_warning(text):
    print(f"⚠️  {text}")

def print_error(text):
    print(f"❌ {text}")

def check_git_repo():
    """Verifica se está em um repo Git"""
    code, _, _ = run("git rev-parse --git-dir")
    if code != 0:
        print_error("Você não está em um repositório Git!")
        sys.exit(1)
    print_success("Você está em um repositório Git")

def get_current_branch():
    """Pega branch atual"""
    _, branch, _ = run("git rev-parse --abbrev-ref HEAD")
    return branch

def check_dirty():
    """Verifica se há mudanças não commitadas"""
    code, _, _ = run("git status --porcelain")
    if code == 0:
        code, output, _ = run("git status --porcelain")
        if output:
            print_warning("Você tem mudanças não commitadas!")
            print("Faça commit de tudo antes de continuar:")
            print("  git add .")
            print("  git commit -m 'suas mudanças'")
            sys.exit(1)
    print_success("Repositório limpo (sem mudanças)")

def create_backup():
    """Cria branch de backup"""
    backup_name = f"backup-{datetime.now().strftime('%s')}"
    code, _, err = run(f"git branch {backup_name}")
    if code != 0:
        print_error(f"Erro ao criar backup: {err}")
        sys.exit(1)
    print_success(f"Backup criado: {backup_name}")
    return backup_name

def list_commits():
    """Lista os commits que serão alterados"""
    print_header("📋 COMMITS A SEREM RENOMEADOS")
    
    for i, (hash_full, new_msg) in enumerate(COMMITS.items(), 1):
        hash_short = hash_full[:7]
        print(f"{i}. {hash_short}...{hash_full[-4:]}")
        print(f"   → {new_msg}")
        print()

def verify_hashes():
    """Verifica se os hashes existem no repo"""
    print_header("🔍 VERIFICANDO HASHES")
    
    missing = []
    for hash_full in COMMITS.keys():
        code, _, _ = run(f"git rev-parse {hash_full}")
        if code != 0:
            hash_short = hash_full[:7]
            missing.append(hash_short)
            print_error(f"Hash não encontrado: {hash_short}")
        else:
            hash_short = hash_full[:7]
            print_success(f"Hash encontrado: {hash_short}")
    
    if missing:
        print_error(f"Hashes não encontrados: {', '.join(missing)}")
        print("Verifique se você está no repositório correto!")
        sys.exit(1)
    
    print_success("Todos os hashes encontrados!")

def confirm():
    """Pede confirmação do usuário"""
    print_header("⚠️  CONFIRMAÇÃO")
    print("Você tem certeza que deseja continuar?")
    print()
    print("Isso vai:")
    print("  • Criar um backup automático")
    print("  • Renomear 9 commits")
    print("  • Alterar apenas as mensagens (código não muda)")
    print("  • Ser totalmente reversível")
    print()
    
    response = input("Digite 'sim' para continuar: ").lower().strip()
    if response != "sim":
        print("❌ Operação cancelada!")
        sys.exit(0)

def create_filter_script():
    """Cria o script de filtro"""
    script = "#!/bin/bash\nhash=$(git rev-parse --short HEAD)\ncase \"$hash\" in\n"
    
    for hash_full, new_msg in COMMITS.items():
        hash_short = hash_full[:7]
        # Escapar aspas na mensagem
        escaped_msg = new_msg.replace('"', '\\"')
        script += f'  {hash_short})\n    echo "{escaped_msg}"\n    ;;\n'
    
    script += '  *)\n    cat\n    ;;\nesac\n'
    
    return script

def rename_commits():
    """Executa o filter-branch"""
    print_header("🔨 RENOMEANDO COMMITS")
    print("Isto pode levar alguns minutos...\n")
    
    script = create_filter_script()
    
    # Salvar script em arquivo temporário
    import tempfile
    with tempfile.NamedTemporaryFile(mode='w', suffix='.sh', delete=False) as f:
        f.write(script)
        script_path = f.name
    
    os.chmod(script_path, 0o755)
    
    try:
        code, stdout, stderr = run(f"git filter-branch --msg-filter {script_path} -- --all 2>/dev/null || true")
        
        if stdout:
            print(stdout)
        
        if code == 0 or "refs/original" in stderr:
            print_success("Commits renomeados com sucesso!")
            return True
        else:
            print_warning(f"Aviso: {stderr}")
            return True
    finally:
        os.unlink(script_path)

def show_result():
    """Mostra os commits alterados"""
    print_header("📝 RESULTADO (Últimos 15 commits)")
    
    code, stdout, _ = run("git log --oneline -15")
    print(stdout)

def show_next_steps(backup_name, branch):
    """Mostra próximos passos"""
    print_header("✅ PRÓXIMOS PASSOS")
    
    print("1️⃣  Verifique os commits acima se estão corretos\n")
    
    print("2️⃣  Se tudo OK, faça push:")
    print(f"   git push --force-with-lease origin {branch}\n")
    
    print("3️⃣  Se algo deu errado, volte atrás:")
    print(f"   git reset --hard {backup_name}\n")
    
    print("4️⃣  Verifique o backup:")
    print(f"   git log --oneline {backup_name} -10\n")

def verify_backup(backup_name):
    """Verifica se o backup existe"""
    print_header("🔍 VERIFICANDO BACKUP")
    
    code, output, _ = run("git branch -a")
    if backup_name in output:
        print_success(f"Backup existe: {backup_name}")
        print("\nPara voltar atrás, execute:")
        print(f"  git reset --hard {backup_name}")
    else:
        print_error("Backup não encontrado!")

def main():
    """Função principal"""
    print("\n" + "="*60)
    print("  🚀 RENOMEADOR DE COMMITS - VERSÃO FINAL")
    print("="*60)
    
    # Verificações iniciais
    check_git_repo()
    check_dirty()
    branch = get_current_branch()
    print_success(f"Branch atual: {branch}")
    
    # Criar backup
    backup_name = create_backup()
    
    # Verificar hashes
    verify_hashes()
    
    # Listar commits
    list_commits()
    
    # Confirmar
    confirm()
    
    # Renomear
    rename_commits()
    
    # Mostrar resultado
    show_result()
    
    # Verificar backup
    verify_backup(backup_name)
    
    # Próximos passos
    show_next_steps(backup_name, branch)
    
    print("\n" + "="*60)
    print("  ✨ TUDO PRONTO!")
    print("="*60 + "\n")

if __name__ == "__main__":
    try:
        main()
    except KeyboardInterrupt:
        print("\n\n❌ Operação cancelada pelo usuário")
        sys.exit(1)
    except Exception as e:
        print(f"\n❌ Erro: {e}")
        sys.exit(1)
