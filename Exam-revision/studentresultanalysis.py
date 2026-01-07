students = {}

while True:
    line = input("Enter data (or stop): ")
    if line == "stop":
        break
    data = line.split(",")
    name = data[0]
    marks = list(map(int, data[1:]))
    students[name] = marks

total_all = 0
topper = ""
max_total = 0

print("\nStudent Results:")
for s in students:
    total = sum(students[s])
    avg = total / len(students[s])
    print(s, "-Total:", total, "Average:", format(avg, ".2f"))
    total_all += total
    if total > max_total:
        max_total = total
        topper = s

class_avg = total_all / (len(students) * 3)
print("Class Average:", format(class_avg, ".2f"))
print("Topper:", topper, "with", max_total, "marks")
