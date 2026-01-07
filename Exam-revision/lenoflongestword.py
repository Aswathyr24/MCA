words = input("Enter words: ").split()
longest = words[0]

for w in words:
    if len(w) > len(longest):
        longest = w

print("Longest word:", longest)
