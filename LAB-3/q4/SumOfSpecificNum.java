class SumOfSpecificNum{
	public static void main(String args[]){
		int sum =0;
		for(int i=40;i<250;i+=5){
			sum+=i;
		}
		sum -= 40;
		System.out.println("Sum of the numbers between 40 and 250 that are divisible by 5 = "+sum);
	}
}