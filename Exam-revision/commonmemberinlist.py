def common_member(list1, list2):
    for i in list1:
        if i in list2:
            return True
    return False


# ---- main program ----
l1 = input("Enter first list elements: ").split()
l2 = input("Enter second list elements: ").split()

if common_member(l1, l2):
    print("True - At least one common member found")
else:
    print("False - No common members")
