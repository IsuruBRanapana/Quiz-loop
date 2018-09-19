import java.util.Scanner;
public class QuizLoop{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter how many questions you want :- ");
		int numofq=input.nextInt();
		long starttime=System.currentTimeMillis();
		int count=0;
		String output=" ";
		int correct=0;

		while(count<numofq){
			int number1=(int)(Math.random()*10);
			int number2=(int)(Math.random()*10);

			//swap
			if(number1<number2){
				int temp=number1;
				number1=number2;
				number2=temp;
			}

			System.out.print(number1+" - "+number2+" = ");
			int answer=input.nextInt();
			if(number1-number2!=answer){
				System.out.println("you are wrong\n");
			}else{
				System.out.println("you are correct\n");
				correct++;
			}
			count++;
			output+="\n"+number1+" - "+number2+" = " + answer + ((number1-number2==answer)?" correct":" wrong");
		}
		long endtime=System.currentTimeMillis();
		long testtime=endtime-starttime;

		System.out.println("You have "+correct+" correct answers ,\n you take "+(testtime/1000)+" Seconds\n"+output);
	}
}