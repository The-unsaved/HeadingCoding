**N개의 문자열이 입력되면 그 중 가장 긴 문자열을 출력하는 프로그램을 작성하세요.**

> 내가 작성한 코드
```javascript
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
```

1. `max` 값을 `Number.MIN_SAFE_INTEGER` 로 제일 작은 수로 선언해준다.
2. `for of` 문으로 하나하나 비교해준다.
3. `x.length` 즉 단어의 길이가 `max` 값보다 크면 `max` 값을 `x` 로 바꿔준다.
4. `beautiful` 이 출력된다.