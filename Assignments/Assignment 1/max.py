def max(x, y):
    if x >= y:
        return x
    else:
        return y

num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
print("Maximum of {} and {} is {}.".format(num1, num2, max(num1, num2)))
