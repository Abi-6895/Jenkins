import static org.junit.Assert.*;


import org.junit.Test;

public class CalculateTest {

	


	@Test
	public void CalculateTest() 
	{
		Calculate obj = new Calculate();
		int result = obj.add(10, 20);
		assertEquals(30,result);
		
	}

}
