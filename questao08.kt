senha_correta = "1234"

for tentativa in range(1, 6):
senha_digitada = input(f"Tentativa {tentativa}/5 - Digite a senha: ")

if senha_digitada == senha_correta:
print("Acesso concedido!")
break
else:
print("Senha incorreta.")

if tentativa == 3:
print("Cofre travado administrativamente")
break