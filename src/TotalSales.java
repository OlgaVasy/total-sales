// Ex.7.20: Total Sales
// Summarizes the total sales by salesperson and by product
import java.util.Scanner;

public class TotalSales {

   public static void main(String[]args)
   {
      int sales[][]=new int[5][4];

      Scanner input=new Scanner(System.in);

      System.out.println("Please enter the salesperson number or -1 to quit: ");
      int salesPerson=input.nextInt();

      while(salesPerson!=-1){

            if(salesPerson< 1||salesPerson>4){
               System.out.println("Invalid input. Please enter the number from 1 to 4 or -1 to quit: ");
               salesPerson=input.nextInt();
            }
            else{
               System.out.println("Enter the product number or -1 to go to the next salesperson: ");
               int product=input.nextInt();

               while(product!=-1){

                     if(product< 1||product>5){
                        System.out.println("Invalid input. Please enter the number from 1 to 5 or -1 to go to the next salesperson: ");
                        product=input.nextInt();
                     }
                     else{
                        System.out.println("Enter the amount of units sold: ");
                        int amount=input.nextInt();
                        while(amount< 0){
                              System.out.println("The amount of units sold cannot be negative. Please enter a valid number: ");
                              amount=input.nextInt();
                        }
                        sales[product-1][salesPerson-1]+=amount;
                        System.out.println("Enter the product number or -1 to go to the next salesperson: ");
                        product=input.nextInt();}}

               System.out.println("Please enter the salesperson number or -1 to quit: ");
               salesPerson=input.nextInt();
         }}
      System.out.print("            ");

      int salesPersonTotal[]=new int[4];
      int total = 0;
      for ( int column = 0; column < 4; column++ )
          salesPersonTotal[ column ] = 0;

      for(int column=0;column< 4;column++){
          salesPersonTotal[column]=0;
          System.out.printf("Salesperson %d   ",column+1);}

      System.out.println("Total\n");

      for ( int row = 0; row < 5; row++ )      {
          int productTotal = 0;
          System.out.printf( "Product %d", ( row + 1 ) );

          for ( int column = 0; column < 4; column++ ) {
              System.out.printf( "%14d", sales[ row ][ column ] );
              productTotal += sales[ row ][ column ];
              salesPersonTotal[ column ] += sales[ row ][ column ];
              total+= sales[ row ][ column ];;
         }
          System.out.printf( "%14d\n", productTotal );
      }

      System.out.printf( "%s", "Total    " );

      for ( int column = 0; column < 4; column++ )
          System.out.printf( "%14d", salesPersonTotal[ column ] );

      System.out.printf( "%14s", total );
      System.out.println();
   }
   }
