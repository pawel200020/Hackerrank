def is_vowel(letter):
    vowels = "AEIOUaeiou"
    if vowels.find(letter) != -1:
        return True
    else:
        return False


def print_result(stuart, kevin):
    if stuart > kevin:
        print("Stuart", stuart)
    elif kevin > stuart:
        print("Kevin", kevin)
    else:
        print("Draw")


def minion_game(string):
    currsize = len(string)
    stuart_consonants = 0
    kevin_vowels = 0
    for i in range(len(string)):
        points_to_add = currsize - i
        if is_vowel(string[i]):
            kevin_vowels += points_to_add
        else:
            stuart_consonants += points_to_add
    print_result(stuart_consonants, kevin_vowels)


if __name__ == '__main__':
    s = input()
    minion_game(s)
