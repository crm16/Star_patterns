import java.util.*;
public class SolidButterfly {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        //upper part
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");    //for stars
            }
            int space = 2*(rows-i);
            for(int j = 1; j <= space; j++){
                System.out.print("  ");    //for spaces
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");     //for stars
            }
            System.out.println();
        }

        //lower part
        for(int i = rows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");     //for stars
            }
            int space = 2*(rows-i);
            for(int j = 1; j <= space; j++){
                System.out.print("  ");    //for spaces
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");    //for stars
            }
            System.out.println();
        }
    }
}
