import java.util.Scanner;

public class x만큼_간격이_있는_n개의_숫자 {
    /**
     * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
     */

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 정수를 받을 변수 x
        int n = sc.nextInt(); // 자연수를 받을 변수 n
        long[] result = solution(x,n); // solution 함수에 x, n 삽입
        for(int i = 0; i < n; i++){
            System.out.println(result[i]);
        }
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n]; // 답을 담을 answer long타입 배열 선언
        long temp = x; // 정수를 받을 long 타입 temp 선언
        for(int i = 0; i < n; i++){
            answer[i] = temp * (i+1); // for문을 실행하면서 answer 배열 안에 temp * 1씩늘어나는 숫자 로 배열에 넣어줌
        }
        return answer; // 정답 반환
    }

}
