package src;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MiddleElement <T extends Object & Comparable<? super T>> {
	
	public T findMiddleElement(Collection<? extends T> inputElements) {
		
        T middleElement;
        List<T> elementList = new ArrayList<>(new HashSet<>(inputElements)); 
        
        Collections.sort(elementList);
        middleElement = elementList.get(elementList.size() / 2);
        
        return middleElement;
    }

}
