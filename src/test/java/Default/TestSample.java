package Default;

import java.io.IOException;
import java.util.ArrayList;

public class TestSample {

	public static void main(String[] args) throws IOException {
		
		ExcelDriven exd = new ExcelDriven();
		ArrayList<String> d = exd.getData("Login");
		
		System.out.println(d.get(0));
		System.out.println(d.get(2));
		System.out.println("hi changes made in first");
		System.out.println("hi this is the change made by first");
		System.out.println("hi this is the change made by first not by master");
		


		System.out.println("hi changes made in second");
		System.out.println("hi this is the change made by second");
		System.out.println("hi this is the change made by first not by second");
		
		System.out.println("hi changes made in second 2");
		System.out.println("hi this is the change made by second 2");
		
		System.out.println("hi this is the change made by first");
		System.out.println("hi this is the change made by first not by master");
		

		System.out.println("hi changes made in second 3");
		System.out.println("hi this is the change made by second 3");
		

		System.out.println("hi changes made in second 4");
		System.out.println("hi this is the change made by second 4");


		System.out.println("hi changes made in second 2 4");
		System.out.println("hi this is the change made by second 2 4");

		
		System.out.println("hi changes made master");
		System.out.println("hi this is the change master");

		System.out.println("hi changes made master");
	}
}
