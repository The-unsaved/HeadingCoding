**한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요. 문자열의 길이는 100을 넘지 않습니다.**

> 내가 작성한 코드

```javascript
function solution(s, t) {
    let answer = s.split(t).length;

    return answer - 1;
}

let str = "COMPUTERPROGRAMMING";

console.log(solution(str, 'R'));
```

1. `answer` 값에 `s.split` 으로 나눠준후 `length` 로 길이를 잰다
2. 값을 `return` 할 때 `1` 을 빼서 `return` 한다.
3. `3` 이 출력된다.