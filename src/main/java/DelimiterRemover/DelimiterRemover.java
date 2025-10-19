package DelimiterRemover;

import Delimiter.CustomDelimiterParser;
import Delimiter.Delimiter;

public class DelimiterRemover {
    Delimiter delimiter = new Delimiter();
    String delimiter_ = delimiter.getDelimiter();

    CustomDelimiterParser customDelimiterParser = new CustomDelimiterParser();

    public String extractNumString(String input) {
        if (customDelimiterParser.hasCustomDelimiter(input)) {
            return input.substring(input.indexOf(customDelimiterParser.getCUSTOM_DELIMITER_SUFFIX()) + 2);
        } else {
            return input;
        }
    }

    public String[] removeDelimiter(String input, String delimiter) {
        return input.split(delimiter);
    }
}
