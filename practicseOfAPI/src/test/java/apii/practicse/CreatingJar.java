package apii.practicse;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class CreatingJar {

  
  @Test
	public void test() {
	      TestNG runner = new TestNG();
	      List<String> suitefiles = new ArrayList<String>();
			
			suitefiles.add(System.getProperty("user.dir")+"./testng.xml");
			
			runner.setTestSuites(suitefiles);
			
			runner.run();
	    }
}
