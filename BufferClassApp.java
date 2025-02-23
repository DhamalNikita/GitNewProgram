/*  Q2. WAP to input string value from keyboard and store in text file using BufferedWriter class and apply append mode on file? */
import java.util.*;
import java.io.*;

public class BufferClassApp{
	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		try{
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Program Files\\Java\\jdk-17\\bin\\HandlingAll\\name.txt",true));
		System.out.println("enter the string that you want to add in string");
		String str=sc.nextLine();
		
		bw.write(str);
		sc.nextLine();
		bw.close();
		
		System.out.println("data added successfully");
		}
		catch(Exception e)
		{
			System.out.println("error occured:"+e);
		}
	}
}
		
		
		
		