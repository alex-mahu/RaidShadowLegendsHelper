package actions;

import utils.MousePositionInGameScreen;

import java.awt.*;

public final class DetailsClick implements IActionDetails {
    public final double xPercentage;
    public final double yPercentage;

    public DetailsClick(double xPercentage, double yPercentage) {
        this.xPercentage = xPercentage;
        this.yPercentage = yPercentage;
    }

    public Point toGameScreenPosition() {
        return new MousePositionInGameScreen()
                .calculatePointBasedOnLocationAsPercentage(xPercentage, yPercentage);
    }


}
