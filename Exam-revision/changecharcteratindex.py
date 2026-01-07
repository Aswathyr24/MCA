s = input("Enter string: ")
i = int(input("Enter index: "))
ch = input("Enter new character: ")

new = s[:i] + ch + s[i+1:]
print("Modified string:", new)
