import java.util.*;
public class SolidRectangle {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows =sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns= sc.nextInt();

        for(int breadth = 1; breadth <= rows; breadth++){
            for(int length = 1; length <= columns; length++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}