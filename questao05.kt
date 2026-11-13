alvo = 29
eh_primo = True

for i in range(2, alvo):
if alvo % i == 0:
eh_primo = False
break

if eh_primo:
print(f"O número {alvo} é primo.")
else:
print(f"O número {alvo} não é primo.")