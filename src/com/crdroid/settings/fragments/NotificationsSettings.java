package com.crdroid.settings.fragments;

import com.android.internal.logging.MetricsProto.MetricsEvent;

import android.os.Bundle;
import com.android.settings.R;

import com.android.settings.SettingsPreferenceFragment;

public class NotificationsSettings extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.crdroid_settings_notifications);
    }

    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.CRDROID_SETTINGS;
    }
}
