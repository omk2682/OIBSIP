//======================================================================================================================================================

/*
**************************

                          OASIS INFOBYTE  
                    JAVA DEVELOPEMENT INTERNSHIP
					    Om Kardile 
                   NBN Singad School Of Engineering
					          TASK #1

***************************      
 */
//======================================================================================================================================================
import java.util.Random;
import java.util.Scanner;
//======================================================================================================================================================

class game {
    int flag=0;
    Random rand = new Random();
    private int compno, inp;
    private int noOf = 10;
    //------------------------------------------------------------------------------------------------------------------------------------------
    public game() {
        //compno = rand.nextInt(100);
        compno = 22;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------

    public void takeUserInput(int inpu) {
        this.inp = inpu;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------

    public String iscorrectnumber() {
        return "*Congratulations!!* \n You Guess Right Number !!";
    }
    //------------------------------------------------------------------------------------------------------------------------------------------

    public void noOfguesses() {

        if (inp == compno) {
            System.out.println(iscorrectnumber());
            System.out.printf("Your Score is:%d", noOf);
            flag = 1;
        } else if (inp > compno) {
            System.out.println("**oops Sorry!! \nYour Guessed Number is Greater than Actual Number");
            
        } else {
            System.out.println("**oops Sorry!! \nYour Guessed Number is Less than Actual Number");
            
        }

    }
    public void summary(int attempt){
        if (flag == 1 &&  attempt == 10){
            System.out.println("Congratulations......!! Your were Succeeded ");
            System.out.println("We Wish you will play it again Thank you");
        }
        else if(flag ==0 && attempt == 10){
            System.out.println("OOPs......!! Your were Done With 10 Attempts ");
            System.out.println("We Wish you will play it again \n \t \tThank you");
        }
    }

}
//======================================================================================================================================================

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        game g = new game();
        
        System.out.println("************************");
        System.out.println("\t \t Let's Play a Game ,  \n\t \t GUESS THE NUMBER");
        System.out.println("Note:   > You will get 10 chances to guess the number ");
        //System.out.println("\t> You will get 10 chances to guess the number ");
        System.out.printf("\t> Guess Number in between 1-100 ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nEnter Your Guess: ");
            int choice = sc.nextInt();
            g.takeUserInput(choice);
            g.noOfguesses();
            System.out.printf("\nChances Attempted:%d \n", i+1 );
            g.summary(i+1);

        }
    }

}
//======================================================================================================================================================
