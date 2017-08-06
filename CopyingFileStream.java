package assignment16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFileStream {

    public static void main(String[] args)
    {    
        File sourceFile = new File("C:/Users/IIS 3/Documents/Sourcefile.txt");
         
        File destFile = new File("C:/Users/IIS 3/Documents/DestFile.txt");
         
        FileInputStream inStream = null;
         
        FileOutputStream outStream = null;
         
        try
        {
            inStream = new FileInputStream(sourceFile);
             
            outStream = new FileOutputStream(destFile);
             
            byte[] buffer = new byte[1024];
             
            int length;
             
            while ((length = inStream.read(buffer)) != -1) 
            {
                outStream.write(buffer, 0, length);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                inStream.close();
                 
                outStream.close();
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
         
        System.out.println(" the source file is copied Successfully");
    }

}
