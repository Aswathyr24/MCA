n = int(input("Enter number of strings: "))

for i in range(n):
    s = input()
    if s.startswith('a') and s.endswith('a'):
        print(s, "→ Valid")
    else:
        print(s, "→ Not valid")
