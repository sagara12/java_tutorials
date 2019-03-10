package learn.learn.basic;

public class FirstBasicDemo {
    public static void main(String[] args) {
        // 콘솔에 Hello World! 스트링 출력(정보전달)
        System.out.println("Hello World!");

        // 메소드(함수) 호출(정보전달)
        doSomething();

        doAnother(10);

        // doSomeMore메소드 호출 후, 리턴된 값(합)을 변수 sum에 저장(정보저장)
        int sum = doSomeMore(10, 20);

        System.out.println(sum);
    }

    private static int doSomeMore(int a, int b) {
        return a + b;   // 정보 계산 후, 함수 호출 측으로 결과값 전달
    }

    private static void doAnother(int i) {
        System.out.println("doAnother 함수가 호출됨");

        System.out.println(i + " 값이 전달 됨");
    }

    private static void doSomething() {
        System.out.println("doSomething 함수가 호출됨");
    }

}
