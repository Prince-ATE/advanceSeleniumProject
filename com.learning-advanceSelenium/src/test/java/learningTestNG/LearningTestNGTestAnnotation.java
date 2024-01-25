package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningTestNGTestAnnotation {

	
	@Test
	public void test() {
		
		Reporter.log("This is my first testNG test", true);
		
	}
}
