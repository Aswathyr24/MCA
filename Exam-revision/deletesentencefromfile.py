f = open("input.txt", "r")
lines = f.readlines()
f.close()

pos = int(input("Enter sentence position to delete: "))
lines.pop(pos-1)

f = open("input.txt", "w")
f.writelines(lines)
f.close()

print("Sentence deleted")
