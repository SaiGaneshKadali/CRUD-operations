
public class loopsexample {

	public static void main(String[] args) { 
		//For Loop
		for(int i =1,j = 1; i<10||j<10;i++,j++)
		{
			j++;
			System.out.println("i="+i+"and j="+j);
			
			
		//While Loop
			while(i<10||j<10)
			{
				i++;j++;
			System.out.println("i="+i+"and j="+j);

			}
			
			//DoWhile Loop
			do
			{
				i++;
				j++;
				System.out.println("i="+i+"and j="+j);
			}
			while(i<10||j<10);
		}
	}
}


