package study;

import java.util.HashSet;

public class SetTest {
    private Integer numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        assertEquals(setUp.size(), 4);
    }
}