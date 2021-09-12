<img width="999" alt="스크린샷 2021-09-10 오후 10 51 13" src="https://user-images.githubusercontent.com/68889258/132863989-c0f2e9b0-b4c1-4219-bdb3-4abf4a9042b6.png">

```javascript
function solution(arr) {
  let temp = arr.sort(function (a, b) {
    return a - b;
  });
  console.log(temp);
  return temp[0];
}
let arr = [5, 7, 1, 3, 2, 9, 11];
console.log(solution(arr));
```

> 풀이

1. sort 함수는 뒤에 파라미터로 func를 요소 로써 받는다면 요소들을 하나 하나 비교 하게 된다.
2. 비교 할때 Func(a,b)에서 a-b 가 만약 음수라면 a 가 b 앞에 오도록 하고 양수라면 b 가 a 앞으로 오도록 합니다.
3. 만약 0 을 리턴 한다면 위치를 바꾸지 않는다.
4. 이를 이용해서 오름차순으로 정렬한뒤 맨앞의 index 를 리턴한다.
