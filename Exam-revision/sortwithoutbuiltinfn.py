def sort_list(lst):
    n = len(lst)
    for i in range(n):
        for j in range(i+1, n):
            if(lst[i] > lst[j]):
                lst[i], lst[j] = lst[j], lst[i]
lst = list(map(int, input("Enter numbers: ").split()))
sort_list(lst)
print("Sorted list: ", lst)