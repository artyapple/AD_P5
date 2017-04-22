import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pivot.IPivotElement;
import pivot.PivotRandom;
import sort.QuickSort;
import sort.SortingAlgorithm;

public class QuickSortTest {

	@Before
	public void before(){
		IPivotElement p = new PivotRandom();
		SortingAlgorithm alg = new QuickSort(p);
		
		//for(int i = 100; )
	}
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
		
		
	}

}
