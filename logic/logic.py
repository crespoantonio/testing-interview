def exercise():
    arr = [1, 2, 3, 4, 5]
    n = len(arr)
    for i in range(n // 2):
        arr[i], arr[n - i - 1] = arr[n - i - 1], arr[i]
    print(" ".join(map(str, arr)))

def exerciseII():
    arr = [2, 4, 6, 8, 10]
    result = 0

    for i in range(len(arr)):
        if i % 2 == 0:
            result += arr[i]
        else:
            result -= arr[i]

    print(result)
