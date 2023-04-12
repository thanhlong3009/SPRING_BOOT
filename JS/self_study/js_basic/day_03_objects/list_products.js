function Product(name,price,brand,count) {
  this.name = name,
  this.price = price,
  this.brand = brand,
  this.count = count
}

const product1 = new Product("Iphone 13 Pro Max",30000000,"Apple",2)
const product2 = new Product("Samsung Galaxy Z Fold3",41000000,"Samsung",1)
const product3 = new Product("Iphone 11", 15000000 ,"Apple",1)
const product4 = new Product("OPPO Find X3 Pro", 19500000 ,"OPPO", 1)
const product5 = new Product("Samsung Galaxy S23", 20000000,"Samsung", 3)

let products = [product1,product2,product3,product4,product5]

//1
function list_product(product_arr) {
  product_arr.forEach(element => {
    console.log(element.name + " - " + element.price + " - " + element.brand + " - " + element.count)
  });
}

//2
function total_price_of_products(product_arr) {
  return product_arr.reduce((sum,product) => sum + (product.price * product.count ) , 0)
}

//3 
function find_products_by_brand(product_arr, brand) {
  return product_arr.filter(product => product.brand === brand)
}

//4
function find_products_by_price(product_arr, price) {
  return product_arr.filter(product => product.price > price)
}

//5
function find_products_by_name(product_arr, nameStr){
  return product_arr.filter(product => product.name.toLowerCase().includes(nameStr.toLowerCase()))
}

//6
function add_product(product_arr,product) {
  product_arr.push(product)
  return product_arr
}

//7
function remove_product(product_arr,brand) {
  return product_arr.filter(product => product.brand !== brand)
}

//8 
function sort_product_by_price(product_arr) {
  return product_arr.sort((product1,product2) => product1.price - product2.price )
}

//9
function sort_product_by_count(product_arr) {
  return product_arr.sort((product1,product2) => product2.count - product1.count)
}

//10 
function random_products (product_arr){
  let random_arr = [...product_arr].sort(() => 0.5 -  Math.random())
  return random_arr.slice(0,2)
}

console.log(random_products(products))
