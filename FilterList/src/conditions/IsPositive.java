package conditions;

import src.Predicate;

public class IsPositive implements Predicate<Integer> {
    @Override
    public boolean apply(Integer inputNumber) {
        return inputNumber > 0;
    }
}
