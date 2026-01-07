f = open("input.txt", "r")
lines = f.readlines()
f.close()

for line in reversed(lines):
    print(line.strip())
