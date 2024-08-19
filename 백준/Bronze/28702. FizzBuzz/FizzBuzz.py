import sys

def Fizz(k):
    k = int(k)
    if k % 3 == 0 and k % 5 == 0:
        print("FizzBuzz")
        sys.exit()
    elif k % 3 == 0 and k % 5 != 0:
        print("Fizz")
        sys.exit()
    elif k % 3 != 0 and k % 5 == 0:
        print("Buzz")
        sys.exit()
    else:
        print(k)
        sys.exit()

arr = []
for i in range(3):
    arr.append(input())

if arr[0].isdigit():
    print(Fizz(int(arr[0])+3))
elif arr[1].isdigit():
    print(Fizz(int(arr[1])+2))
elif arr[2].isdigit():
    print(Fizz(int(arr[2])+1))
