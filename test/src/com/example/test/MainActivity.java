package com.example.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;


/*SUMMARY OF CLASS- [i want to get var of class a inside the constructor of class b]
*
*declare/intialize classa in side mainActivity
*classa has two constructors(one without parameters, one with parameters)
*classa constructor declare/intialize classb obj
*classb constructor declare/intialize classa obj  (this time used the one with parameter)
*classa obj is used to access the class variable inside classb
*system.out the value that i got from classa in classb
*/

public class MainActivity extends Activity{

	int a;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		System.out.println("onCreate() is called");
		
		super.onCreate(savedInstanceState);
		
		// @param determine how to screen will look like
		setContentView(R.layout.activity_main);
		
		classa a = new classa();
		System.out.println("class a is called");
		
		//classb b= new classb();
		//System.out.println("class b is called");
		
		
	}

	
	
	
}
