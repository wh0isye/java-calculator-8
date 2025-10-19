package Operator;

import Delimiter.CustomDelimiterParser;
import Delimiter.Delimiter;
import DelimiterRemover.DelimiterRemover;

public class Operator {
    public int getResult(String input) {
        // custom Delimiter 추가
        Delimiter delimiter = new Delimiter();
        CustomDelimiterParser customDelimiterParser = new CustomDelimiterParser();
        delimiter.addDelimiter(customDelimiterParser.parse(input));

        // Delimiter 제거
        DelimiterRemover delimiterRemover = new DelimiterRemover();
        String numStr[] = delimiterRemover.removeDelimiter(delimiterRemover.extractNumString(input),
                delimiter.getDelimiter());

        // Calculate - 덧셈
        Adder adder = new Adder();
        int result = 0;
        result = adder.calculate(numStr, result);

        return result;
    }
}
