package com.example.projectn2;

import com.example.projectn.R;
import com.example.projectn.R.layout;
import com.example.projectn.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class alfal extends Activity {

  @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alfal);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_projectn, menu);
		return true;
	}
	public void click(View v)
	{
		startActivity(new Intent("android.intent.action.MAINF" ));
	}
	
}
