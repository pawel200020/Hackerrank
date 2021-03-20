def is_in_set(search, set, size):
    for i in range(size):
        if set[i] == search:
            return True
    return False


def happines(data, aLike, bDislike):
    happyscore = 0
    for i in data:
        if i in aLike:
            happyscore += 1
        if i in bDislike:
            happyscore -= 1
    print(happyscore)


if __name__ == '__main__':
    dataQuantity = list(map(int, input().split()))
    n = dataQuantity[0]
    m = dataQuantity[1]
    data = map(int, input().split())
    aLike = set(map(int, input().split())) #Sets are used to store multiple items in a single variable.
    bDislike = set(map(int, input().split()))

    happines(data, aLike, bDislike)
