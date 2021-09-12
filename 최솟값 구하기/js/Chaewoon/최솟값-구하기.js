function solution(arr) {
  let temp = arr.sort(function (a, b) {
    return a - b;
  });
  console.log(temp);
  return temp[0];
}

let arr = [5, 7, 1, 3, 2, 9, 11];
console.log(solution(arr));
