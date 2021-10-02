**한 개의 문자열을 입력받아 해당 문자열에 알파벳 대문자가 몇 개 있는지 알아내는 프로그램 을 작성하세요.**

> 내가 작성한 코드

```javascript
function solution(s) {
    let answer = 0;

    for (let x of s) {
        if (x === x.toUpperCase()) answer++;
        // let num = x.charCodeAt();
        // if (num >= 65 && num <= 90) {
        //     answer++;
        // }
    }

    return answer;
}

let str = "KoreaTimeGood";
console.log(solution(str));
```

**1번째 방법**

1. `x` 와 `x` 의 대문자 값을 출력시키는 함수인 `toUpperCase` 함수를 이용하여 두 값이 같다면 `answer` 값을 더해준다.
2. `3` 이 출력된다.

**2번째 방법**
1. `아스키 코드` 로 비교를 할 수도 있다.
2. `num` 변수를 `x` 의 `아스키 코드` 값으로 바꿔준다.
3. `아스키 코드` 상에서의 알파벳 대문자 값은 `65 ~ 90` 이므로 그 사이의 값이 `num` 의 값이라면 `answer` 의 값을 더해준다.
4. `3` 이 출력된다.