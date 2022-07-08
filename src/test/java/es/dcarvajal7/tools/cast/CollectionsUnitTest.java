package es.dcarvajal7.tools.cast;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CollectionsUnitTest {

    @Test
    void contextLoads() {
    }

    @Test
    public void whenListOfString_thenReturnListOfInteger() {
        List<String> stringList = Arrays.asList("-1", "2", "3", "4", "5");
        List<Integer> integerList = Collections.transform(stringList, Integer::parseInt);
        assertThat(integerList).isEqualTo(Arrays.asList(-1, 2, 3, 4, 5));
    }

    @Test
    public void whenListOfInteger_thenReturnListOfString() {
        List<Integer> integerList= Arrays.asList(-1, 2, 3, 4, 5);
        List<String> stringList = Collections.transform(integerList, String::valueOf);
        assertThat(stringList).isEqualTo(Arrays.asList("-1", "2", "3", "4", "5"));
    }

    @Test
    public void whenListOfString_thenReturnListOfLong() {
        List<String> stringList = Arrays.asList("-1", "2", "3", "4", "5");
        List<Long> longList = Collections.transform(stringList, Long::valueOf);
        assertThat(longList).isEqualTo(Arrays.asList(-1L, 2L, 3L, 4L, 5L));
    }

    @Test
    public void whenListOfLong_thenReturnListOfString() {
        List<Long> longList= Arrays.asList(-1L, 2L, 3L, 4L, 5L);
        List<String> stringList = Collections.transform(longList, String::valueOf);
        assertThat(stringList).isEqualTo(Arrays.asList("-1", "2", "3", "4", "5"));
    }
}