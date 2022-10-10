package HighPeakSoft;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HRteam {
		
		static int minDifference(int arr[], int n, int k) {
			//initialization of variable
			int result = Integer.MAX_VALUE;
			//sorting of array
			Arrays.sort(arr);
			for (int i=0; i<= n-k;i++)
				//storing the result
				result = Math.min(result, arr[i + k - 1] - arr[i]);
			return result;
			
		}
		static int findElement(int res,int arr[], int n, int k)
		{
			int result = Integer.MAX_VALUE;
			for(int i=0; i<=n; i++)
			{
				result = Math.min(result, arr[i + k - 1] - arr[i]);
				if (res==result)
					return i;
						
			}
			return 0;
		}
		//main method
		public static void main(String[] args) throws IOException  {
		    //initialization of array
		    int arr[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
		    String items[]={ "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" };
		    int n = arr.length;
		    System.out.println("Enter the number of employees");
		    Scanner scn = new Scanner(System.in);
		    int k=scn.nextInt();
		    int result=minDifference(arr, n, k);  
		    System.out.println("Number of the employees:"+k); 
		    int startindex=findElement(result,arr,n,k);
		    System.out.println("Here the goodies that are selected for distribution are:");
		    for(int i=startindex;i<startindex+k;i++)
		    System.out.println(items[i]);
		      System.out.println("And the difference between the chosen goodie with highest price and the lowest price is:"+result);
		} 

			
		}
