import java.util.Scanner;
import java.util.Random;

public class rannum2{

	public static String bal(int x,int comnum){
	 if (x>comnum){
	 return "lower,try again:";
	 }else if (x<comnum){
	 return "higher,try again:";
	 }else{
	 return "win";
	 }
	 
	
	}
	







	public static void main(String[] args){
		Scanner in= new Scanner (System.in);
				        Random random = new Random();
				int comnum = random.nextInt(100) + 1;
				
				System.out.print("Guess what number i'm thinking of:"+comnum);
				int guess=in.nextInt();
				int diff=guess-comnum;
				String print = bal(guess,comnum);
				System.out.print(print);
				
				if (guess!=comnum){
				int guess2=in.nextInt();
				String print2 = bal(guess2,comnum);
				System.out.print(print2);
				if (guess2!=comnum){
				int guess3=in.nextInt();
				String print3 = bal(guess3,comnum);
				if (guess3!=comnum){
				System.out.print("You lose, the number is:"+comnum);
			}else{
				System.out.print("You guessed correctly");
			}
			}
			}

	}
	
	
}
