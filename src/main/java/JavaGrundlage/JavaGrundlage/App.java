package JavaGrundlage.JavaGrundlage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	List<Integer> myList = new ArrayList<Integer>(Arrays.asList(1, 23, 4,5, 555, 66, 002, 897323412));
    	int sum = 0;
    	for(Integer item : myList) {
    		if(item % 2 == 0)
    		System.out.println( sum += item );
    	}
    }
}
