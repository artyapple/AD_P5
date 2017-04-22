import element.Element;
import pivot.IPivotElement;
import pivot.PivotRandom;
import sort.QuickSort;
import sort.SortingAlgorithm;

public class Main {

	
    public static void main(String[] args){
    
    	IPivotElement p = new PivotRandom();
		SortingAlgorithm alg = new QuickSort(p);
		Element<String>[] array = initData();
		
		printArray(array);
		alg.sort(array);
		printArray(array);
		
    }
    
    private static Element<String>[] initData(){
    	Element<String>[] array = new Element[9];
    	int keys[] = new int[]{4,0,1,-1,0,2,-5,0,4};
    	int i = 0;
    	for(int key : keys){
    		array[i]=new Element<String>(key, "");
    		i++;
    	}
    	return array;
    }
    
    public static <T> void printArray(Element<T>[] array){
    	System.out.print("Array is:");
    	for(int i = 0; i < array.length; i++){
    		System.out.print(array[i].getKey()+", ");
    	}
    	System.out.println("\n");
    	
    }
}

