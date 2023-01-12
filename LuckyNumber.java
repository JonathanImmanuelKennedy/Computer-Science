import java.util.*; // importing

public class LuckyNumber { // class begins
    public static void main(String args[]) { // main method begins

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : "); // accepting
        int n = sc.nextInt();

        sc.close();
 
        int arr[] = new int[n]; // create and array with natural numbers
        for (int i = 0; i < n; i++) 
            arr[i] = i + 1;
 
        int tmp = 1;
        System.out.println("\nTHE LUCKY NUMBERS LESS THAN " + n + " ARE : ");
 
        while (tmp < n) { // removing the numbers that are unlucky
            for(int i = tmp; i < n; i += tmp) {
                for(int j = i; j < (n - 1); j++)
                    arr[j] = arr[j + 1];
                n--;
            }
            tmp++;
        }

        for(int i = 0; i < n; i++) // printing lucky numbers
            System.out.println(arr[i]);
            
    } // main method ends
} // class ends