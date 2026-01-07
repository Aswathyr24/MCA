lst = list(map(int, input("Enter elements: ").split()))

found = False
for i in range(len(lst)):
    if lst[i] in lst[i+1:]:
        print("First repeating item:", lst[i])
        print("Index:", i)
        found = True
        break

if not found:
    print("No repeating elements found")
