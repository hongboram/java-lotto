package nextstep.lotto.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    private static final String SEPERATOR_REGEX_DEFAILT = ",|:";
    private static final String SEPERATOR_REGEX_CUSTOM = "//(.)\n(.*)";

    private static final int PATTERN_REGEX_DELOMITER_GROUP = 1;
    private static final int PATTERN_REGEX_PARAMETER_TEXT_GROUP = 2;

    private static Pattern pattern = Pattern.compile(SEPERATOR_REGEX_CUSTOM);

    private StringUtils() {
    }

    public static String[] splitString(String inputValue) {
        Matcher m = pattern.matcher(inputValue);

        if (m.find()) {
            String customDelimiter = m.group(PATTERN_REGEX_DELOMITER_GROUP);
            return m.group(PATTERN_REGEX_PARAMETER_TEXT_GROUP).split(customDelimiter);
        }

        return inputValue.split(SEPERATOR_REGEX_DEFAILT);
    }
}