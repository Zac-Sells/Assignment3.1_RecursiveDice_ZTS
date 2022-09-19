import java.util.Random;
import java.util.ArrayList;
/**
 * RecDieRoller is a class designed to simulate a die rolling with the purpose of landing on a 2. 
 *
 * @author sells
 *
 */
public class RecDieRoller {
/**
 * Creates random and variables 
 */
	 Random r = new Random();
	 int count = 0;
/**
 * 	Initial roll function rolls a die until it lands on 2  
 * @return
 */
	 public int roll(){
		 int faceUp; 
		 faceUp = r.nextInt(6) + 1;
		 if(faceUp != 2) {
			 System.out.println(faceUp);
			  roll();
			 }
		 else 
		 System.out.println(faceUp);
		return faceUp; 
	 }
/**
 * 	 creates variables 
 */
	 int numRoll;
	 int num;
	 int avg;
	 int totalTwo;
	 ArrayList<Integer> num1 = new ArrayList();
/**
 * 	
 * @param numRoll pass in the number of times you would like to roll the die 
 * @return
 * this method counts how many rolls it takes to roll a two, how many total 2s are rolled, and the average number of rolls it takes to roll a 2. 
 */
	 public int roll2(int numRoll){
		 int faceUp = 0; 
		 this.numRoll=numRoll;
		 for(int i=0;i<numRoll;i++) {
			 faceUp = r.nextInt(6)+1;
			 System.out.println(faceUp);
			 count++;
			 num++;
			 if(faceUp==2) {
					 num1.add(count);
				num++;	 
				 System.out.println("!"+count+"!");
				count=0;
			 }
	 }
		 totalTwo=num-1000;
		 System.out.println((totalTwo) + " Total number of times a 2 was rolled");
		 //System.out.println(num1);
		 int sum = 0;
		 for (int number : num1){
			    sum += number;
		 }    
		 avg = (sum / totalTwo);
		 System.out.println(avg + " The average number of rolls it takes to roll a 2");	    
    
		 return faceUp;
	 
	 }
	 
}
	 

