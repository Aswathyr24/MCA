n = int(input("Enter number of students: "))
students = {}

for i in range(n):
    name = input("Name: ")
    marks = int(input("Marks (out of 40): "))
    students[name] = marks

print("\nStudent details:", students)

topper = max(students, key=students.get)
print("Topper:", topper, students[topper])

print("Students below 24:")
for s in students:
    if students[s] < 24:
        print(s)

avg = sum(students.values()) / n
print("Class average:", avg)
