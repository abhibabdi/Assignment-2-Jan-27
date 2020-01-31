import java.util.Scanner;
class SearchANumberInArray{
	public static void main(String[] args) {

		int number = Integer.parseInt(args[0]);
		
		int i;
		Scanner scan = new Scanner(System.in);

		int []arr = new int[10];

		for(  i = 0; i < arr.length; i++){

			arr[i] = scan.nextInt();

		}

		for(  i = 0; i < arr.length; i++){

			if(arr[i] == number)
			{
				System.out.println("Number Found");
				System.exit(0);
			}


		}

		System.out.println(" Number Not Found ");
	}
}