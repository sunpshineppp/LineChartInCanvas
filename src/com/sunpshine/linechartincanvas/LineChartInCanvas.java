package com.sunpshine.linechartincanvas;


import android.os.Bundle;
import android.app.Activity;

//LineChartInCanvas
//step 0 : draw x-axis, y-axis
//step 1 : draw round points on specific x,y position
//step 2 : draw a line to connect those points
//step 3 : use database to change points, and effect line.
//step 4 : let chart use Y-money, X-date
//step 5 : let X-date can go infinite future
//step 6 : use calculation to get future data
//step 7 : combine calculation and database
//test
//finish

public class LineChartInCanvas extends Activity {
	
	CreateLineChart newChart;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		newChart = new CreateLineChart(this);
		setContentView(newChart);
		
	}

	

}
