import java.util.*;
class Marksheet{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String grade[] = new String[10];
		for(int i=1;i<11;i++){
			System.out.println("Enter student "+i+"'s marks: ");
			int marks = sc.nextInt();
			if(0<=marks && marks<=40)
				grade[i-1] = "Fail";
			else if(40<marks && marks<=50)
				grade[i-1] = "Pass";
			else if(50<marks && marks<=75)
				grade[i-1] = "Merit";
			else if(75<marks && marks<=100)
				grade[i-1] = "Distinction";
			else
				grade[i-1] = "Invalid numbers entered!";
		}
		System.out.println("STUDENTS "+"\tGRADE");
		for(int i=1;i<11;i++){
			System.out.println("Student "+i+"\t"+grade[i-1]);
		}
	}
}
