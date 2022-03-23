package pl.p.lodz.zzpj.strategy;

import java.util.List;

class LinearSearchStrategy implements SearchStrategy {

    @Override
    public int findElementIndex(List<String> elements, String element) {
        return elements.indexOf(element);
    }
}
