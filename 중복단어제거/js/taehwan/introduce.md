**N개의 문자열이 입력되면 중복된 문자열은 제거하고 출력하는 프로그램을 작성하세요. 출력하는 문자열은 원래의 입력순서를 유지합니다.**

> 내가 작성한 코드

```javascript
function solution(s) {
    let answer;
    answer = s.filter(function (v, i) {
        if (s.indexOf(v) === i) {
            return true;
        }
    });

    return answer;
}

let str = ["good", "time", "good", "time", "student"];
console.log(solution(str));
```

1. `filter` 함수를 사용한다
2. `s` 의 인덱스값과 `i(str의 인덱스 값)` 을 비교하여 같으면 `true` 를 리턴한다.
3. `filter` 엔 `true` 로 나온값만 출력된다.
4. `[ "good" , "time" , "student" ]` 이 출력된다.