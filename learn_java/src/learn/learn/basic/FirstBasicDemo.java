package learn.learn.basic;

public class FirstBasicDemo {
    public static void main(String[] args) {
        // 콘솔에 Hello World! 스트링 출력
        System.out.println("Hello World!");

        // 메소드(함수) 호출
        doSomething();

        doAnother(10);

        // doSomeMore메소드 호출 후, 리턴된 값(합)을 변수 sum에 저장
        int sum = doSomeMore(10, 20);

        System.out.println(sum);
    }

    private static int doSomeMore(int a, int b) {
        return a + b;
    }

    private static void doAnother(int i) {
        System.out.println("doAnother 함수가 호출됨");

        System.out.println(i + " 값이 전달 됨");
    }

    private static void doSomething() {
        System.out.println("doSomething 함수가 호출됨");
    }

}
