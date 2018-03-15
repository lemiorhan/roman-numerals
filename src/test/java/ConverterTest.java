import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {

    private Converter converter;

    @Before
    public void setUp() {
        converter = new Converter();
    }

    @Test
    public void should_convert_one() {
        //given
        int numToConvert = 1;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("I");
    }

    @Test
    public void should_convert_two() {
        //given
        int numToConvert = 2;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("II");
    }

    @Test
    public void should_convert_four() {
        //given
        int numToConvert = 4;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("IV");
    }

    @Test
    public void should_convert_five() {
        //given
        int numToConvert = 5;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("V");
    }

    @Test
    public void should_convert_eight() {
        //given
        int numToConvert = 8;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("VIII");
    }

    @Test
    public void should_convert_nine() {
        //given
        int numToConvert = 9;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("IX");
    }

    @Test
    public void should_convert_ten() {
        //given
        int numToConvert = 10;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("X");
    }

    @Test
    public void should_convert_fifty() {
        //given
        int numToConvert = 50;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("L");
    }

    @Test
    public void should_convert_hundred() {
        //given
        int numToConvert = 100;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("C");
    }

    @Test
    public void should_convert_five_hundred() {
        //given
        int numToConvert = 500;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("D");
    }
    @Test
    public void should_convert_thousand() {
        //given
        int numToConvert = 1000;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("M");
    }

    @Test
    public void should_convert_eleven() {
        //given
        int numToConvert = 11;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("XI");
    }

    @Test
    public void should_convert_three_thousand() {
        //given
        int numToConvert = 3000;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("MMM");
    }

    @Test
    public void should_convert_two_thousand_nine_hundred_ninety_nine() {
        //given
        int numToConvert = 2999;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("MMCMXCIX");
    }

    @Test
    public void should_convert_one_thousand_nine_hundred_ninety_eight() {
        //given
        int numToConvert = 1998;

        //when
        String romanNumeral = converter.convert(numToConvert);

        //then
        assertThat(romanNumeral).isEqualTo("MCMXCVIII");
    }
}