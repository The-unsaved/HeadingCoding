function solution(s) {
    let answer, max = Number.MIN_SAFE_INTEGER;
    for (let x of s) { // x는 단어들을 의미
        if (x.length > max) {
            max = x.length;
        }
    }
    return answer;
}

let str = ["teacher", "time", "student", "beautiful", "good"];
console.log(solution(str));