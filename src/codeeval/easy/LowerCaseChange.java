package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LowerCaseChange
{
	public static void main(String[] args) throws IOException,NullPointerException
	{
		File file = new File(args[0]);
		try{
			BufferedReader bf= new BufferedReader(new FileReader(file));
			
			int value;
			
			while((value =bf.read()) != -1)
			{
				//System.out.println(value);
				char ch = (char)value;
				if(value>= 65 && value <= 90)
				{
					value = value + 32;
				}
				else if(value>= 97 && value <=122)
				{
					value = value - 32;
				}
				else
				{	
					System.out.print(ch);
					continue;
				}
				ch = (char)value;
				System.out.print(ch);
			}
			bf.close();
		}
		catch(IOException ioe)
		{
			
			ioe.printStackTrace();
		}
		catch(NullPointerException npe)
		{
			npe.printStackTrace();
			
		}
		
	}

}