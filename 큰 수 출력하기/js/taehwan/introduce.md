**N(1<=N<=100)개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작 성하세요.(첫 번째 수는 무조건 출력한다)**

> 내가 작성한 코드

```javascript
function solution(arr) {
    let answer = [];
    answer.push(arr[0]); // 무조건 답이므로 push

    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > arr[i - 1]) answer.push(arr[i]);
    }

    return answer;
}

let arr = [7, 3, 9, 5, 6, 12];
console.log(solution(arr));
```

1. `arr[0]` 은 무조건 답이므로 바로 `push` 해준다.
2. `for` 문으로 하나하나 비교를 해준다.
3. `arr[i]` 와 자신의 바로 앞인 `arr[i-1]` 의 값을 비교해서 더 크면 `arr[i]` 를 `push` 한다.
4. `7 , 9 , 6 , 12` 가 출력된다.