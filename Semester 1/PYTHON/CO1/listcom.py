 #Generate positive list of numbers from a given list of integers
 numbers = [-3,-1, 0, 2, 4,-5, 7]
 positive_numbers = [num for num in numbers if num > 0]
 print("Positive numbers:", positive_numbers)

#Square of N numbers
 N = int(input("Enter N: "))
 squares = [x**2 for x in range(1, N+1)]
 print("Squares:", squares)

# Form a list of vowels selected from a given word
 word = input("Enter a word: ")
 vowels = [ch for ch in word if ch.lower() in 'aeiou']
 print("Vowels:", vowels)

#List ordinal value of each element of a word (ord())
 word = input("Enter a word: ")
 ordinals = [ord(ch) for ch in word]
 print("Ordinal values:", ordinals)