package collections.java;

import java.io.*;
import java.util.*;

public class LinlkedHashsetExample {
	
		public static void main(String[] args)
		{

			
			LinkedHashSet<Integer> hs= new LinkedHashSet<Integer>();
			
			hs.add(10);
			hs.add(20);
			hs.add(30);
			hs.add(40);
			hs.add(50);
			hs.add(60);

			System.out.println("Initial HashSet " + hs);

			hs.remove(50);

			System.out.println("After removing element " + hs);

		}
}


