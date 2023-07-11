package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void testContain() {
        String[] actual2 = "1,2".split(",");
        assertThat(actual2).containsExactly(new String[]{"1", "2"});
    }
}