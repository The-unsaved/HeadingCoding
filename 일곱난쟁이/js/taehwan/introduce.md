**아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며, 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.**

> 내가 작성한 코드

```javascript
function solution(arr) {
    let answer = arr;
    let sum = arr.reduce((a, b) => a + b, 0); //reduce 함수를 사용하여 a,b 값을 받아온 후 a + b 값으로 바꿈

    for (let i = 0; i < 8; i++) {
        for (let j = j + 1; j < 9; j++) {
            if ((sum - (arr[i] + arr[j])) === 100) {
                arr.split(i, 1);
                arr.split(j, 1);
            }
        }
    }

    return answer;
}

let arr = [20, 7, 23, 19, 10, 15, 25, 8, 13];

console.log(solution(arr));
```

1. `answer` 값에 `arr` 을 넣어주고, `sum` 값에 `reduce` 함수를 사용하여 `a,b` 값을 받아온 후 `a + b` 값으로 바꿔준다.
2. 이중포문을 돌려 검사를 시작한다.
3. 배열 전체의 값을 모두 더한 값인 `sum` 에서 검사한 값을 더한 값인 `(arr[i] + arr[j])` 를 뺐을 때 값이 `100` 라면 그 `i` 와 `j` 의 값을 `split` 함수로 제거한다.
4. 제거한 뒤의 결과값이 출력된다.