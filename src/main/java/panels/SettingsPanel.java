package panels;

import utils.MouseLocationPosition;
import utils.SettingsToFile;
import vault.NamingConstants;

import javax.swing.*;

import static vault.NamingConstants.BOTTOM_RIGHT_BUTTON;
import static vault.NamingConstants.TOP_LEFT_BUTTON;

public class SettingsPanel extends JPanel {

    public SettingsPanel() {
        this.setLayout(null);
        initializeElements();
    }

    private void initializeElements() {
        JLabel topLeftLabel = new JLabel("No value set");
        topLeftLabel.setBounds(70, 10, 100, 25);

        JLabel bottomRightLabel = new JLabel("No value set");
        bottomRightLabel.setBounds(70, 40, 100, 25);

        JButton topLeftLocation = new JButton(TOP_LEFT_BUTTON);
        topLeftLocation.setBounds(10, 10, 50, 25);
        topLeftLocation.addActionListener(new MouseLocationPosition(topLeftLabel));

        JButton bottomRightLocation = new JButton(BOTTOM_RIGHT_BUTTON);
        bottomRightLocation.setBounds(10, 40, 50, 25);
        bottomRightLocation.addActionListener(new MouseLocationPosition(bottomRightLabel));

        JLabel settingsStatusLabel = new JLabel("This is how I look");
        settingsStatusLabel.setBounds(10, 100, 330, 25);

        JButton settingsToFile = new JButton("Save settings");
        settingsToFile.setBounds(10, 70, 125, 25);
        settingsToFile.addActionListener(new SettingsToFile(settingsStatusLabel));

        JButton fileToSettings = new JButton("Load settings");
        fileToSettings.setBounds(140, 70, 125, 25);

        this.add(topLeftLabel);
        this.add(bottomRightLabel);
        this.add(topLeftLocation);
        this.add(bottomRightLocation);
        this.add(settingsToFile);
        this.add(fileToSettings);
        this.add(settingsStatusLabel);
    }
}
