package package1;

import java.io.File;
import java.io.IOException;

public class ForFiles {
public static void main(String[] args) throws IOException {
	
	//Create obj for File class
	File f = new File("C:\\Users\\HP\\Desktop\\sample\\textdoc.txt");
	
	System.out.println(f.exists());
	
	//to create a folder
	//boolean mkdir = f.mkdir();
	//System.out.println(mkdir);
	
	//to create a file inside my folder
	System.out.println(f.createNewFile());
	
	//to check if we can write
	System.out.println(f.canWrite());
	
	//to check if we can read
	System.out.println(f.canRead());
	
	//to check if we can execute the file
	System.out.println(f.canExecute());
	
	//to check if the pathname is absolute
	System.out.println(f.isAbsolute());
	
	//to get the name of the file in this pathname
	System.out.println(f.getName());
	
	//to get the length of the file
	System.out.println(f.length());
	
	//to get the parent folder of that file
	System.out.println(f.getParent());
	
	//to know if the path is for file or directory
	System.out.println(f.isDirectory());
	System.out.println(f.isFile());
	
	System.out.println(f.listFiles());
}
}
