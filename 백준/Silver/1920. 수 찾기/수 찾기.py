n = int(input())
arr = list(map(int, input().split()))
m = int(input())
line = list(map(int, input().split()))

def binary_search(arr, target):
    left, right = 0, len(arr) - 1

    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == target:
            return True
        elif arr[mid] > target:
            right = mid - 1
        else:
            left = mid + 1
    return False

arr.sort()

for i in line:
    if binary_search(arr, i):
        print(1)
    else:
        print(0)