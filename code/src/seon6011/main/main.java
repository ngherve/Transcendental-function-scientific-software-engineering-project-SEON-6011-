package seon6011.main;

/**
 * @author Herve
 *
 */
public class main {
	
	
	/**
	 * @param args Commnd line arguments
	 * @throws Exception arithmetic exception erro
	 */
	public static void main(String[] args) throws Exception {
		System.out.println(calculate(2, E, EXPANSION));
	}
		
	/**
	 * Calculate absolute value of an integer.
		///FOR TESTING
	 * @param value double value
	 * @return absolute value of value, double type
	 */
	public static double abs(double value) {
		if (value < 0) value = -value;
		return value;
	}
	/*
	 * Calculate the value of e^value (Exponential function) using Taylor series expansion.
		///FOR TESTING
	 * @param value exponent number,double type
	 * @param nterms the number of Taylor expansions,integer type
	 * @return e^value double type
	 */
	 public static double ex(double value, int nterms) {
		 double result = 1.0;
		 double tmp = 1;
		 for (int i = 1; i <= nterms; i++) {
			 tmp *= i;
			 result += power(value, i) / tmp;
		 }
		 return result;
	 }
	 

		
	 /** The Constant E. */
	 public static final double E = 2.7182818284590451;
	
	 /** The Constant EXPANSION. */
	 public static final int EXPANSION = 60; // default Taylor expansion times

	 /** The Constant LN2. */
	 public static final double LN2 = 0.6931471805599453; // value of ln(2)
	 
	 /*
	  * Calculate the value of a*(b^value).
	  *
	  * @param a double type
	  * @param b base number,double type
	  * @param value exponent number,double type
	  * @return a*(b^value) double type
	  * @throws Exception the exception
	  */
	 public static double calculate(double a, double b, double value) throws Exception {
		 if (a == 0) {
			 return 0;
		 }
		 return a * power(b, value);
	 }
	 
	
	 /**
	  * 
	  * calculating the power of a number a^value
	  * @param value the given base number, a
	  * @param power the exponent, value base of the base
	  */
	 public static double power(double a, int value) {
		 if (value == 0) return 1.0;
		 if (a == 0) return 0.0;
		 int b = value;
		 if (b < 0) b = -b;

		 double r = a;
		 double y = 1;
		 
		 while (b > 0) {
			 if (b % 2 == 0) {
				 b = b / 2;
				 r = r * r;
			 } else {
				 b = b - 1;
				 y = y * r;
		     }
		 }
		 if (value < 0) {
			 return 1 / y;
		 } else {
			 return y;
		 }
	 }

	 /**
	  * Calculate the value of a^value.According to a^value=e^(value*ln(a))
	  *
	  * @param a base number,double type
	  * @param value exponent number,double type
	  * @return a^value double type
	  * @throws Exception the exception
	  */
	 public static double power(double a, double value) throws Exception {
		 if (value == 0) return 1.0;
		 if (a == 0) return 0.0;
		 double exp = value * ln(a); // If the value of exp is large, substituting exp into the function
		 // ex may cause the calculation to overflow.
		 int integer = (int) exp;
		 double decimal = exp - integer;
		 double result = power(E, integer) * ex(decimal, EXPANSION);
		 return result;
	 }
	
	 
	 /**
	  * Calculate the value of ln(value).
	  *
	  * @param value double type
	  * @return ln(value) double type
	  * @throws Exception the exception
	  */
	 public static double ln(double value) throws Exception {
		 if (value <= 0) {
			 throw new Exception("math range error");
		 }
		 double result = 0.0;
		 while (value > 2) {
			 result += LN2;
			 value /= 2;
		 }
		 result += lnBase(value, EXPANSION);
		 return result;
	 }
	 
	 /*
	  * Ln base.
	  *
	  * @param value domain is (0,2],double type
	  * @param nterms the number of Taylor expansions,integer type
	  * @return ln(value) double type
	  */
	 public static double lnBase(double value, int nterms) {
		 value -= 1;
		 int factor = 1;
		 double result = 0.0;
		 for (int i = 1; i <= nterms; i++) {
			 result += factor * power(value, i) / i;
			 factor = -factor;
		 }
		 return result;
	 }
	
}
