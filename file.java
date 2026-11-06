import java.io.*;

class FileReadWrite
{
    public static void main(String args[])
    {
        try
        {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello Java!");
            fw.close();

            FileReader fr = new FileReader("sample.txt");
            int ch;

            while((ch = fr.read()) != -1)
            {
                System.out.print((char)ch);
            }

            fr.close();
        }
        catch(IOException e)
        {
            System.out.println("File Error");
        }
    }
}
