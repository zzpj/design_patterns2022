package pl.p.lodz.zzpj.strategy;

import java.util.Collections;
import java.util.List;

public interface SearchStrategy {
    int findElementIndex(List<String> elements, String elemtent);
}

class BinarySearchStrategy implements SearchStrategy {

    @Override
    public int findElementIndex(List<String> elements, String elemtent) {
        return Collections.binarySearch(elements, elemtent);
    }
}

class LinearSearchStrategy implements SearchStrategy {

    @Override
    public int findElementIndex(List<String> elements, String elemtent) {
        return elements.indexOf(elemtent);
    }
}

class ElemntFinder {
    SearchStrategy searchStrategy;

    public ElemntFinder(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }


    public int findElement(List<String> elements, String element) {
        return searchStrategy.findElementIndex(elements, element);
    }
}