f = open("marks.txt", "r")
lines = f.readlines()
f.close()

out = open("results.txt", "w")

for line in lines:
    data = line.strip().split(",")
    name = data[0]
    marks = list(map(int, data[1:]))
    total = sum(marks)
    avg = total / len(marks)
    out.write(name + " Total=" + str(total) + " Avg=" + str(avg) + "\n")

out.close()
print("Result file created")
