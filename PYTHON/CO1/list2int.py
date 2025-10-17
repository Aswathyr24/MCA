#Whether lists are of same length
#Whether list sums to same value
#Whether any value occurs in both
 list1 = list(map(int, input("Enter first list: ").split()))
 list2 = list(map(int, input("Enter second list: ").split()))
 print("Same length?", len(list1) == len(list2))
 print("Same sum?", sum(list1) == sum(list2))
 print("Common values?", set(list1) & set(list2))