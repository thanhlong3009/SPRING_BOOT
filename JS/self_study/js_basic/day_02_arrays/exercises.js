// Lab 1 
function sum(arr) {
  return arr.reduce((x, y) => x + y)
}

function multiple(arr) {
  return arr.reduce((x, y) => x * y)
} 

function average(arr) {
  return arr.reduce((x, y) => x + y) / (arr.length)
}

function bigger_key(arr, key) {
  return arr.filter(x => x > key )
}


console.log(bigger_key([1, 2, 3, 4],0))

