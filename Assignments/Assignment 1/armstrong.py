Str = input("Enter the number: ")
List = map(int, list(Str))
Sum = 0
for num in List:
    Sum += num ** 3
if Sum == int(Str):
    print("Armstrong number")
else:
    print("Not an Armstrong number")
