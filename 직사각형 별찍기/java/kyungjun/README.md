# 직사각형 별찍기

1. 문제

![Question](../../../img/kyungjun/직사각형-별찍기.png)

2. 코드 설명
```java
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // a 에 가로의 길이를 입력받는다
        int b = sc.nextInt(); // b 에 세로의 길이를 입력받는다
        for(int i = 0; i<b; i++){ // 세로의 길이만큼 반복한다. ( 가로의 길이 a번만큼 반복하여 별을 찍고난 다음 실행된다. )
            for(int j = 0; j<a; j++){ //  가로의 길이 만큼 반복한다.
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
```

3. 새로 알아간 점 ( 다른 사람의 풀이를 보고난 후 )

Stringbuilder 란?
   - Stringbuilder는 String과 같이 문자열을 다루는 클래스 이다. 다만, String은 문자열을 생성자로 넣어 인스턴스를 한 번 생성하고 나면 인스턴스 가진 문자열 값을 변경하지 못하는 단점을 보완한 클래스이다.

IntStream 이란?   
   - 기존에 있는 for, while, do while 반복문 처럼 사용할 수 있는 클래스이다.
```java
StringBuilder sb = new StringBuilder();
IntStream.range(0, a).forEach(s -> sb.append("*")); // Stringbuilder 안에 a번 만큼 * 삽입(append)
IntStream.range(0, b).forEach(s -> System.out.println(sb.toString())); // Stringbuilder 안에 있는 값을 b만큼 출력
```
