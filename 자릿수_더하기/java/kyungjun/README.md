# 자릿수 더하기

1. 문제
![Question](../../../img/kyungjun/자릿수-더하기.png)

2. 문제 풀이
```java
import java.util.ArrayList;

public int solution(int n) {
    int answer = 0;
    int cnt = 0;
    ArrayList<Integer> list = new ArrayList<>(); // n % 10 의 값 ( 각 자리수 ) 을 받을 배열선언
    while (n > 0) { // n > 0보다 크다면 반복
        list.add(n % 10); // list 에 n % 10 의 값을 저장
        n = n / 10; // 한자리씩 없애기
        answer = answer + list.get(cnt++); // answer 에 더해주기
    }
    return answer;
}
```

3. 머리에 새기고 가는 개념
ArrayList : 배열과 같지만, 크기가 정해져 있지 않은 리스트 구조 ( 크기가 정해져있지 않을때 배열 대신 사용하면 좋은 list 구조 라고 기억 )