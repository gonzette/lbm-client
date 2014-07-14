package com.lazooz.lbm;

import com.lazooz.lbm.preference.MySharedPreferences;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class CongratulationsDrive100Activity extends ActionBarActivity {

	private Button nextBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_congratulations_drive100);

		
		MySharedPreferences.getInstance().setStage(CongratulationsDrive100Activity.this, MySharedPreferences.STAGE_DRIVE100_CONGRATS);
		
		nextBtn = (Button)findViewById(R.id.congratulation_drive100_next_btn);
		nextBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(CongratulationsDrive100Activity.this, MainActivity.class);
				intent.putExtra("SELECT_CONTACTS", true);
				startActivity(intent);
				finish();			
			}
		});
		
	}
	




}
