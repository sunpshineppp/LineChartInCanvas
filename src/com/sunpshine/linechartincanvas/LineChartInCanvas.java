package com.sunpshine.linechartincanvas;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

//LineChartInCanvas
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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.line_chart_in_canvas);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.line_chart_in_canvas, menu);
		return true;
	}

}
