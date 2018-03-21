package de.xeqo.camcapdemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import com.flurry.android.v;

public class Preferences extends PreferenceActivity implements OnSharedPreferenceChangeListener {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences);
        ListPreference listPreference = (ListPreference) findPreference("prefTransferJpeg");
        ListPreference listPreference2 = (ListPreference) findPreference("prefTransferRaw");
        listPreference.setSummary(listPreference.getEntry());
        listPreference2.setSummary(listPreference2.getEntry());
    }

    protected void onResume() {
        super.onResume();
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    protected void onPause() {
        super.onPause();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    protected void onStart() {
        super.onStart();
        v.a((Context) this, "9KHHKKN1MUHRB81BS39D");
    }

    protected void onStop() {
        super.onStop();
        v.a((Context) this);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Preference findPreference = findPreference(str);
        if (findPreference instanceof ListPreference) {
            findPreference.setSummary(((ListPreference) findPreference).getEntry());
        }
    }
}
