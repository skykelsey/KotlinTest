package com.skykelsey.kotlintest

import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem


public class MainActivity : ActionBarActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.main)
	}

	override fun onCreateOptionsMenu(menu: Menu?): Boolean {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater()?.inflate(R.menu.menu_main, menu)
		return true
	}

	override fun onOptionsItemSelected(item: MenuItem?): Boolean {
		val id = item!!.getItemId()

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true
		}
		return super.onOptionsItemSelected(item)
	}
}
