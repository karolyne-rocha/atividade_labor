total = 0
for i in range(1, 101):
if i % 10 == 0:
continue
total += i
if total > 500:
print(f"Limite ultrapassado! Valor final do total: {total}")
break