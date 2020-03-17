package demo.junit_class_demo.math;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import demo.junit_class_demo.math.MyMath;
import demo.junit_class_demo.math.MyAdvancedMath;


import org.junit.Assert;

/**
 * A test class that implements a Parameterized test
 * for the MyAdvancedMath powerOfTwo method, 
 * for demonstrating Unit Testing.
 */
@RunWith(Parameterized.class)
public class MyAdvancedMathTest_PowerOfTwo_ParameterizedTest {
	
	// the value is the id of each parameter
	@Parameter (value = 0) 
	public int power;
	@Parameter (value = 1) //Or just @Parameter(1)
	public int result;
	
	MyAdvancedMath mam = new MyAdvancedMath();
	MyMath mm= new MyMath();
	/*
	 * The following method generates the input values 
	 * for the tests. 
	 */
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{3,4},{3,3},{4,3}};
		
		return Arrays.asList(data);
	}
	
	/*
	 * A unit test that is executed for each pair of 
	 * parameters. 
	 */
	@Test
	public void testPowerOfTwoWithNormalCases() {
		mam.powerOfTwo(0);
			mam.add(5,6);
			int a[]={1,2,4,5};
			mam.reverseArray(a,(MyMath) mm);

	}
	@Test(expected = IllegalArgumentException.class)
	public void testAdd(){
		mam.add(3,Integer.MAX_VALUE-1);


	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddNegatif(){
		mam.add(-5,-2);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testPower(){
		mam.powerOfTwo(31);
	}

}

