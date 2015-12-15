package test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import conditions.IsEven;
import conditions.IsPositive;
import src.FilterList;
import src.Predicate;

public class FilterListTest {

	@Test
	public void filterListTest() {
	     List target = Arrays.asList(26,78,32,5);
	     Predicate predicate = new IsEven();
	     List expResult = Arrays.asList(26,78,32);
	     List result = FilterList.filter(predicate, target);
	     assertEquals(expResult, result);
	     
	     target = Arrays.asList(26,-78,32,-5);
	     Predicate anotherPredicate = new IsPositive();
	     expResult = Arrays.asList(26,32);
	     result = FilterList.filter(anotherPredicate, target);
	     assertEquals(expResult, result);
	     
	}

}
