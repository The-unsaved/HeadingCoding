# 평균 구하기 (JS)

---
```javascript
function solution(arr) {
  return arr.reduce((sum, current) => sum + current, 0) / arr.length;
}
```

reduce함수를 이용하여 배열 안의 값으 평균을 구하기 변수 sum, current 변수를 더하고 초기화 모든 배열의 합계를 구하고 배열의 길이만큼 나누기!

<!-- 일단 이정도만  -->