package utils;

import vault.Settings;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsToFile implements ActionListener {
    private final JLabel settingsStatusLabel;
    private static final String CORNERS_PROBLEMS_ERROR = "One or both corners are not set";
    private static final String SETTINGS_SAVED_TO_FILE = "Settings saved to file";

    public SettingsToFile(JLabel settingsStatusLabel) {
        this.settingsStatusLabel = settingsStatusLabel;
    }

    public void actionPerformed(ActionEvent e) {
        if (!Settings.canWriteCornersToFile()) {
            settingsStatusLabel.setText(CORNERS_PROBLEMS_ERROR);
            return;
        }
        settingsStatusLabel.setText(SETTINGS_SAVED_TO_FILE);
    }
}
