package actions;

import java.awt.*;
import java.awt.event.MouseEvent;

public final class ActionClick implements IAction {
    @Override
    public void perform(IActionDetails actionDetails) {
        Point clickPoint = ((DetailsClick) actionDetails).toGameScreenPosition();
        Robot clicker;
        try {
            clicker = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        clicker.mouseMove(clickPoint.x, clickPoint.y);
        clicker.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
        clicker.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
    }
}
