import Armstrong

a = int(input("Enter lower limit: "))
b = int(input("Enter upper limit: "))

for i in range(a, b+1):
    if Armstrong.is_armstrong(i):
        print(i)
