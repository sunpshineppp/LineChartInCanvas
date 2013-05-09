package com.sunpshine.linechartincanvas;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

@SuppressLint("DrawAllocation")
public class CreateLineChart extends View{
	
	int x0;
	int y0;
	int xEnd;
	int yEnd;

	public CreateLineChart(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		
		
	}
	
	@SuppressLint("DrawAllocation")
	protected void onDraw(Canvas canvas) {
		
		super.onDraw(canvas);
		
		canvas.drawColor(Color.BLACK);
		
		x0=(canvas.getWidth())/10;
		y0=(canvas.getHeight())/10*9;
		xEnd=canvas.getWidth();
		yEnd=0+(canvas.getHeight()/10);
		
		// draw x axis
		Rect x_axis = new Rect();
		x_axis.set(x0,y0,xEnd,y0+5);
		Paint x_axis_color = new Paint();
		x_axis_color.setColor(Color.RED);
		canvas.drawRect(x_axis,x_axis_color);
		
		// draw y axis
		Rect y_axis = new Rect();
		y_axis.set(x0,yEnd,x0+5,y0);
		Paint y_axis_color = new Paint();
		y_axis_color.setColor(Color.BLUE);
		canvas.drawRect(y_axis,y_axis_color);
		
		// draw data
		Paint point_color = new Paint();
		point_color.setColor(Color.GREEN);
		
		canvas.drawCircle(x0, y0, 3, point_color);
		canvas.drawCircle(x0+10, y0-260, 3, point_color);
		canvas.drawCircle(x0+20, y0-290, 3, point_color);
		canvas.drawCircle(x0+30, y0-240, 3, point_color);
		canvas.drawCircle(x0+40, y0-120, 3, point_color);
		canvas.drawCircle(x0+50, y0-130, 3, point_color);
		canvas.drawCircle(x0+60, y0-80, 3, point_color);
		canvas.drawCircle(x0+70, y0-50, 3, point_color);
		canvas.drawCircle(x0+80, y0-450, 3, point_color);
		
		
		// start draw
		invalidate();
		
	}
	
	

	

}
