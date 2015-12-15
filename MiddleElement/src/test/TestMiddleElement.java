package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import src.MiddleElement;

public class TestMiddleElement {

	@Test
	
    public void testFindMiddleElement() {
        Collection<Integer> numberList = Arrays.asList(2,1,4);
        MiddleElement<Integer> sample = new MiddleElement<>();
        Object expResult = 2;
        Object result = sample.findMiddleElement(numberList);
        assertEquals(expResult, result);
        
        Collection<String> stringList = Arrays.asList("x", "y", "z");
        MiddleElement<String> stringSample = new MiddleElement<>();
        result = stringSample.findMiddleElement(stringList);
        expResult = "y";
        assertEquals(expResult, result);
	}
}
