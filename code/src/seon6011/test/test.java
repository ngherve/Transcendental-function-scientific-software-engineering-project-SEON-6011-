package seon6011.test;

import seon6011.main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class test {

	
	
	/** Test exponential function calcValue=e^x. */
	@Test
	public void testEx() {
		double calcValue = main.ex(2.4, 20);
		double actualValue = 11.0231763;
	    assertTrue(main.abs(calcValue - actualValue) < seon6011.main.main.EPSILON);
	}
			
	/** Test function lnBase. */
	@Test
	public void testLnBase() {
		double calcValue = main.lnBase(0.6, 20);
	    double actualValue = -0.5108256;
	    assertTrue(main.abs(calcValue - actualValue) < seon6011.main.main.EPSILON);
	}
	
	/**
	 * Test function ln.
	 * @throws Exception the exception
	 */
	@Test
	public void testLn() throws Exception {
		double calcValue = main.ln(10.6);
	    double actualValue = 2.3608540;
	    assertTrue(main.abs(calcValue - actualValue) < seon6011.main.main.EPSILON);
	}
	
	/** Test function power(double a,int x). */
	@Test
	public void testIntPower() {
		double calcValue = main.power(1.6, 7);
	    double actualValue = 26.8435456;
	    assertTrue(main.abs(calcValue - actualValue) < seon6011.main.main.EPSILON);
	}
	
	/**
	 * Test function power(double a,double x).
	 * @throws Exception the exception
	 */
	@Test
	public void testDecimalPower() throws Exception {
		double calcValue = main.power(5.6, 7.5);
	    double actualValue = 408705.2369134;
	    assertTrue(main.abs(calcValue - actualValue) < seon6011.main.main.EPSILON);
	}
	
	/**
	 * Set a=0, output is 0. When x=0, output is a
	 * @throws Exception the exception
	 */
	@Test
	public void testF5() throws Exception {
		double calcValue = main.calculate(0, 19, 2);
	    double actualValue = 0;
	    assertTrue(calcValue == actualValue);
	    calcValue = main.calculate(2, 10, 0);
	    actualValue = 2;
	    assertTrue(calcValue == actualValue);
	}
	
	/**
	 * Test f5 with positive exponent.
	 * @throws Exception the exception
	 */
	@Test
	public void testF5PositiveX() throws Exception {
		double calcValue = main.calculate(1.0, 3.4, 5.6);
	    double actualValue = 946.8516393;
	    System.out.println(calcValue);
	    assertTrue(main.abs(calcValue - actualValue) < seon6011.main.main.EPSILON);
	}
	
	/**
	 * Test f5 with negative exponent.
	 * @throws Exception the exception
	 */
	@Test
	public void testF5NegativeX() throws Exception {
		double calcValue = main.calculate(2.0, 3.4, -5.6);
	    double actualValue = 0.0021122;
	    assertTrue(main.abs(calcValue - actualValue) < seon6011.main.main.EPSILON);
	}
}
