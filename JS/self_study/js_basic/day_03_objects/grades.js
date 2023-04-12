function Grades(name, grade, sex) {
  (this.name = name),
  (this.grade = grade),
  (this.sex = sex)
}

const grade1 = new Grades('John',8, "M")
const grade2 = new Grades('Sara', 12, 'F')
const grade3 = new Grades('Bob', 16, 'M')
const grade4 = new Grades('Johnny', 2, 'M')
const grade5 = new Grades('Ethan', 4, 'M')
const grade6 = new Grades('Paula', 18, 'F')
const grade7 = new Grades('Donald', 5, 'M')
const grade8 = new Grades('Jennifer', 13, 'F')
const grade9 = new Grades('Courtney', 15, 'F')
const grade10 = new Grades('Jane', 9, 'F')


let grades =[grade1, grade2, grade3, grade4, grade5, grade6, grade7,grade8, grade9, grade10]
function list_students(grade_arr) {
  grade_arr.forEach(element => {
    console.log(element.name + " - " + element.grade + " - " + element.sex)
  });
}

//1
function avg_grade(grade_arr) {
  return grade_arr.reduce((sum,a) => sum + a.grade, 0) / grade_arr.length
}

//2 + 3
function avg_sex_grade(grade_arr,sex) {
  let gradeBySex = grade_arr.filter((grade) => grade.sex === sex)
  return gradeBySex.reduce((sum, a) => sum + a.grade, 0) / gradeBySex.length
}

// 4 + 5
function highest_rank_by_sex(grade_arr,sex) {
  let gradeBySex = grade_arr.filter((grade) => grade.sex === sex)
  return gradeBySex.reduce((highest,a) => {
    if (highest.grade < a.grade) {
      return a
    }
    return highest
  })
}


// 6 + 7
function lowest_rank_by_sex(grade_arr, sex) {
  let gradeBySex = grade_arr.filter((grade) => grade.sex === sex)
  return gradeBySex.reduce((lowest, a) => {
    if (lowest.grade > a.grade) {
      return a
    }
    return lowest
  })
}

// 8
function lowest_rank(grade_arr) {
  return grade_arr.reduce((lowest, a) => {
    if (lowest.grade > a.grade) {
      return a
    }
    return lowest
  })
}

//9 
function highest_rank(grade_arr) {
  return grade_arr.reduce((highest, a) => {
    if (highest.grade < a.grade) {
      return a
    }
    return highest
  })
}

// 10
function get_female_students(grade_arr) {
  return grade_arr.filter(student => student.sex === "F")
}

// 11 
function sort_by_name(grade_arr) {
  
}
console.log(get_female_students(grades))


