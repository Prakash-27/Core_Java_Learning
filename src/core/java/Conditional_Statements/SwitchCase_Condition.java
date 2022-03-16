package core.java.Conditional_Statements;

public class SwitchCase_Condition {
             //SuperVillainOrNot
	
	String Villain = "Thanos";
	
	public void VillainOrNot() {
		switch (Villain) {
		case "Loki":
			System.out.println("Loki is a Super Villain");
			break;
		case "Black Panther":
			System.out.println("Black Panther is a Super Villain");
			break;
		case "X-Men":
			System.out.println("X-Men is a Super Villain");
			break;
		case "Thanos":	
			System.out.println("Thanos is a Super Villain");
			break;
			
		default:
			System.out.println(Villain + "is not a Super Villain");
		}
	}
	
	public static void main(String[] args) {
		SwitchCase_Condition villain = new SwitchCase_Condition();
		villain.VillainOrNot();
	}

}
