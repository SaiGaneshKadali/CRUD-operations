package collections.java;

import java.util.*;

public class TreesetExample {

		public static void main(String[] args)
		{
			
			Set<String> ts = new TreeSet<>();

			ts.add("vijay");
			ts.add("Arun");
			ts.add("Kiran");
			ts.add("Madhu");
			ts.add("Ram");
			ts.add("Pavan");

			for (String value : ts)

				System.out.print( value + "  ");

			System.out.println();
		}
}

