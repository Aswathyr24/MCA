m = int(input("Enter number of rows: "))
n = int(input("Enter number of columns: "))

arr = []
print("Enter elements:")
for i in range(m):
    row = []
    for j in range(n):
        row.append(int(input()))
    arr.append(row)

print("2D Array:", arr)
