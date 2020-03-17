package demo.junit_class_demo.grades;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import static org.mockito.Mockito.*;
import demo.junit_class_demo.grades.ChartIO;
import org.jfree.chart.JFreeChart;
import demo.junit_class_demo.grades.HistogramGenerator;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class HistogramGeneratorTes {
	@Mock
	ChartIO io;
	@InjectMocks
	HistogramGenerator hg;

	public HistogramGeneratorTes(){
		ChartIO io=new ChartIO();
		HistogramGenerator hg=new HistogramGenerator(io);
	}
	@Test
	public void test_generate_normal() {




	}

}
