const removeDuplicateEnteries = (nums) => {
  let l = 0;
  for (let r = 1; r < nums.length; r++) {
    if (nums[r] !== nums[l]) {
      l++;
      nums[l] = nums[r];
    }
  }
  return l + 1;
};

const nums = [0, 0, 1, 1, 1, 2, 2, 3, 3];
console.log(removeDuplicateEnteries(nums));
