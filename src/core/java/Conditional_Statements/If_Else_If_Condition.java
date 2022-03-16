package core.java.Conditional_Statements;

public class If_Else_If_Condition {
	         //WhosTheHero

	String myHeroName = "Spider Man";
	String myheroName = "Captainamerica";

	public void SuperHeroGuesser() {
		if (myHeroName.equals("Spider Man" /* Black Panther */)) {
			System.out.println("You Thought about Spider Man");
			//System.out.println("You Thought about Black Panther");
		}else if(myHeroName.equals("Captain America")) {
			System.out.println("You Thought about Captain America");
		}else if(myheroName.equalsIgnoreCase("Captain America")) {
			System.out.println("You Thought about Captain America");
		}else if(myHeroName.equals("Doctor Strange")) {
			System.out.println("You Thought about Doctor Strange");
		}else if(myHeroName.equals("Thor")) {
			System.out.println("You Thought about Thor");
		}else {
			System.out.println("Sorry I Can't Guess!!!");
		}
	}

	public static void main(String[] args) {
		If_Else_If_Condition WhoseTheHero = new If_Else_If_Condition();
		WhoseTheHero.SuperHeroGuesser();
	}

}
