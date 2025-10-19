package Delimiter;

public class CustomDelimiterParser implements DelimiterParser {

    private final String CUSTOM_DELIMITER_PREFIX = "//";
    private final String CUSTOM_DELIMITER_SUFFIX = "\\n";

    public String getCUSTOM_DELIMITER_PREFIX() {
        return CUSTOM_DELIMITER_PREFIX;
    }

    public String getCUSTOM_DELIMITER_SUFFIX() {
        return CUSTOM_DELIMITER_SUFFIX;
    }

    public boolean hasCustomDelimiter(String input_string) {
        if (input_string.contains(CUSTOM_DELIMITER_PREFIX) && input_string.contains(CUSTOM_DELIMITER_SUFFIX)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String parse(String input) {
        if (hasCustomDelimiter(input)) {
            return input.substring(input.indexOf(CUSTOM_DELIMITER_PREFIX) + 2, input.indexOf(CUSTOM_DELIMITER_SUFFIX));
        } else {
            return "default";
        }
    }
}
