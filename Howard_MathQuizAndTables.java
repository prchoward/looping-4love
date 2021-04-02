
package csci1011.lab6;
import java.util.Scanner;

/**
 * @author {Benjamin Howard}
 * An Arithmetic quiz program with supplemental tables
 */
public class Howard_MathQuizAndTables {
public static final int MAXIMUMQUIZVALUE = 12;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      Scanner keyboard = new Scanner(System.in);
       boolean keepGoing = true;
       int userNumChoice;
       int increase = 0;
       
       
       
       System.out.println("Welcome to Benjamin Howard's arithmetic quiz program");
           do {
           System.out.println();
           System.out.println("Please choose from the following options:");
           System.out.println("1. Addition Quiz");
           System.out.println("2. Multiplication Quiz");
           System.out.println("3. Addition Table");
           System.out.println("4. Multiplication Table");
           System.out.println("5. Exit the program");
           int userInput = keyboard.nextInt();
           switch (userInput) {
               case 1 : 
               case 2 : do{
                            System.out.println("Please choose a number between 1 and 12");
                            userNumChoice = keyboard.nextInt();       
                       }while(userNumChoice > MAXIMUMQUIZVALUE || userNumChoice < 1);
                        int correctAmt = 0;
                        for(int count = 1; count <= MAXIMUMQUIZVALUE; count++)
                        {
                            if (userInput == 1)
                            { 
                                System.out.printf("%d + %d%n", userNumChoice, count);
                                int answerAddition = keyboard.nextInt();
                                if (answerAddition == count + userNumChoice)
                                {
                                    correctAmt++;
                                }
                           }else if (userInput == 2)
                           {
                                 System.out.println(userNumChoice+ " * " +count);
                                 int answerMultiply = keyboard.nextInt();
                                 if (answerMultiply == count * userNumChoice)
                                 {
                                     correctAmt++;   
                                 }
                           }
                        } 
                              if (correctAmt > 8)
                              {
                              System.out.printf("You got %d right out of 12. Good job! %n", correctAmt);
                              } else 
                              { 
                                  System.out.printf("You only got %d right out of 12. You failed :(", correctAmt);
                              }
               break;
               case 3 : 
               case 4 : 
                            System.out.printf("    |");
                            for (increase = 1; increase <= MAXIMUMQUIZVALUE; increase++)
                             {
                                 System.out.printf("%4d", increase);
                             }
                            System.out.println();
                            System.out.printf("----+");
                            for(increase = 1; increase <= MAXIMUMQUIZVALUE; increase++)
                            {
                                 System.out.printf("----");
                            }
                            System.out.println();
                            for (increase = 1; increase <= MAXIMUMQUIZVALUE; increase++)
                            {
                                  System.out.printf("%4d|", increase);
                                  if(userInput == 3)
                                  {
                                    for(int count = 1; count <= MAXIMUMQUIZVALUE; count++)
                                    {
                                  
                                        System.out.printf("%4d",(count + increase));         
                                    }      
                                  System.out.println();
                                 
                                }else if (userInput == 4)
                                {
                                     for(int count = 1; count <= MAXIMUMQUIZVALUE; count++)
                                     {                 
                                        System.out.printf("%4d", (count * increase));
                                     }
                                     System.out.println();
                                }   
                            }
               break;
               case 5 : keepGoing = false; 
                        break;
               default :System.out.println();
                        System.out.println("Invalid choice");
                        System.out.println();
           }
           } while(keepGoing == true);
           System.out.println();
           System.out.println("Thank you for using Benjamin Howard's arithmetic quiz program");
        
       
    }
}
