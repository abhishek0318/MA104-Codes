def fibonacci(num):
    if num <= 0:
        return []
    elif num == 1:
        return [0]
    elif num == 2:
        return [0, 1]
    else:
        List = fibonacci(num - 1)
        List.append(List[num - 3] + List[num - 2])
        return List

number_of_numbers = int(input("Enter number of fibonacci numbers to generate: "))
print(fibonacci(number_of_numbers))
