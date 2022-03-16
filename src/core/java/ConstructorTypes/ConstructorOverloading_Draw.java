package core.java.ConstructorTypes;

public class ConstructorOverloading_Draw {

	String Draw;
	static ConstructorOverloading_Draw draw;

	public ConstructorOverloading_Draw() {
		System.out.println("Draw object created");
	}

	public ConstructorOverloading_Draw(String todraw) {
		Draw = todraw;
		System.out.println("Drawing " + todraw);
	}

	public static void main(String[] args) {

		draw = new ConstructorOverloading_Draw();
		draw = new ConstructorOverloading_Draw("Hexagon");

	}

}
