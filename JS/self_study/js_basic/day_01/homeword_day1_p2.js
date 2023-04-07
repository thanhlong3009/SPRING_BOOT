function copy_string(str,n) {
  let rs_str = str 
  
  for(let i = 0; i < n - 1; i++) {
    rs_str += "-" + str
  }

  return rs_str
}

function sum_of () {
  let sum = 0
  for(let i = 0; i <= 100; i = i + 5){
    sum += i
  }
  return sum
}

function sum_of_2(num1,num2) {
  let sum = 0
  let left,right
  if(num1 < num2){
    left = num1
    right = num2
  }else{
    left = num2
    right = num1
  }
  for(let i = left + 1 ; i < right ; i ++){
    sum += i
  }
  return sum
}

function check_prime_number(num) {
  if(num <= 1) return false

  let sqrt_num = Math.sqrt(num)
  
  for(let i = 2; i <=sqrt_num; i++){
    if(num % i === 0 ) return false
  }
  return true
}

function sum_of_prime_number(num) {
  if(num === 1) return 0
  let sum = 2
  for( let i = 3; i <= num ; i = i + 2) {
    if(check_prime_number(i)){
      sum += i
    }
  }
  return sum
}
function sum_of_divisors_of_number(num) {
  let sum = 1 
  for( let i = 2; i <= num; i++) {
    if(num % i === 0) {
      sum += i
    }
  }
  return sum
}
console.log(sum_of_divisors_of_number(6))