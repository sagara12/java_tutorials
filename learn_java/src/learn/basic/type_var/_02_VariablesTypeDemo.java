package learn.basic.type_var;

public class _02_VariablesTypeDemo {

	public static void main(String[] args) {
		short num = 15;
		int count = num;

		// int 타입의 값을 byte타입의 변수에 저장할 수 없음
		// byte var = count;

        char cmd = 'a';
        int command = cmd;  // 의미?

        System.out.println(cmd);
        System.out.println(command);

        // 다음 3 라인의 의미?
        command += 5;
        cmd = (char)command;
        System.out.println(cmd);
	}

}
