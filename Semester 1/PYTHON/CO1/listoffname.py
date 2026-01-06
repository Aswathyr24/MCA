 names = input("Enter first names separated by space: ").split()
 count_a = sum(name.lower().count('a') for name in names)
 print("Total occurrences of 'a':", count_a)