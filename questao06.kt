while True:
print("\n--- MENU ---")
print("1. Opção 1")
print("2. Opção 2")
print("3. Opção 3 (Manutenção)")
print("0. Sair")

opcao = int(input("Escolha uma opção: "))

if opcao == 1 or opcao == 2:
print("Processando...")
elif opcao == 3:
print("Módulo em manutenção")
continue
elif opcao == 0:
print("Encerrando o programa.")
break
else:
print("Opção inválida, tente novamente.")