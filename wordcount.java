import java.io.*;
import java.util.Scanner;

class WordCount
{
    public static void main(String args[])
    {
        int count = 0;

        try
        {
            File file = new File("sample.txt");
            Scanner sc = new Scanner(file);

            while(sc.hasNext())
            {
                sc.next();
                count++;
            }

            sc.close();

            System.out.println("Number of words: " + count);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }
}
