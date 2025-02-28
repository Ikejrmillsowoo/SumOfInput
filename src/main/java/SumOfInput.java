
import java.util.Scanner;

class SumOfInput{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		System.out.println(SumOfInput(input));
	}

	static int SumOfInput(int n){
	int sum = 0;
	for (int i=0; i<=n;i++){
		sum = sum +i;
	}
		return sum;
	}
	
}
