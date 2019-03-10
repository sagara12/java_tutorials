package learn.basic.type_var;

public class _03_ReferenceDataTypeDemo {
    public static void main(String[] args) {
        int var = 100;
        String message = "Java Programming";
        // Person이라는 사용자 정의 타입의 객체를 생성하여 객체로 접근할 수
        // 있는 주소값을 person이라는 변수에 저장
        Person person = new Person();

        plusTen(var);
        System.out.println(var);

        changeMessage(message);
        System.out.println(message);

        // person이라는 변수를 통해 id/name에 접근
        person.id = 10;
        person.name = "홍길동";

        System.out.println(person.id + ":" + person.name);
        changePerson(person);
        System.out.println(person.id + ":" + person.name);
    }

    private static void changePerson(Person person) {
        person.id = 20;
        person.name="김철수";
    }

    // String class
    // Reference Type
    // 그러나, message 변수로 전달되는 것은 실제 객체로 접근할 수 있는 주소
    // message 에 담긴 값을 다른 객체를 가르키는 주소값으로 함수 내에서 변경
    private static void changeMessage(String message) {
        message = "Python Programming";
    }

    private static void plusTen(int num) {
        num = num + 10;

        System.out.println("plusTen(): " + num);
    }
}

// Class: Reference Type
// 사용자 정의 타입
// 아이디 / 이름을 담을 수 있는 타입
class Person {
    int id;
    String name;
}
