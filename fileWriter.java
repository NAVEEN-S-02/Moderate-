package pracCodes;

import java.io.*;

public class fileWriter {
	public static void main(String[] ar) throws IOException {
		File f = new File("C:\\Users\\Naveen\\Moderate\\Example.txt");
		FileWriter fr = new FileWriter(f);
		fr.write("Hello Dears");
		fr.close();
	}

}
