f1 = open("input.txt", "r")
data = f1.read()
f1.close()

f2 = open("reverse.txt", "w")
f2.write(data[::-1])
f2.close()

print("File reversed successfully")
