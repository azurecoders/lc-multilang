function twoSum(nums, target) {
  const map = new Map();
  for (let i = 0; i < nums.length; i++) {
    let x = target - nums[i];
    if (map.has(x)) return [map.get(x), i];
    map.set(nums[i], i);
  }
}

const sum = twoSum([3, 4, 6], 9);
console.log(sum);
