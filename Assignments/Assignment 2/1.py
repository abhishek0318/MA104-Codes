list1 = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
list2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]

def return_intersection(list1, list2):
    intersection = []
    for element in list1:
        if element in list2 and element not in intersection:
            intersection.append(element)
    return intersection

print("Intersection of", list1, "and", list2, "is", return_intersection(list1, list2))
