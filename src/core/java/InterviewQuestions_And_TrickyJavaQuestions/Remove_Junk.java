package core.java.InterviewQuestions_And_TrickyJavaQuestions;

public class Remove_Junk {

	public static void main(String[] args) {

		String s = "拉杰什瓦尔 Welcome 拉杰什瓦尔 to 拉杰什瓦尔 Automation 拉杰什瓦尔 2022";
		String s1 = "拉杰什瓦尔 Selenium 拉杰什瓦尔 testing 拉杰什瓦尔 By Java 拉杰什瓦尔 2022";
		
		//Regular Expression: [^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
	}

}
