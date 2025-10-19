package Operator;

public class Adder implements Operation {
    @Override
    public int calculate(String[] numStr, int result) {
        result = 0;
        for (int i = 0; i < numStr.length; i++) {
            if (numStr[i].equals("")) {
                throw new IllegalArgumentException("[ERROR] 잘못된 값을 입력했습니다.");
            } else if (numStr[i].matches("^[0-9]*$")) {
                result += Integer.parseInt(numStr[i]);
            } else {
                throw new IllegalArgumentException("[ERROR] 잘못된 값을 입력했습니다.");
            }
        }

        return result;
    }
}
