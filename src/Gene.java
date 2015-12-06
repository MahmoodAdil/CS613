import java.util.Random;
/**
*	This class models a gene
**/
class Gene{
	static final char[] letters = {'a','t','g','c'};
	Random rand = new Random();//create a instance
	char[]	code;
	
	Gene(){
		//use java.util.Random(int)
		//to generate a number that I can use a random index int
		code = new char[4];
		
		for(int i=0; i<code.length; i++){
			//conversion from int to char
			code[i] = letters[rand.nextInt(letters.length)];
		}
		
		
	}
	
	public String toString(){
		return String.valueOf(code);
	}
	
	public static void main(String[] args){
		Gene x;
		for(int i=0; i<4; i++){
			x = new Gene();
			System.out.println(x);
		}

		
	}
}