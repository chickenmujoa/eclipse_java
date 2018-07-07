
public class Card {
	
	String kind;				// object variable
	int number;					// object variable
	static int width = 100;		// class variable
	static int height = 250;	// class variable
	
	public static void main(String[] args) {
		/**
		 * You can use class variables by writing "class name.variable"
		 */
		System.out.println("Weight of the card is: " + Card.width);
		System.out.println("Height of the card is: " + Card.height);
		
		Card c1 = new Card();
		
		/**
		 * "kind" and "number" are object variable. In order to use them, first, you have to make object of "Card" class
		 */
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1 card is " + c1.kind + " " + c1.number + " and " + "(" + Card.width + "," + Card.height + ")");
		System.out.println("c2 card is " + c2.kind + " " + c2.number + " and " + "(" + Card.width + "," + Card.height + ")");
		
		Card.width = 200;
		Card.height = 300;
		
		System.out.println("c1 card is " + c1.kind + " " + c1.number + " and " + "(" + Card.width + "," + Card.height + ")");
		System.out.println("c2 card is " + c2.kind + " " + c2.number + " and " + "(" + Card.width + "," + Card.height + ")");
	}
}
