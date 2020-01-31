import java.util.Scanner;
class SelectionSort{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int []arr = new int[5];

		int temp,j,i;

		for( i = 0; i < arr.length; i++){

			arr[i] = scan.nextInt();

		}

		for(i = 0; i < 4; i++){
            
			for( j = i + 1; j < 5; j++)
			{
				if(arr[j] < arr[i])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
}
				}
				
			} 
		

		System.out.println("The Sorted Array is :");

		for( i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+"  ");
		}

	}
}