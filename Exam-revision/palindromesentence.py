s = input("Enter sentence: ").lower()

clean = ""
for ch in s:
    if ch.isalnum():
        clean += ch

if clean == clean[::-1]:
    print("Palindrome")
else:
    print("Not Palindrome")
