import java.util.Scanner;
class BubbleSort{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int []arr = new int[5];

		int temp,i,j;

		System.out.println("Enter the numbers of array :");

		for( i = 0; i < arr.length; i++){

			arr[i] = scan.nextInt();

		}
        int n;
        n=arr.length;
		for( i = 0; i < n-1; i++)
		{
			for(j = 0; j < n-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
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