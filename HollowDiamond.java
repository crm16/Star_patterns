import java.util.*;
public class HollowDiamond {
    public static void main(String [] args){

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        //for upper portion
        for(int i = 1; i <= rows; i++){

            //for spaces
            for(int j = 1; j <= rows-i; j++){
                System.out.print("  ");
            }

            int stars = 2*i-1;
            for(int j = 1; j <= stars; j++){
                if(i ==1 || j == 1 || j == stars) {
                    System.out.print("* ");    //for stars
                }
                else{
                    System.out.print("  ");    //for hollow spaces
                }
            }
            System.out.println();
        }

        //for lower portion
        for(int i = rows; i >= 1; i--){

            //for spaces
            for(int j = 1; j <= rows-i; j++){
                System.out.print("  ");
            }

            int stars = 2*i-1;
            for(int j = 1; j <= stars; j++){
                if(i == 1 || j == 1 || j == stars) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
