package Test1.TestProJavaPackage;

public class TestException {

	void testMethod(int a) throws myCustomException
	{
		if(a<10)
			throw new myCustomException("Lower than 10");
		else
			System.out.println("Pass");
	}
	
	public static void main(String[] args) {
		
		TestException obj = new TestException();
		try {
			obj.testMethod(7);
		} catch (myCustomException e) {
			System.out.println("Exception is : "+e);
		}
	}

}

class myCustomException extends Exception
{
	myCustomException(String s)
	{
		super(s);
	}
}