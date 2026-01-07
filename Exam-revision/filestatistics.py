f = open("input.txt", "r")
lines = f.readlines()
f.close()

text = "".join(lines)
words = text.split()

freq = {}
for w in words:
    freq[w] = freq.get(w, 0) + 1

most = max(freq, key=freq.get)

print("Total lines:", len(lines))
print("Total words:", len(words))
print("Total characters:", len(text))
print("Most frequent word:", most)
