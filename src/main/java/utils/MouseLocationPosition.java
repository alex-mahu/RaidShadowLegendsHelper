package utils;

import vault.NamingConstants;
import vault.Settings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.String.format;
import static vault.NamingConstants.BOTTOM_RIGHT_BUTTON;

public class MouseLocationPosition implements ActionListener {
    private final JLabel label;

    public MouseLocationPosition(JLabel label) {
        this.label = label;
    }

    public void actionPerformed(ActionEvent e) {

        final Timer timer = new Timer(1000, null);
        final String fromButton = e.getActionCommand();

        ActionListener listener = new ActionListener() {

            int count = 5;

            public void actionPerformed(ActionEvent e) {
                label.setText(format("%d sec remaining!", count));
                if (count == 0) {
                    final Point location = MouseInfo.getPointerInfo().getLocation();
                    if (fromButton.equals(BOTTOM_RIGHT_BUTTON)) {
                        Settings.setBottomRight(location);
                    } else {
                        Settings.setTopLeft(location);
                    }
                    label.setText(format("[%d , %d]", location.x, location.y));
                    timer.stop();
                } else {
                    count--;
                }
            }
        };
        timer.addActionListener(listener);
        timer.start();
    }
}
