let arr = [3, 5, 7, 10, 15, 30]

function sum_of_elements(arr) {
  let sum = 0
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 3 === 0 && arr[i] % 2 === 1) {
      sum += arr[i]
    }
  }
  return sum
}

function check_prime_number(num) {
  if (num <= 1) return false

  let sqrt_num = Math.sqrt(num)

  for (let i = 2; i <= sqrt_num; i++) {
    if (num % i === 0) return false
  }
  return true
}

function sum_of_prime_numbers(arr) {
  let sum = 0
  for (let i = 0; i < arr.length; i++) {
    if (check_prime_number(arr[i])) {
      sum += arr[i]
    }
  }
  return sum
}

function new_array(arr) {
  return arr.filter((x) => x % 2 === 0)
}

function check_element_exist(arr, ele) {
  return arr.some((x) => x === ele)
}

function array_of_numbers_divisible_by_15(arr) {
  return arr.filter(x => x % 15 === 0 && x < 100 )
}

function array_of_primes(arr) {
  return arr.filter((x) => check_prime_number(x))
}

function insert_element(arr,n,x,pos) { 
  for (let i = n; i >= pos ; i--) {
    arr[i+1] = arr[i]
  }
  arr[pos] = x
}

// Tìm index phần tử trong mảng 
function find_element (arr,n,key)
{
  let i;
  for(i = 0; i < n; i++){
    if(arr[i] == key){
      return i
    }
  }
  return -1
}

// xóa phàn tử key trong mảng
function delete_element(arr,n,key) {
  let pos = find_element(arr,n,key)
  
  if(pos === -1){
    document.write("element not found")
    return n
  }

  let i
  for(i = pos; i < n - 1; i++) {
    arr[i] = arr[i+1];
  }
  return n - 1
}
 
function  map_array (arr) {
  return arr.map(x => x % 2)
}

function repeat_string (str) {
  let arr_str = []
  for(let i = 0; i < 10; i++) {
    arr_str.push(str)
  }
  return arr_str.join("")
}

function repeat_string_2(str) {
  let arr_str = []
  for (let i = 0; i < 10; i++) {
    arr_str.push(str)
  }
  return arr_str.join('-')
}

