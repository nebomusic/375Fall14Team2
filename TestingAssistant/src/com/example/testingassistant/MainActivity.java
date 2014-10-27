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
	private TextView txtFirstName
	private TextView txtLastName
	private TextView txtStudentId
	private TextView txtTeacher
	private Spinner Subject
	private Spinner Type
	private TextView txtEmail
	private Button btn15
	private Button btn30
	private Button btn55
	private Button btn115
	private Button btn130
	private Button btn155
	private Button btnStart
	
	//Proctor Screen
	private ListView lstStudents
	private ListView lstTests
	private Button btnHome

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Bind Here: 
		btnStudent = (Button)findViewById(R.id.btnStudent);
		txtWelcome = (TextView)findViewById(R.id.txtWelcome);
		txtInstructions = (TextView)findViewById(R.id.txtInstructions);
		txtVersion = (TextView)findViewById(R.id.txtVersion);
		btnProctor = (Button)findViewById(R.id.btnProctor);
		btnStandBy = (Button)findViewById(R.id.btnStandBy);
		txtFirstName = (TextView)findViewById(R.id.txtFirstName);
		txtLastName = (TextView)findViewById(R.id.txtLastName);
		txtStudentId = (TextView)findViewById(R.id.txtStudentId);
		txtTeacher = (TextView)findViewById(R.id.txtTeacher);
		SpinnerType = (Spinner)findViewById(R.id.SpinnerType);
		SpinnerSubject = (Spinner)findViewById(R.id.SpinnerSubject);
		txtEmail = (TextView)findViewById(R.id.txtEmail);
		btn15 = (Button)findViewById(R.id.btn15);
		btn30 = (Button)findViewById(R.id.btn30);
		btn55 = (Button)findViewById(R.id.btn55);
		btn115 = (Button)findViewById(R.id.btn115);
		btn130 = (Button)findViewById(R.id.btn130);
		btn155 = (Button)findViewById(R.id.btn155);
		btnStart = (Button)findViewById(R.id.btnStart)
		lstStudents = (ListView)findViewById(R.id.lstStudents);
		lstTests = (ListView)findViewById(R.id.lstTests);
		btnHome = (Button)findViewById(R.id.btnHome);
		
		
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
