package View;

import Operator.Operator;
import camp.nextstep.edu.missionutils.Console;
import java.util.NoSuchElementException;

public class Execute {
    public void print() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String str;
        try {
            str = Console.readLine();
        } catch (NoSuchElementException e) {
            // 읽을 라인이 없어 예외가 발생하면, 입력을 빈 문자열("")로 간주한다.
            str = "";
        }

        Operator operator = new Operator();

        // input layer에서 처리
        if (str.isEmpty()) {
            System.out.println("결과 : 0");
        } else if (operator.getResult(str) < 0) {
            throw new IllegalArgumentException("[ERROR] 숫자 입력 범위를 초과하였습니다.");
        } else {
            System.out.println("결과 : " + operator.getResult(str));
        }
    }
}
