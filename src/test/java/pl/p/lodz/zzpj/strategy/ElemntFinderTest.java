package pl.p.lodz.zzpj.strategy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ElemntFinderTest {
    
    List<String> words = Stream.of("aa", "bb", "dd", "cc").toList();
    @ParameterizedTest
    @CsvSource({"aa, 0", "bb, 1", "dd, 2", "cc, 3"})
    public void shouldSearchUsingLinearAlgorithm(String word, int index) {
        ElemntFinder elemntFinder = new ElemntFinder(new LinearSearchStrategy());
        int actualIndex = elemntFinder.findElement(words, word);
        assertEquals(index, actualIndex);
    }

    @ParameterizedTest
    @CsvSource({"aa, 0", "bb, 1", "dd, 2", "cc, 3"})
    public void shouldSearchUsingBinaryAlgorithm(String word, int index) {
        ElemntFinder elemntFinder = new ElemntFinder(new BinarySearchStrategy());
        int actualIndex = elemntFinder.findElement(words, word);
        assertEquals(index, actualIndex);
    }

}