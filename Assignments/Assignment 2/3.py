from random import randint
import os

num = randint(1,9)
guess = 0
count = 0

while guess != num:
    os.system('clear')
    In = input("Guess the number (1-9): ")
    if In == 'exit':
        break
    guess = int(In)
    count += 1
    if guess > num:
        print("Too High! :|")
        input()
    elif guess < num:
        print("Too Low! :|")
        input()
    else:
        print("You guessed it right! You took {} attempt(s).".format(count))
        break
