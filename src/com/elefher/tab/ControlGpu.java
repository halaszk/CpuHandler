package com.elefher.tab;

import com.cpu.handler.R;
import com.elefher.customclasses.GpuFreq;
import com.elefher.implementation.GpuFreqPicker;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.TextView;

public class ControlGpu extends Activity {

	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.controlgpu);

		getActionBar().setDisplayHomeAsUpEnabled(true);

		/* Gpu Frequency */
		// Set current Gpu Frequency
		GpuFreq gpuFreq = new GpuFreq(this);
		TextView curPS = (TextView) findViewById(R.id.currentGpuFrequency);
		// Get current frequency and return it to MHz
		curPS.setText(gpuFreq.returnTo(gpuFreq.getCurrentFrequency()));
		
		GpuFreqPicker gpuFreqPicker = new GpuFreqPicker(this);
		/* End Gpu Frequency */
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		// Respond to the action bar's Up/Home button
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}