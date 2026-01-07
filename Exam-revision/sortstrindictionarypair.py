def list_of_frequencies(lst):
    d = {}
    for ch in s:
        d[ch] = d.get(ch, 0) + 1
    sorted_items = sorted(d.items(), key = lambda x: x[1], reverse = True)
    for k, v in sorted_items:
        print(k,":", v)
s = input("Enter string: ")
list_of_frequencies(s)
