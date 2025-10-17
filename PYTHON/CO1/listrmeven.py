 nums = list(map(int, input("Enter numbers: ").split()))
 odd_nums = [x for x in nums if x % 2 != 0]
 print("Odd numbers:", odd_nums)