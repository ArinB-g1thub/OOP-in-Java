import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDateDemo{

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Date in (DD/MM/YYYY Format: )");
        String date = sc.nextLine();
        int count = 0;
        StringTokenizer st = new StringTokenizer(date, "/");

        // int count = st.countTokens();

        while(st.hasMoreTokens()){
            String word = st.nextToken();
            count++;
        }
        System.out.println("Total Words : "+ count);
        sc.close();
    }
}