package Test1.TestPro;

public class TestCon {	
	
	public TestCon(Object obj)
	{
		System.out.println("In object");
	}
	
	public TestCon(String str)
	{
		System.out.println("In string");
	}
	
//	public TestCon(Integer int1)
//	{
//		System.out.println("In intrger");
//	}
	

	public static void main(String[] args) {
		
		
		TestCon t1 = new TestCon(null);
		
	}

}
