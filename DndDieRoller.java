import java.util.Random;
import java.util.Arrays;

public class DndDieRoller {

	//attributes
	private int dieSides;
	private int[] values;
	private int rollValue;
	 
	//constructor
	public DndDieRoller(int dieSides) {
		this.dieSides=dieSides;
		
	}
	
	public int roll(int numRolls) {
		
		values = new int[numRolls];
		Random roll = new Random();
		rollValue = 0;
		
		for(int i=0; i<numRolls; i++) {
			values[i]= roll.nextInt(dieSides)+1;
			rollValue = rollValue+values[i];
		}
		Arrays.sort(values);
		
		return rollValue;
	}
	
	public int roll() {
		roll(1);
		
		return rollValue;
	}
	
	public int advantage() {
		
		roll(2);
		rollValue = rollValue-values[0];
		
		return rollValue;
	}
	
	public int disadvantage() {
		
	roll(2);
	rollValue = rollValue-values[1];
	
	return rollValue;
	}
	
	public int statRoll() {
		roll(4);
		rollValue = rollValue-values[3];
		
		return rollValue;
	}
	
	public int getDieSides() {
		return dieSides;
	}
	
	public void setDieSides(int dieSides) {
		this.dieSides=dieSides;
	}
	
	public int getRollValue() {
		return rollValue;
	}
	
	public String valueString() {
		String str = "the rolls were: ";
		for(int i=0; i<values.length; i++) {
			str = str+values[i]+", ";
		}
		return str;
	}
	
	public String toString() {
		return "This is a "+dieSides+" sided die.";
	}
}
