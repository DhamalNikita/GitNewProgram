import java.util.*;
import java.io.*;
public class InputApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		try{
		FileWriter fw=new FileWriter("C:\\Users\\ADMIN\\Desktop\\hello\\myfile.txt");
		System.out.println("enter the string that you want to add in the file");
		String str=sc.nextLine();
		
		fw.write(str);
		fw.close();
		
		System.out.println("data added successfully");
		}
		catch(Exception e)
		{
			System.out.println("error occured:"+e);
		}
	}
}