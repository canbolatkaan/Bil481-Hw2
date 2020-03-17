package demo.junit_class_demo.grades;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;
public class ChartIOTest {
	
	demo.junit_class_demo.grades.ChartIO io = new demo.junit_class_demo.grades.ChartIO();
	@Test
	public void test_readFile_happyPath() {
		io.readFile("src/main/resources/grades.txt");
	}
	
	@Test 
	public void test_readFile_SadPath() {
		
	}
	
	
}
