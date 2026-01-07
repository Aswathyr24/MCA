students = {
    "Anu": [80, 75, 90],
    "Rahul": [60, 55, 70],
    "Meera": [85, 95, 88]
}

def total(m): return sum(m)
def average(m): return sum(m)/len(m)

print("Students above avg 70:")
for s, m in students.items():
    if average(m) > 70:
        print(s, m)
