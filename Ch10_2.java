import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ch10_2
{
    public static void main(String[] args)
   {
       System.out.println("I will read the text of numbers from numbers.txt.");
        Scanner inputStream = null;
        int n;
        int max = 0;
        int min = 0;
        boolean first = true;
        
        try
        {
            inputStream = new Scanner(new FileInputStream("numbers.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File numbers.txt was not found");
            System.out.println("or could not be opened.");
            System.exit(0);
        }
        System.out.println("numbers in the file are:");
        while(inputStream.hasNextInt())
        {
            n = inputStream.nextInt();
            System.out.print(n + " ");
            if(first)
            {
                max = n;
                min = n;
            }
            else if(n > max)
            {
                max = n;
            }
            else if(n < min)
            {
                min = n;
            }
            first = false;
        }
        System.out.println();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        inputStream.close();
    }    
}