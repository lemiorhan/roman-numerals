import org.apache.commons.lang.StringUtils;

import java.util.*;

public class Converter {

    private static final String ONE = "I";
    private static final String FIVE = "V";
    private static final String TEN = "X";
    private static final String FIFTY = "L";
    private static final String HUNDRED = "C";
    private static final String FIVE_HUNDRED = "D";
    private static final String THOUSAND = "M";

    private static final Map<Integer, String> ROMAN_LETTERS;
    static {
        ROMAN_LETTERS = new HashMap<Integer, String>();
        ROMAN_LETTERS.put(1, ONE);
        ROMAN_LETTERS.put(5, FIVE);
        ROMAN_LETTERS.put(10, TEN);
        ROMAN_LETTERS.put(50, FIFTY);
        ROMAN_LETTERS.put(100, HUNDRED);
        ROMAN_LETTERS.put(500, FIVE_HUNDRED);
        ROMAN_LETTERS.put(1000, THOUSAND);
    }

    public String convert(int num) {
        String result = "";
        List<Integer> divisorList = Arrays.asList(1000, 100, 10, 1);
        int numToCalculate = num;
        for (int divisor : divisorList) {
            int multiple = numToCalculate / divisor;
            int remainder = numToCalculate % divisor;
            result = addRomanLetters(result, multiple, divisor);
            numToCalculate = remainder;
        }
        return result;
    }

    private String addRomanLetters(String str, int multiple, int divisor) {
        String romanLetterMin = ROMAN_LETTERS.get(divisor);
        String romanLetterMiddle = ROMAN_LETTERS.get(divisor * 5);
        String romanLetterMax = ROMAN_LETTERS.get(divisor * 10);
        if (multiple == 9) {
            str += romanLetterMin + romanLetterMax;
        } else if (multiple >= 5) {
            str += romanLetterMiddle + StringUtils.repeat(romanLetterMin, multiple % 5);
        } else if (multiple == 4) {
            str += romanLetterMin + romanLetterMiddle;
        } else {
            str += StringUtils.repeat(romanLetterMin, multiple);
        }
        return str;
    }
}
