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

		
	}
}
