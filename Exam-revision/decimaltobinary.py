n = int(input("Enter number: "))
b = ""
while n > 0:
    b = str(n % 2) + b
    n //= 2
print("Binary:", b)
