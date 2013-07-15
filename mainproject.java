package com.example.projectn;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Projectn extends Activity {


  @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_projectn);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_projectn, menu);
		return true;
	}
	public void click2(View v)
	{
		setContentView(R.layout.fruit);
	}
	public void click1(View v)
	{
		setContentView(R.layout.fru);
	}
	
}
