L = list(map(int, input("Enter list: ").split()))
C = []

for i in range(len(L)):
    count = 0
    for j in range(i+1, len(L)):
        if L[j] > L[i]:
            count += 1
    C.append(count)

print("Original list:", L)
print("Count list:", C)
