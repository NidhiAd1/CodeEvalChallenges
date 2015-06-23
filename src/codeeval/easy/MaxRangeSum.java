/*CodeEval challenge - MAX RANGE SUM
 */
package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MaxRangeSum
{
	
	static MaxRangeSum ob1 = new MaxRangeSum();
	
	public static void main(String[] args) throws IOException
	{
		File fileNew = new File(args[0]);
		try
		{
			BufferedReader be = new BufferedReader(new FileReader(fileNew));
			String line;
			while((line = be.readLine()) != null)
			{
					line = line.trim();
					
					String[] newLine= line.split(";");
					int numOfDays = Integer.parseInt(newLine[0]);
					//System.out.println("Number of days in the input = "+numOfDays);
					String[] arrayOfLossAndProfits = newLine[1].split(" ");
					int totalNumOfDays = arrayOfLossAndProfits.length;
					//System.out.println("Total number of digits given = "+totalNumOfDays);
					List<Integer> sumOfLossAndGains = new ArrayList<Integer>();
					int b=0;
					//Check if every input has valid number of Days N - 0<N<10000
					if(numOfDays >0 && numOfDays <100)
					{
						for(int i =0;i<(totalNumOfDays-numOfDays+1);i++)
						{
							int sum =0;
							
							
							//Check if loss or gain on each day is -100<N<100
							for(int j=i;j<i+numOfDays;j++)
							{
								
								if(Integer.parseInt(arrayOfLossAndProfits[j])> -100 && Integer.parseInt(arrayOfLossAndProfits[j]) <100)
								{
									//System.out.println("Current digit being added: "+arrayOfLossAndProfits[j]);
									sum += Integer.parseInt(arrayOfLossAndProfits[j]);
									
								}
								else
								{
									//System.out.println("The loss or gain is not -100<D<100");
									break;
								}
								
								b++;
								if(b<totalNumOfDays-numOfDays)continue;
							}
							

							//System.out.println("Current sum = "+sum);
							sumOfLossAndGains.add(sum);
							
							


						}
						
						//System.out.println("The list of sum of loss and Gains are = ");
						/*for(int item=0;item<sumOfLossAndGains.size();item++)
						{
						
							System.out.print(sumOfLossAndGains.get(item));
							System.out.print(',');
						}
						System.out.println();*/
						
						int max = ob1.findMax(sumOfLossAndGains);
						System.out.println(+max);
					}
					
					else
					{
						//System.out.println("The number of days asked to compute is not 0<N<100");
						return;
					}
				}
			be.close();		
			}
				
		
		
		catch(IOException e)
		{
			
			e.printStackTrace();
		}
		
	}
	
	private int findMax(List<Integer> summationArrayList)
	{
		int max =0;
		int current =0;
		int len = summationArrayList.size( );
		for (int i = 0; i<len; i++)
		{
			current = summationArrayList.get(i);
			if(current> max)
				max= current;
		}
		return max;
		
		
	}
	
}