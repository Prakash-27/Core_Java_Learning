package core.java.Exception_Handling;

public class TryCatchFinallyImportantConcepts {

	public static int dummy() {

		return 3;
	}

	public static void main(String[] args) {

		try {
			System.out.println(TryCatchFinallyImportantConcepts.dummy());
			System.out.println("Inside try Block.");
			System.exit(0);
			// After System.exit(0); the program will not run because its will exit. that
			// how this method is used.
		} catch (Exception e) {
			System.out.println("Inside catch Block");
		} finally {
			System.out.println("Inside Finally Block.");
		}

		System.out.println("-----------------------------------------------");

		try {
			System.out.println("Inside try Block.");
			throw new Exception();
			// System.out.println();
			// we can't use any line of code after throw new Exception();
			// that what System.out.println(); is giving error.
		} catch (Exception e) {
			System.out.println("Inside catch Block");
		} finally {
			System.out.println("Inside Finally Block.");
		}

		System.out.println("-----------------------------------------------");

		try {
			System.out.println("Inside try Block.");
			System.out.println(2 / 0);
			System.out.println("After Exception");
		} catch (Exception e) {
			System.out.println("Inside catch Block");
		} finally {
			System.out.println("Inside Finally Block.");
		}

		System.out.println("-----------------------------------------------");

		try {
			System.out.println("Inside try Block.");
			System.out.println(TryCatchFinallyImportantConcepts.dummy());
			System.out.println("After Exception");
		} catch (Exception e) {
			System.out.println("Inside catch Block");
		} finally {
			System.out.println("Inside Finally Block.");
		}

	}

}
