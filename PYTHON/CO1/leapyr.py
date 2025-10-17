 current_year = int(input("Enter the current year: "))
 final_year = int(input("Enter the final year: "))
 print("Leap years between", current_year, "and", final_year, "are:")
 for year in range(current_year, final_year + 1):
 if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
 print(year)