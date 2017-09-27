package com.liu.fingertest;
import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingsActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();

	}

	/**
	 * Fragment for settings.
	 */
	public static class SettingsFragment extends PreferenceFragment {

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			addPreferencesFromResource(R.xml.preferences);
		}
	}
}
