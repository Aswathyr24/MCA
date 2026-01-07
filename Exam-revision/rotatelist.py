lst = list(map(int, input("Enter list: ").split()))
k = int(input("Enter steps: "))

for i in range(k):
    last = lst.pop()
    lst.insert(0, last)

print("Rotated list:", lst)
