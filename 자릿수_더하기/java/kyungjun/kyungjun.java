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
