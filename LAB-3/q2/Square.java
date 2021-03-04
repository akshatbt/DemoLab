class Square{
	public static void main(String args[]){
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		int sqrArray[] = new int[10];
		for(int i=0;i<10;i++)
			sqrArray[i] = array[i]*array[i];
		int sum=0;
		for(int i=0;i<10;i++)
			sum += sqrArray[i];
		System.out.println("Squared Numbers:");
		for(int i=0;i<10;i++)
			System.out.println(sqrArray[i]+" ");
		System.out.println("Sum of the squared numbers = "+sum);
	}
}