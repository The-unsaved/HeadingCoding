**대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자로 모두 통일하여 문자열을 출력 하는 프로그램을 작성하세요.**

> 내가 작성한 코드
```javascript
function solution(s) {
    let answer = '';

    for (let x of s) {
        // if (x === x.toLowerCase()) answer += x.toUpperCase();
        // else answer += x;

        let num = x.charCodeAt();
        if (num >= 97 && num <= 122) answer += String.fromCharCode(num - 32);
        else answer += x;
    }
}

let str = 'ItisTimeToStudy';
console.log(solution(str));
```

**첫번째 방식**
1. `for of` 문으로 비교를 해준다.
2. `x` 의 값이 소문자 값`(toLowerCase())` 이라면 `answer` 에 대문자로 바꾼값을 더해준다
3. 소문자 값이 아니라 대문자라면 그냥 더해준다.
4. `ITISTIMETOSTUDY` 이 출력된다.

**두번째 방식**
1. `for of` 문으로 비교를 해준다.
2. num 값을 아스키코드(charCodeAt())으로 받아온다.
3. 아스키 코드이 소문자 값인 `97 ~ 122` 사이의 값이 num의 값이라면 `answer` 의 값을 숫자를 문자로 변환해주는 `String.fromCharCode` 로 문자로 변환한 값을 더해준다.
4. 대문자 값이라면 그냥 더해준다.
5. `ITISTIMETOSTUDY` 이 출력된다.