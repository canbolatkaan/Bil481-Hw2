package demo.junit_class_demo.grades;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;

import demo.junit_class_demo.grades.ChartIO;
import org.jfree.chart.JFreeChart;

public class ChartIOTest {
	
	ChartIO io = new ChartIO();
	XYSeriesCollection dataset = new XYSeriesCollection();
	JFreeChart chart = ChartFactory.createXYLineChart("Grades' Frequency", "grade", "frequency", dataset,
			PlotOrientation.VERTICAL, false,false,false);
	@Test
	public void test_readFile_happyPath() {
		io.readFile("src/main/resources/grades.txt");

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_readFile_SadPath() {
		io.readFile("src/main/resources/grames.txt");

	}
	@Test(expected = NumberFormatException.class)
	public void test_readFile_SadPathNumber() {
		io.readFile("src/main/resources/grades1.txt");

	}
	@Test
	public void test_writeFile(){
		io.writeFile("src/main/resources/",(JFreeChart) chart);
	}
	
	
}
