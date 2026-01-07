def is_prime(n):
    if n <= 1: return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

num = int(input("Enter number: "))
prime_factors = []
nonprime_factors = []

for i in range(1, num+1):
    if num % i == 0:
        if is_prime(i):
            prime_factors.append(i)
        else:
            nonprime_factors.append(i)

print("Prime:", prime_factors)
print("Non-prime:", nonprime_factors)
