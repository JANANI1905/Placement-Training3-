import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the array : ");
       int size = sc.nextInt();
       int[] arr = new int[size];
       for(int i =0 ; i < size ; i++){
           arr[i] = sc.nextInt();
       }
                  int min = arr[0];

       for(int i = 0 ; i < size ; i++){
           if(arr[i]<min){
               min = arr[i];
           }
       }
       System.out.print("Smallest value in array is "+min);
    }
}
//output:
//Enter the size of the array : 5
//55
//1
//5
//78
//22
//Smallest value in array is 1