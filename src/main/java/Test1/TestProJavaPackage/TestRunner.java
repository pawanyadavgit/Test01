package Test1.TestProJavaPackage;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	  JUnit2Test.class	  
	})
public class TestRunner
{	
//    public static void main( String[] args )
//    {        
//    	System.out.println("Running tests-->");
//        Result result = JUnitCore.runClasses(JUnit2Test.class);
//        System.out.println("No of failed tests-->"+result.getFailureCount());
//        
//    }
}
