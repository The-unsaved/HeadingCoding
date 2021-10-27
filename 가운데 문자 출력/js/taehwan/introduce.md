**소문자로 된 단어(문자열)가 입력되면 그 단어의 가운데 문자를 출력하는 프로그램을 작성하세요. 단 단어의 길이가 짝수일 경우 가운데 2개의 문자를 출력합니다.**

> 내가 작성한 코드
```javascript
function solution(s) {
    let answer;
    let mid = Math.floor(s.length / 2); // 단어의 길이를 2로 나눈 값의 몫

    if (s.length % 2 == 1) answer = s.substring(mid, mid + 1);
    // if (s.length % 2 == 1) answer = s.substr(mid, 1);
    else answer = s.substring(mid - 1, mid + 1);
    // else answer = s.substr(mid - 1, 2);
    return answer;
}

console.log(solution("study"));
```

1. mid 변수에 Math.floor을 사용하여 s의 길이를 2로 나눈 값의 몫을 받아온다.
2. if문으로 홀수와 짝수 값을 확인하여 substring을 사용해 가운데 값만 빼온다. 
> **substring과 substr의 차이점** https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/String/substr
3. u가 출력된다.