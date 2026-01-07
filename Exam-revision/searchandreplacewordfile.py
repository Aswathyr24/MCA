f = open("input.txt", "r")
data = f.read()
f.close()

old = input("Enter word to search: ")
new = input("Enter new word: ")

data = data.replace(old, new)

f = open("input.txt", "w")
f.write(data)
f.close()

print("Word replaced")
