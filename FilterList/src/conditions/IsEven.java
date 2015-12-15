package conditions;
import src.Predicate;

public class IsEven  implements Predicate<Integer> {
	    @Override
	    public boolean apply(Integer inputNumber) {
	        return inputNumber % 2 == 0;
	    }
}
