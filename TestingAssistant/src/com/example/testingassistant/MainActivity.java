package com.example.testingassistant;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Handler h;
	private int RATE = 60000;
	
	private TestingCenter testingCenter; 
	
	private TextView txtWelcome;
	private TextView txtVersion;
	private TextView txtInstructions;
	private Button btnStudent;
	private Button btnProctor;
	private Button btnStandBy;
	
	// Array Adaptor

	//Students Class
	private TextView txtFirstName;
	private TextView txtLastName;
	private TextView txtStudentId;
	private TextView txtTeacher;
	private Spinner subject;
	private Spinner type;
	private TextView txtEmail;
	private Button btn15;
	private Button btn30;
	private Button btn55;
	private Button btn115;
	private Button btn130;
	private Button btn155;
	private Button btnStart;
	
	//Proctor Screen
	private ListView lstActiveStudents;
	private ListView lstTimeRemaining;
	private Button btnHome;
	
	private Student currentStudent;
	private Test currentTest;
	
	private int elapsedtime;

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
		txtStudentId = (TextView)findViewById(R.id.txtStudentID);
		txtTeacher = (TextView)findViewById(R.id.txtTeacher);
		
		//Check Spinners
		type = (Spinner)findViewById(R.id.spinnerType);
		 subject = (Spinner)findViewById(R.id.spinnerSubject);
		 
		 
		txtEmail = (TextView)findViewById(R.id.txtEmail);
		btn15 = (Button)findViewById(R.id.btn15);
		btn30 = (Button)findViewById(R.id.btn30);
		btn55 = (Button)findViewById(R.id.btn55);
		btn115 = (Button)findViewById(R.id.btn115);
		btn130 = (Button)findViewById(R.id.btn130);
		btn155 = (Button)findViewById(R.id.btn155);
		btnStart = (Button)findViewById(R.id.btnStart);

	//	btnHome = (Button)findViewById(R.id.btnHome);

		

		elapsedtime = 0;
		h = new Handler ();
		count();
		
		//Start
		testingCenter= new TestingCenter(); 
		currentStudent = new Student();
		currentTest = new Test();
		//New Code
		
	}
	
	public void count(){
		elapsedtime ++;
		
		h.postDelayed(r,RATE);

		}
		private Runnable r = new Runnable(){
			@Override
			public void run() {
				count(); //call function
			}
	};

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
	
	
	public void btnStudentClicked (View V){
		
		setContentView(R.layout.screen_student);
		
		txtFirstName = (TextView)findViewById(R.id.txtFirstName);
		txtLastName = (TextView)findViewById(R.id.txtLastName);
		txtStudentId = (TextView)findViewById(R.id.txtStudentID);
		txtTeacher = (TextView)findViewById(R.id.txtTeacher);
		txtEmail = (TextView)findViewById(R.id.txtEmail); 
		
		//Check Spinners
		type = (Spinner)findViewById(R.id.spinnerType);
		 subject = (Spinner)findViewById(R.id.spinnerSubject);
		 
		btn15 = (Button)findViewById(R.id.btn15);
		btn30 = (Button)findViewById(R.id.btn30);
		btn55 = (Button)findViewById(R.id.btn55);
		btn115 = (Button)findViewById(R.id.btn115);
		btn130 = (Button)findViewById(R.id.btn130);
		btn155 = (Button)findViewById(R.id.btn155);
		btnStart = (Button)findViewById(R.id.btnStart);
		
	//Test Type Slider
	ArrayAdapter<CharSequence> typeadaptor = ArrayAdapter.createFromResource(this,R.array.type_array, android.R.layout.simple_spinner_dropdown_item);
	
		typeadaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		type.setAdapter(typeadaptor);		
		
		//Test Subject Slider
		ArrayAdapter<CharSequence>subjectadaptor = ArrayAdapter.createFromResource(this,R.array.subject_array, android.R.layout.simple_spinner_dropdown_item);
		
		subjectadaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
	subject.setAdapter(subjectadaptor);
		
	}
	//Error with the handle clicked. 
	public void btnProctorClicked (View v){
		setContentView(R.layout.screen_proctor);
		lstActiveStudents = (ListView)findViewById(R.id.lstActiveStudents);
		lstTimeRemaining = (ListView)findViewById(R.id.lstTimeRemaining);
		
		// test
//		List <String> myTestList = new ArrayList<String>(0);
//		
//		myTestList.add("Hello");
//		myTestList.add("Mr. Michaud");
		

		

		
		ArrayAdapter<String> studentAdaptor = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, testingCenter.getStudentNames());
		studentAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		lstActiveStudents.setAdapter(studentAdaptor);
		
		
		
	}

	public void btn15Clicked (View v){
		currentStudent.examTime = 15;
	}
	public void btn30Clicked (View v){
		currentStudent.examTime = 30;
	}
	public void btn55Clicked (View v){
		currentStudent.examTime = 55;
	}
	public void btn115Clicked (View v){
		currentStudent.examTime = 115;
	}
	public void btn130Clicked (View v){
		currentStudent.examTime = 130;
	}
	public void btn155Clicked (View v){
		currentStudent.examTime = 155;
	}

	//This will be our last function.
	public void btnStartClicked (View v){
		//Times
		currentStudent.timeIn = elapsedtime;
		currentStudent.timeOut = elapsedtime + currentStudent.examTime;
//		
		
		//Set Student class attributes
		currentStudent.FirstName = txtFirstName.getText().toString();
			currentStudent.LastName = txtLastName.getText().toString();
			currentStudent.studentID = txtStudentId.getText().toString();
			currentStudent.email = txtEmail.getText().toString();
//	

		//Add a new student to the list.
		testingCenter.addStudent(currentStudent); 
		
		//Test Properties and Add to List
		currentTest.setTeacher(txtTeacher.getText().toString());
			//Spinner
			currentTest.setType(String.valueOf(type.getSelectedItem()));
			currentTest.setSubject(String.valueOf(subject.getSelectedItem()));
			//Increase TestId by 1
			currentTest.testId ++;
			//Add to list
			testingCenter.addTest(currentTest);
		
		//Add Spinner result to class attribute
			currentTest.setType(String.valueOf(type.getSelectedItem()));
			currentTest.setSubject(String.valueOf(subject.getSelectedItem()));
		
		//Add Student to list view
		
			
		//View Change
		setContentView(R.layout.activity_main);
		
//Reset Functions
		currentStudent = new Student();
			currentTest = new Test();
						resetText();
	}
	public void resetText(){
		txtFirstName.setText("");
			txtFirstName.setHint("First Name");
		txtLastName.setText("");
			txtLastName.setHint("Last Name");
			
	}
	// Hey John, 
	// To set the colors go to the xml (screen_students) (screen_proctor) and write the following code:
	// android:background = "# (hex code here)"
	// To find the hex code just click on the bookmark that I made in ur browser.
	//Use whatever colors that you want!
	// Do this by tomorrows class so that we can finish in class. 

	
}
