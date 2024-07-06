import java.util.Scanner;

public class CommanElementsInMatrix {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int arr[];
        int n;
        int count;
        System.out.println("Enter the number of elements in the array: ");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            count = 0;
            for(int j = 0; j < n ;j++ ){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println("The element " + arr[i] + " occurred " + count + " times ");
        }
    }
}