import java.util.*;
import java.io.*;

public class FileWithPathChild
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		File drives[]=File.listRoots()(new File("F:\\handling"),"hello java");
		System.out.println(f.getAbsolutePath());
	}
}
/*
C:\Program Files\Java\jdk-17\bin\New folder (2)>javac FileWithPathChild.java

C:\Program Files\Java\jdk-17\bin\New folder (2)>java FileWithPathChild
F:\handling\hello java

C:\Program Files\Java\jdk-17\bin\New folder (2)>FileWithPathChildFileWithPathChild*/