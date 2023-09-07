import java.util.*;

class Bubblesort 
{
	static void bubble(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  bubble(arr);
      System.out.println(Arrays.toString(arr));

	}

}
