package src;

import java.util.ArrayList;
import java.util.List;

public class FilterList<T> {
     public static <T> List<T> filter(Predicate<? super T> inputPredicate, List<? extends T> inputList) {
        List<T> resultList = new ArrayList<>();
        
        for (T element : inputList) {
            if (inputPredicate.apply(element)) {
                resultList.add(element);
            }
        }
        
        return resultList;
     }
}
