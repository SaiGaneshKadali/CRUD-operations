import java.io.*;
public class PositiveorNegative 
 {
	public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double a;
        System.out.print("Enter the value of a number: ");
        a = Double.parseDouble(in.readLine());
        if(a<0)
            System.out.println("Negative");
        else
            System.out.println("Positive");
        
    }

}