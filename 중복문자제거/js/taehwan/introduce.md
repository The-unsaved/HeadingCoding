**소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하 세요. 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.**

> 내가 친 코드
```javascript
function solution(s) {
    let answer;
    for (let i = 0; i < s.length; i++) {
        if (s.indexOf(s[i]) === i) { // 자기와 같은 문자의 첫번째 인덱스 값과 본연의 위치가 같은지 판별 
            answer += s[i];
        }
    }
    return answer;
}

console.log(solution('ksekkset'));
```

1. `for` 문으로 인덱스 하나하나 비교해준다
2. `s` 와 같은 문자의 첫번째 인덱스 값과 `s` 본연의 위치가 같은지 `if` 문으로 판별한다.
3. 나오는 값을 `answer` 에 넣어준다 
4. `kset` 가 출력된다.