// 2574

var leftRigthDifference = function (nums) {
  let answer = []
  let n = nums.length
  let right = nums.reduce((x,y) => x + y)
  let left = 0

  for(let i = 0 ; i < n ; i++) {
    right -= nums[i]
    answer[i] = Math.abs(left - right)
    left += nums[i]
  }
  return answer
}

