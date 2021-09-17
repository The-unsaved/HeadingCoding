**길이가 서로 다른 A, B, C 세 개의 막대 길이가 주어지면 이 세 막대로 삼각형을 만들 수 있 으면 “YES"를 출력하고, 만들 수 없으면 ”NO"를 출력한다.**

---

> 내가 작성한 코드
```javascript
function solution(a, b, c) {
    let answer = 'YES', sum = a + b + c, max;

    if (a > b) max = a;
    else max = b;
    if (c > max) max = c;

    if ((sum - max) <= max) answer = 'NO';

    return answer;
}

console.log(solution(13, 33, 17));
```

1. `answer` 의 기본값에 `YES` , `sum` 엔 세 변수를 다 더한값, `max` 를 선언해준다.
2. 다음의 코드로 `max` 값을 넣어준다.
```
if (a > b) max = a; 
else max = b; 
if (c > max) max = c;
```
3. `(sum + max) <= max` 의 코드로 다 더한 값에서 최대값을 빼 최대값이 더 크면 `NO` 를 출력하게 한다.
4. 위의 코드는 `NO` 가 출력된다.