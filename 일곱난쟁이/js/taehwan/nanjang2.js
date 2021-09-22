function solution(arr) {
    let answer = arr;
    let sum = arr.reduce((a, b) => a + b, 0); //reduce 함수를 사용하여 a,b 값을 받아온 후 a + b 값으로 바꿈

    for (let i = 0; i < 8; i++) {
        for (let j = i + 1; j < 9; j++) {
            if ((sum - (arr[i] + arr[j])) === 100) {
                arr.split(i, 1);
                arr.split(j, 1);
            }
        }
    }

    return answer;
}

let arr = [20, 7, 23, 19, 10, 15, 25, 8, 13];

console.log(solution(arr));