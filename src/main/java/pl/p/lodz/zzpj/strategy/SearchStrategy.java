package pl.p.lodz.zzpj.strategy;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public interface SearchStrategy {
    int findElementIndex(List<String > elements, String element);
}

class BinarySearchStrategy implements SearchStrategy {
    @Override
    public int findElementIndex(List<String> elements, String element) {
        return Collections.binarySearch(elements,element);
    }
}

class LinearSearchStrategy implements SearchStrategy {
    @Override
    public int findElementIndex(List<String> elements, String element) {
        return elements.indexOf(element);
    }
}

class ElementFinder{

    SearchStrategy searchStrategy;

    public ElementFinder(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public int findElement(List<String> elements, String element) {
        return  searchStrategy.findElementIndex(elements,element);
    }

}

