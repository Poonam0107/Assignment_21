package Assignment21;

public class MoodAnalyzer {
	public static void welcome()
	{
		System.out.println("Welcome to Mood Analayzer");
		System.out.println("=========================");
	}
	public String analyseMood(String message)
	{
		if(message.contains("SAD"))
			return "SAD";
		else
			return "HAPPY";
	}

}
