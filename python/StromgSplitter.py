print("Please input a string")

userInput = input()

firstLetters = []
secondLetters = []
#this program takes a string, stores (as a list), then prints all odd and even numbered characters in the string.

for i in range(len(userInput)):
    if i == 0:
        firstLetters += userInput[i]
    elif i%2 == 0:
        firstLetters += userInput[i]
    else:
        secondLetters += userInput[i]


print(firstLetters)

print(secondLetters)

