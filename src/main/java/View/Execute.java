package View;

import Operator.Operator;
import java.util.Scanner;

public class Execute {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String str = scanner.nextLine();

        Operator operator = new Operator();

        // input layer에서 처리
        if (str.isEmpty()) {
            System.out.println("결과 : 0");
        } else if (operator.getResult(str) < 0) {
            throw new IllegalArgumentException("[ERROR] 숫자 입력 범위를 초과하였습니다.");
        } else {
            System.out.println("결과 : " + operator.getResult(str));
        }

        scanner.close();
    }
}
