package pl.p.lodz.zzpj.strategy;

import java.util.List;

class ElementFinder {
    SearchStrategy searchStrategy;

    public ElementFinder(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public int findElement(List<String> elements, String element) {
        return searchStrategy.findElementIndex(elements, element);
    }
}