def merge_the_tools(string, k):
    size = int(len(string) / k)
    stringwalk = 0
    #print(size)
    array = ["" for i in range(size)]
    couter = [0 for i in range(27)]
    for i in range(size):
        for j in range(k):
            couter[ord(string[stringwalk]) - 65] += 1
            if couter[ord(string[stringwalk]) - 65]<=1:
                array[i]+=string[stringwalk]
            stringwalk +=1
        couter = [0 for i in range(27)]
    for i in range (len(array)):
        print(array[i])

if __name__ == '__main__':
    string = input()
    k=int(input())

    merge_the_tools(string, k)
