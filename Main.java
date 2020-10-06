import java.util.Scanner;

/**
 *This program asks the user for a number than counts up to that number on a single line
 * @author Zachary Balean 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //asks user to input the number
    System.out.println("Please enter a positive integer");
    //int for users number
    int usersNumber = input.nextInt();
  

    //for loop that will count up to users number and creats count int
    for(int count = 1; count <= usersNumber; count++){
      //prints count on one line for no comma
      if(count == usersNumber){
        System.out.print(count);
        //prints count of ot needs a comma
      }else{
        System.out.print(count + ", ");
      }
    }
    
  }
}
