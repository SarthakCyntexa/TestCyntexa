def ques1():
    for i in range(6):
        print("I am Spider-Man")

def ques2():
    for i in range(9):
        print(f"I am Iron Man {i}")

def ques3():
    print("For Loop V")
    for i in range(10,1,-1):
        print(i)
    print("While Loop")
    i=10
    while i>0:
        print(i)
        i-=1
    print("No do-while loop in Python!")

def ques4and5():
    i=1
    while i<=10 :
        print("Hello World")
        print(i)
        i+=1

def ques6():
    arr = [2,53,66,32,64,12,74,62,55,53,60,21,9]
    print(sorted(arr)[-1])

def ques7():
    even, odd = [], []
    for i in range(1,101):
        if (i%2) != 0:
            odd.append(i)
        else:
            even.append(i)

    print(f"Even: {even}\nOdd: {odd}")

def ques8():
    for i in range(ord('a'),ord('z')+1):
        print(f"{chr(i)} : {ord(chr(i))}")
    for i in range(ord('A'),ord('Z')+1):
        print(f"{chr(i)} : {ord(chr(i))}")
    for i in range(ord('0'),ord('9')+1):
        print(f"{chr(i)} : {ord(chr(i))}")
ques8()