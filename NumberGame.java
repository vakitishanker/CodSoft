import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;
class NumberGame{
    public static void main(String args[]) throws InterruptedException{
        Random rm = new Random();                                                                            
        int n=5;
        String pa;
        boolean flag = true;
        int score=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("you have 5 chances to guess the correct number,'good luck'");
        System.out.println("Starting game..........");
        Thread.sleep(2000);
        while(flag){
            int number= rm.nextInt(100)+1;
            // printing the random number 
            System.out.println(number);
            while(n>0){
                    System.out.println("number of choiecs left"+n);
                    System.out.println("Enter your guess:");
                    int ug = sc.nextInt();
                    if(ug == number){
                    System.out.println("you won");
                    n=0; 
                    score++;
                    System.out.println("your score="+score);
                    }
                    else if (ug > number){
                        System.out.println("to heigh");
                    }
                    else if(ug < number){
                        System.out.println("to low");
                    } 
                    
                n=n-1; 
            } 
            if(n==0){
                        System.out.println("you loose"); 
                        System.out.println("your score is:"+score);
                    }
                //continu the game or not 
                System.out.println("do you want to play again(yes/no)");
                Scanner scc = new Scanner(System.in);
                pa = scc.nextLine().toLowerCase();
                if(!pa.equals("yes")){
                    System.out.println("your final score is:"+score);
                    flag = false;
                }
                else{
                    n=5;
                }
        }    
    }
}
