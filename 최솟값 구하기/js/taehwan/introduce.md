**7개의 수가 주어지면 그 숫자 중 가장 작은 수를 출력하는 프로그램을 작성하세요.**

> 내가 작성한 코드
```javascript
function solution(arr) {
    let answer, min = Number.MAX_SAFE_INTEGER;

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] < min) min = arr[i];
        answer = min;
    }
    return answer;
}

let arr = [5, 7, 1, 3, 2, 9, 11];
console.log(solution(arr));
```

1. `answer` 와 `min` 의 기본값을 설정한다. (`Number.MAX_SAFE_INTEGER` 은 안전한 가장 큰 인티져형 숫자를 의미함)
2. `for` 문을 `0` 부터 배열의 길이만큼 돌린다.
3. `arr[i]` 로 배열을 `min` 과 하나하나 비교하여 더 작은 값을 `min` 에 넣어준다.
4. `answer` 에 `min` 을 넣어준다.
5. `1` 이 출력된다. 