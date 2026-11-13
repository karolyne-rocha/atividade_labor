palavra = "Universidade"
vogais = "aeiouAEIOU"

for caractere in palavra:
if caractere in vogais:
continue
print(caractere, end=" ")
print()  # Quebra de linha final