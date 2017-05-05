from random import randint
from os import system

num = randint(1000, 9999)
guess = 0
number_of_guesses = 0

while guess != num:
    system('clear')
    In = int(input("Guess the number: "))
    if In < 1000 or In > 9999:
        continue
    guess = In

    if guess == num:
        print("You guessed it right! :) You took {} guess(es).".format(number_of_guesses))
        break

    number_of_guesses += 1

    cows = 0
    for i in range(4):
        if list(str(guess))[i] == list(str(num))[i]:
            cows += 1

    digits_guessed_correctly = 0
    list_of_guess = list(str(guess))
    list_of_num = list(str(num))

    for i in range(len(list_of_guess)):
        for j in range(len(list_of_num)):
            if list_of_guess[i] == list_of_num[j]:
                digits_guessed_correctly += 1
                list_of_num[j] = -1
                break

    print("Cows: {}, Bulls: {}.".format(cows, digits_guessed_correctly - cows))
    input()
