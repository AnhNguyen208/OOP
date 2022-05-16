package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GarbageCreator {
	public static void main(String[] args) {
		
		String s = " ";
		StringBuilder sb = new StringBuilder();
		File myObj = new File("garbage.txt");
	    if (myObj.exists()) {
	      System.out.println("File name: " + myObj.getName());
	      System.out.println("Absolute path: " + myObj.getAbsolutePath());
	      System.out.println("Writeable: " + myObj.canWrite());
	      System.out.println("Readable " + myObj.canRead());
	      System.out.println("File size in bytes " + myObj.length());
	    } else {
	      System.out.println("The file does not exist.");
	    }
		try {
			File myObj1 = new File("F:\\Lab5\\OrtherProject\\garbage.txt");
			long start = System.currentTimeMillis();
			Scanner myReader = new Scanner(myObj1);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				sb.append(data);
				//System.out.println(data);
				//s += data;
			}
			s = sb.toString();
			System.out.println(System.currentTimeMillis() - start);
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
