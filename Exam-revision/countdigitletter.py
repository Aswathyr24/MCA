s = input("Enter string: ")

digits = letters = others = 0

for ch in s:
    if ch.isdigit():
        digits += 1
    elif ch.isalpha():
        letters += 1
    else:
        others += 1

print("Letters:", letters)
print("Digits:", digits)
print("Other characters:", others)
