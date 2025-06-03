def twoSum(nums, target):
    num_map = {}
    for i, num in enumerate(nums):
        x = target - num
        if x in num_map:
            return [num_map[x], i]
        num_map[num] = i


sum = twoSum([3, 4, 7], 10)
print(sum)
