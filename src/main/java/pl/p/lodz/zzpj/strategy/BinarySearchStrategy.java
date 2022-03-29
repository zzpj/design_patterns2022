package pl.p.lodz.zzpj.strategy;

import java.util.Collections;
import java.util.List;

class BinarySearchStrategy implements SearchStrategy {

    @Override
    public int findElementIndex(List<String> elements, String element) {
        return Collections.binarySearch(elements, element);
    }
}
