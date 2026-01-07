def is_armstrong(num):
    s = 0
    temp = num
    n = len(str(num))
    while temp > 0:
        d = temp % 10
        s += d ** n
        temp //= 10
    return s == num
