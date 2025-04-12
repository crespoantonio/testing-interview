def exercise():
    arr = [1, 2, 3, 4, 5]
    n = len(arr)
    for i in range(n // 2):
        arr[i], arr[n - i - 1] = arr[n - i - 1], arr[i]
    print(" ".join(map(str, arr)))

def check_palindrome(s):
    left, right = 0, len(s) - 1
    while left < right:
        while left < right and not s[left].isalnum():
            left += 1
        while left < right and not s[right].isalnum():
            right -= 1
        if s[left].lower() != s[right].lower():
            return False
        left += 1
        right -= 1
    return True

def find_pairs(arr, target):
    seen = set()
    pairs = set()
    for num in arr:
        comp = target - num
        if comp in seen:
            pairs.add((min(num, comp), max(num, comp)))
        seen.add(num)
    if not pairs:
        print("No pairs found.")
    else:
        print(f"Pairs: {pairs}")

reverse_array()
print("Palindrome:", check_palindrome("A man, a plan, a canal, Panama!"))
find_pairs([1, 5, 7, -1, 5], 6)
