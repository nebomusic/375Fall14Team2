package com.example.testingassistant;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	// Hey John,
	// Go ahead and declare the fields for all of the XML objects. To do this, Just look at the designs (UI's) that are
	// in the testing center folder in github and follow the example below for all of the buttons, text objects, and list views.
	// Also, go ahead and bind all of the xml objects in the on create.
	// Good Luck!
	// Make sure to git add, git commit, git push, and git pull!
	
	
	//Put Fields Here.Break up by students, tests, Testing Center
	
	// Main Activity - Complete (I have already added all of the objects for the main activity)
	
	private TextView txtWelcome;
	private TextView txtVersion;
	private TextView txtInstructions;
	private Button btnStudent;
	private Button btnProctor;
	private Button btnStandBy;
	
	//Students Class
	
	//Test Class
	
	//Testomg Center Class

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Bind Here: 
		btnStudent = (Button)findViewById(R.id.btnStudent);
		txtWelcome = (TextView)findViewById(R.id.txtWelcome);
		txtInstructions = (TextView)findViewById(R.id.txtInstructions);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
