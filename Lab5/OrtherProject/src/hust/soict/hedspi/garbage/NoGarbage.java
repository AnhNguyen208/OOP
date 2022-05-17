package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoGarbage {
	public static void main(String[] args) {
		String s = " ";
		StringBuffer sb = new StringBuffer();
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
