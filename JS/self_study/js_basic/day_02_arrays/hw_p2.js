function check_element_exist_rest(arr, val) {
  return arr.includes(val)
}

function get_element_greater(arr, val) {
   let new_arr = []
   arr.forEach(element => {
     if(element > val) {
       new_arr.push(element)
     }
   });
   return new_arr
 }

 function random_hex_code() {
   let hex_color = '#'

   for (let i = 0; i < 6; i++) {
     let random_num = Math.floor(Math.random() * 16)
     switch (random_num) {
       case 10: {
         random_num = 'a'
         break
       }
       case 11: {
         random_num = 'b'
         break
       }
       case 12: {
         random_num = 'c'
         break
       }
       case 13: {
         random_num = 'd'
         break
       }
       case 14: {
         random_num = 'e'
         break
       }
       case 15: {
         random_num = 'f'
         break
       }
     }
     hex_color += random_num.toString()
   }

   return hex_color
 }
 