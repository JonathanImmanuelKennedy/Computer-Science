import java.util.*; // importing

public class DayOfTheYear { // class begins

    public static void main(String[] args) { // main method begins

        Scanner sc = new Scanner(System.in);

        int m[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // number of days in months

        System.out.print("Enter the day of the month : "); // accepting
        int dd = sc.nextInt();

        System.out.print("Enter the month number : ");
        int mm = sc.nextInt();

        System.out.print("Enter the year : ");
        int yy = sc.nextInt();

        sc.close();

        int dy = dd;

        if (yy % 400 == 0) // adding an extra day if it is a leap year
            m[1] = 29;
        else if (yy % 100 == 0)
            m[1] = 28;
        else if (yy % 4 == 0)
            m[1] = 29;

        for (int i = 0; i < mm - 1; i++)
            dy += m[i];

        System.out.println("\nCORRESPONDING DAY OF THE YEAR IS : " + dy); // printing the corresponding day of the year

    } // main method ends    
} // class ends
