**선생님이 N(1<=N<=1000)명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에 서부터 순서대로 주어질 때, 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그 램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)**

> 내가 작성한 코드
```javascript
function solution(arr) {
    let answer;
    let max = arr[0];

    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            answer++;
            max = arr[i];
        }
    }
    return answer;
}

let arr = [130, 135, 148, 140, 145, 150, 150, 153];
console.log(solution(arr));
```

1. max의 값을 배열의 첫번째 값으로 정해준다.
2. for문으로 하나하나 돌려준다.
3. if문을 사용하여 arr의 값이 max보다 크면 answer를 더하고 max값을 바꿔준다.
4. 5가 출력된다