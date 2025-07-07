import java.util.*;
public class HollowButterfly {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows =sc.nextInt();

        //upper part
     for(int i = 1; i <= rows; i++){

         for(int j = 1; j <= i; j++){
             if(i == 1 || j == 1 || i == rows || j == i){
                 System.out.print("* ");   //for stars
             }
             else{
                 System.out.print("  ");   //for hollow spaces
             }
         }

         //for space
         int space = 2*(rows-i);
         for(int j = 1; j <= space; j++){
             System.out.print("  ");
         }

         for(int j = 1; j <= i; j++){
             if(i == 1 || j == 1 || i == rows || j == i) {
                 System.out.print("* ");   //for stars
             }
             else{
                 System.out.print("  ");   //for hollow spaces
             }
         }
         System.out.println();
     }

     //lower part
     for(int i = rows; i >= 1; i--){

         for(int j = 1; j <= i; j++){
             if(i == 1 || j ==1 || i == rows || j == i) {
                 System.out.print("* ");    //for stars
             }
             else{
                 System.out.print("  ");    //for hollow spaces
             }
         }

         //for space
         int space = 2*(rows-i);
         for(int j = 1; j <=space; j++){
             System.out.print("  ");
         }

         for(int j = 1; j <= i; j++){
             if(i == 1 || j ==1 || i == rows || j == i){
                 System.out.print("* ");    //for stars
             }
             else{
                 System.out.print("  ");    //for hollow spaces
             }
         }
         System.out.println();
        }
    }
}
