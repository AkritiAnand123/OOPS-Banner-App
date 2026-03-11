import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        // int[] arr = {10, 20, 30 ,40};
        // int n = arr.length;

        // System.out.println("Primitive Array");
        // for(int i = 0;i<n;i++)
        // System.out.print(arr[i]+ " ");
        // System.out.println();

        // Non - Primitive

        int[] arr = new int[10];
        Scanner scanner= new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("Element at "+ "i ");
        //     arr[i] = scanner.nextInt();
        // }

        int sum = 0;
        System.out.print("The sum of the array is ");
        for(int i = 0; i<arr.length;i++){
            sum+= arr[i];
        }
        System.out.println(sum);

        //Finding the largest number

        int max = arr[0];
int secondLargest = arr[0];

for (int i = 1; i < arr.length; i++) {

    if(arr[i] > max){
        secondLargest = max;
        max = arr[i];
    }

    else if(arr[i] > secondLargest && arr[i] != max){
        secondLargest = arr[i];
    }
}
        
    


        

        String[] str  = new String[10];
        for(int i=0;i<str.length;i++){
            System.out.println(i + arr[i] + " ");
        }

    }
}


// Remove the duplicates
// Occurence of each element 
// Move all the zeros to the end
// find the 1st  missing positive number 1 to n
