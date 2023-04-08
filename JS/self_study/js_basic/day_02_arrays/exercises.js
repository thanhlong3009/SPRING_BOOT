// Lab 1
function sum(arr) {
  return arr.reduce((x, y) => x + y)
}

function multiple(arr) {
  return arr.reduce((x, y) => x * y)
}

function average(arr) {
  return arr.reduce((x, y) => x + y) / arr.length
}

function bigger_key(arr, key) {
  return arr.filter((x) => x > key)
}

// Lab 2

function insert_element(arr, pos, val) {
  let n = arr.length
  for (let i = n; i >= pos; i--) {
    arr[i + 1] = arr[i]
  }
  arr[pos] = val
}
// Lab 3
function filter_square_number(arr) {
  return arr.filter((x) => Math.sqrt(x) % 1 !== 0)
}

// Lab 4
function check_prime_number(num) {
  if (num <= 1) return false

  let sqrt_num = Math.sqrt(num)

  for (let i = 2; i <= sqrt_num; i++) {
    if (num % i === 0) return false
  }
  return true
}

function find_big_prime_num(arr) {
  return Math.max(...arr.filter(x => check_prime_number(x)))
}

// Lab5
function replace(arr){
  return arr.map(x => {
    if(x < 0){
      return 0
    }else{
      return x
    }
  })
}

// Lab 6 
function delete_prime_num(arr) {
  return arr.filter(x => !check_prime_number(x))
}


