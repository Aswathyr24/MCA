n = int(input("Enter number of sentences: "))
sentences = []

for i in range(n):
    sentences.append(input())

t = int(input("Enter number of words: "))
words = []

for i in range(t):
    words.append(input())

for w in words:
    count = 0
    for s in sentences:
        count += s.lower().split().count(w.lower())
    print(w, ":", count)
