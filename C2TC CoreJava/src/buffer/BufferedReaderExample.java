package buffer;

import java.io.*;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
InputStreamReader r= new InputStreamReader(System.in);
BufferedReader br =new BufferedReader(r);
System.out.println("ENTER THE NAME  ");
String name = br.readLine();
System.out.println("WELCOME"+"\t"+name);
	}

}
