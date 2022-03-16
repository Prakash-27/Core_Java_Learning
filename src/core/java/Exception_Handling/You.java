package core.java.Exception_Handling;

public class You {

	
	 /* On a fine Evening, a guy is giving weird faces to his upset friend when he is
	 * at the balcony to make his laugh. Suddenly his Mother noticed this and coming
	 * to Scholed the Friend.*/
	
	public void makeyourFriendLaugh() {
		
		try {
			throw new MotherIntteruptedException("Mother is coming to Scholed you.");
		}catch (MotherIntteruptedException e) {
			//e.printStackTrace();
			System.out.println("your friend: Dude give this pose da.");
			System.out.println("and you are acting like you posing for Instagram");
		}
		
	}
	
	public static void main(String[] args) {

		You you = new You();
		you.makeyourFriendLaugh();
		
		
	}

}
