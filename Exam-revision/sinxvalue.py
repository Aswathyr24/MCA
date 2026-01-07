x = float(input("Enter x in radians: "))
n = int(input("Enter number of terms: "))

fact = 1
power = x
sign = 1
sinx = 0

for i in range(1, 2*n, 2):
    sinx += sign * power / fact
    power *= x*x
    fact *= (i+1)*(i+2)
    sign *= -1

print("sin(x) =", sinx)
