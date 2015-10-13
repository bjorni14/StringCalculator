package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

    //1
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	//2
	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	//3
	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	//4
	@Test
    public void testMultipleNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }

    //5
    @Test
    public void testNewLine(){
    	assertEquals(6, Calculator.add("1,2\n3")); 
    }

    /*//6
    @Test
    public void testDiffDelimeter(){
    	assertEquals(5, Calculator.add("//;2\n3")); 
    }*/

    //7
    @Test
    public void testNegativNumber()
    {
    	try
    	{
    		Calculator.add("2,-2,6,-5");
    	}
    	catch (RuntimeException ex)
    	{
    		assertEquals("Negatives not allowed: -2,-5", ex.getMessage());
    	}
    }

}