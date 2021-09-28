**대문자로 이루어진 영어단어가 입력되면 단어에 포함된 ‘A'를 모두 ’#‘으로 바꾸어 출력하는 프로그램을 작성하세요.**

> 내가 작성한 코드

```javascript
function solution(s) {
    let answer = "";
    for (let x of s) {
        if (x === "A") answer += "#";
        else answer += x;
    }

    return answer;
}

let str = "BANANA";
console.log(solution(str));
```

1. `answer` 를 문자열로 받아와준다.
2. `for of` 문을 돌려 검열해준다.
3. `x` 에 들어오는 값이 `A` 라면 `#` 으로 바꿔준다.