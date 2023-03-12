package Assignment21;

import static org.junit.Assert.*;

import org.junit.Test;

import com.moodanalyzer.MoodAnalyzer;

import junit.framework.Assert;

public class MoodAnalyzerTest {

	@Test
	
		public void testMoodAnalyse()
		{
			MoodAnalyzer md = new MoodAnalyzer();
			String mood = md. analyseMood("This is SAD message");
			Assert.assertEquals("SAD",mood);
		}
		
		
		public void testHappyMood()
		{
			MoodAnalyzer md = new MoodAnalyzer();
			String mood = md.analyseMood("This is HAPPY message");
			Assert.assertEquals("HAPPY", mood);
		
	}
		

}
