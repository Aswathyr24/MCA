f = open("input.txt", "r")
lines = f.readlines()
f.close()

pos = int(input("Enter position: "))
sent = input("Enter sentence: ") + "\n"

lines.insert(pos-1, sent)

f = open("input.txt", "w")
f.writelines(lines)
f.close()

print("Sentence inserted")
