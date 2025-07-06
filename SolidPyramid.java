import java.util.*;
public class SolidPyramid {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter limit: ");
        int limit =sc.nextInt();

        for(int rows =1; rows<=limit; rows++){
            for(int space=1; space<=limit-rows; space++){
                System.out.print(" ");
            }
            for(int stars=1; stars<=rows; stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
