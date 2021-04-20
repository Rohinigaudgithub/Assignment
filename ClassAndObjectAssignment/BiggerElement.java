class BiggerElement
{
	static int arr[]={14,15,16,55,20};
	static int display()
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
			if(arr[i]>max)
				max=arr[i];
			return max;
	}
	public static void main(String args[])
	{
		System.out.println("Largest element in array "+display());
	}
}