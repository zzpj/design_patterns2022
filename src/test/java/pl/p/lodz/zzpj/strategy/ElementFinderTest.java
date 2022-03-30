package pl.p.lodz.zzpj.strategy;

import org.testng.annotations.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ElementFinderTest{

    List<String> words = Stream.of("aa","bb", "cc", "dd").toList();


    @ParameterizedTest
    @CsvSource({"aa, 0" ,"bb, 1", "cc, 2"})
    public void shouldSearchUsingLinearAlgorithm(String word, int index) {
        ElementFinder elementFinder = new ElementFinder(new LinearSearchStrategy());
        int actualIndex = elementFinder.findElement(words, word);
        assertEquals(index, actualIndex);
    }

    @ParameterizedTest
    @CsvSource({"aa, 0" ,"bb, 1", "cc, 2"})
    public void shouldSearchUsingBinaryAlgorithm(String word, int index) {
        ElementFinder elementFinder = new ElementFinder(new BinarySearchStrategy());
        int actualIndex = elementFinder.findElement(words, word);
        assertEquals(index, actualIndex);

    }
}