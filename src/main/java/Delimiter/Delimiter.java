package Delimiter;

public class Delimiter {
    private final String DEFAULT_DELIMITER = ",|:";
    private String customDelimiter = DEFAULT_DELIMITER;

    public void addDelimiter(String delimiter) {
        if (delimiter.length() > 1 && !delimiter.equals("default")) {
            throw new IllegalArgumentException("[ERROR] 구분자로 문자열이 입력되었습니다.");
        } else if (delimiter.matches("^[0-9]*$")) {
            throw new IllegalArgumentException("[ERROR] 구분자로 숫자를 입력했습니다.");
        } else if (delimiter.equals("default")) {
            customDelimiter = DEFAULT_DELIMITER;
        } else {
            customDelimiter += '|' + delimiter;
        }
    }

    public String getDelimiter() {
        return customDelimiter;
    }
}
