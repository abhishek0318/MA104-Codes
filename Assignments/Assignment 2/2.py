string = input("Enter the string to check for palindrome: ")
def checkPalindrome(String):
    return String == ''.join(list(reversed(list(String))))

print(checkPalindrome(string))
