package demo.junit_class_demo.grades;

import org.junit.Test;
import static org.mockito.Mockito.*;
import demo.junit_class_demo.grades.HistogramGenerator;
import demo.junit_class_demo.grades.HistogramMain;
import demo.junit_class_demo.grades.ChartIO;
import org.jfree.chart.JFreeChart;

public class HistogramGeneratorTes {

	HistogramMain hm=new HistogramMain();
	ChartIO io = new ChartIO();
	HistogramGenerator hg= new HistogramGenerator((ChartIO) io);

	@Test
	public void test_generate_normal() {
		int a[]={1,2,3,4};
		hg.createChart(a);
		
	}
	
}
