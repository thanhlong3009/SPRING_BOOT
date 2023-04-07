function lab1_compare(a, b) {
  if (a > b) {
    return a
  }
  return b
}

function lab2_check_parity(a) {
  if (a % 2 === 0) {
    console.log('số chẵn')
  } else {
    console.log('số lẻ')
  }
}

function lab3(a) {
  if (a % 15 === 0) {
    return true
  }
  return false
}

function lab4(a, b, c) {
  if (a + b === c) {
    return true
  }
  return false
}

function lab5(mark) {
  if (mark >= 85) {
    console.log('A')
  } else if (mark >= 70 && mark < 85) {
    console.log('B')
  } else if (mark >= 40 && mark < 70) {
    console.log('C')
  } else {
    console.log('D')
  }
}

function weekdays(day) {
  switch (day) {
    case 0: {
      console.log('Chu Nhat')
      break
    }
    case 1: {
      console.log('Thu 2')
      break
    }
    case 2: {
      console.log('Thu 3')
      break
    }
    case 3: {
      console.log('Thu 4')
      break
    }
    case 4: {
      console.log('Thu 5')
      break
    }
    case 5: {
      console.log('Thu 6')
      break
    }
    case 6: {
      console.log('Thu 7')
      break
    }
    default: {
      console.log('Khong co thu phu hop')
    }
  }
}

function seasons(month) {
  switch (month) {
    case 1:
    case 2:
    case 3: {
      console.log('Mua xuan')
      break
    }

    case 4:
    case 5:
    case 6: {
      console.log('Mua ha')
      break
    }

    case 7:
    case 8:
    case 9: {
      console.log('Mua thu')
      break
    }

    case 10:
    case 11:
    case 12: {
      console.log('Mua dong')
      break
    }
    default: {
      console.log('Khong co thang phu hop')
    }
  }
}

function string_by_for(str) {
  let rs_str = str
  for (let i = 0; i < 9; i++) {
    rsStr += '-' + str
  }
  return rsStr
}

function string_by_while(str) {
  let i = 0
  let rs_str = str
  while (i < 9) {
    rsStr += '-' + str
    i++
  }
  return rsStr
}
