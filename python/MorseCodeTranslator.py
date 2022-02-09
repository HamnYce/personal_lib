morseCode = {
    "a" : ".-",
    "b" : "-...",
    "c" : "-.-.",
    "d" : "-..",
    "e" : ".",
    "f" : "..-.",
    "g" : "--.",
    "h" : "....",
    "i" : "..",
    "j" : ".---",
    "k" : "-.-",
    "l" : ".-..",
    "m" : "--",
    "n" : "-.",
    "o" : "---",
    "p" : ".--.",
    "q" : "--.-",
    "r" : ".-.",
    "s" : "...",
    "t" : "-",
    "u" : "..-",
    "v" : "...-",
    "w" : ".--",
    "x" : "-..-",
    "y" : "-.--",
    "z" : "--..",
    " " : "/"
    
}
morseKeys = list(morseCode.keys())
morseValues = list(morseCode.values())
textString = "this is a string in morse code"
morseString = "- .... .. ... / .. ... / .- / ... - .-. .. -. --. / .. -. / -- --- .-. ... . / -.-. --- -.. ."
decryptedMorseString = ""
#need spaces when typing in morse code,for example 2 dots is an 'i' but 3 is an 's'
#when += string, create a  space so += " "+string or += string + " "

def text2Morse(textString):
    morseString = ""
    for i in textString:
        morseString += (morseCode[i] + " ")
    return morseString




morseStringList = morseString.split("/")

for i in range(len(morseStringList)):
    morseStringList[i] = morseStringList[i].split()


for word in morseStringList:
    for letter in word:
        decryptedMorseString += morseKeys[morseValues.index(letter)]
    decryptedMorseString += " "

print(decryptedMorseString)
