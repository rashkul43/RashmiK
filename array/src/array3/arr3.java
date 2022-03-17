package array3;

public class arr3 {

	public static void main(String[] args)
	
	{//greatest num of array
		
		int a[]= {12,67,4005,334,78,555,89,1001};
		int b=a.length;
		
		for(int i=0; i<b; i++ )
		{
			for(int j=i+1;j<b;j++)
			{
				int temp=0;
				if( a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				}
			
	}
		System.out.println(a[b-1]);
	}

}
