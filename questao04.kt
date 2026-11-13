saldo = 1000.00
saque = 150.00

while True:
if saldo < saque:
print("Saldo Insuficiente")
break
saldo -= saque
print(f"Saque realizado. Saldo atual: R$ {saldo:.2f}")