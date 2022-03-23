package pl.p.lodz.zzpj.strategy;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ElementFinderTest {

    List<String> words = Stream.of("aa", "bb", "cc", "dd").toList();

    @Test
    public void shouldSearchUsingLinearAlgorithm() {
        ElementFinder elementFinder = new ElementFinder(new LinearSearchStrategy());
        int index = elementFinder.findElement(words, "bb");
        assertEquals(index, 1);
    }

    @Test
    public void shouldSearchUsingBinaryAlgorithm() {
        ElementFinder elementFinder = new ElementFinder(new BinarySearchStrategy());
        int index = elementFinder.findElement(words, "bb");
        assertEquals(index, 1);
    }

}