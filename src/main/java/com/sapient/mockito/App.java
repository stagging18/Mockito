package com.sapient.mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<String> al = new ArrayList<>();
    	al.add("Rajesh");
    	al.add("kumar");
    	
    	ArrayList<String> al1 = new ArrayList<>();
    	al1.add("Rajesh");
    	al1.add("kumar");
    	
    	System.out.println(al.equals(al1));
    	System.out.println(al.hashCode() + ", " + al1.hashCode());
    	
    	
    	
    	int n = 13;
    	
    	int arr[] = {6,2,8,9,1,7};
    	Arrays.sort(arr);
    	
    	for (int i : arr) {
			System.out.println(i);
		}
    	
    	System.out.println(arr);
   	Arrays.stream(arr).forEach(x->System.out.println(x));
   	
   	
   	Arrays.stream(arr).peek(e->{System.out.println(e);});
   	
    	
    	
    	int sum = n * (n + 1);
    	sum = sum /2;
    	
    	System.out.println(sum);
    	
    	
    }
}
