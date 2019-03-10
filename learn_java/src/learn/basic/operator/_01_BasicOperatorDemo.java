package learn.basic.operator;

public class _01_BasicOperatorDemo {
    public static void main(String[] args) {
        // 산술연산
        int value = 12 * 5;
        value = value / 7;

        value = 18 % 5; // 나머지 연산

        // 증감연산
        value++;
        int count = ++value;

        // 비교연산자
        boolean result = 10 >= 5;
        String str = "안녕하세요";
        if (str.length() > 3) {
            System.out.println(str);
        } else {
            System.out.println("반갑습니다");
        }

        // 논리연산자
        int score = 81;
        if (score >= 80 && score < 90) {
            System.out.println("우수");
        }

        // new 연산자
        String greet01 = new String("안녕");
        String greet02 = "안녕";
        if (greet01 == greet02) {
            System.out.println("두 스트링은 같은 객체");
        } else {
            System.out.println("두 스트링은 다른 객체");
        }

        // 3항 연산자
        boolean needSpeed = false;
        char cmd = needSpeed == false ? 's' : 'f';
        System.out.println(cmd);
    }
}
