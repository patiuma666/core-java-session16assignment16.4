package assignment16;//creating package name as assignment16


import java.io.File;
import java.io.IOException;
import java.nio.file.*;

import javax.print.attribute.standard.Destination;

public class CopyingFile { //creating class 

	public static void main(String[] args)  throws IOException{
	  
		File sourceFile = new File("C:/Users/IIS 3/Documents/Sourcefile.txt"); //creating a path  variable name as from and getting the the source file 
		
		File destinationFile = new File ("Assignment.txt"); //creating  another path of declaring a variable name as to and passing the destination file where as the source file content will be copied to the destination file
		
		Files.copy(sourceFile.toPath(), destinationFile.toPath());
				//creating the the Files.copy()method to copy the file using this copy method and replacing the existing file 
	
		System.out.println("success");
	}

}
