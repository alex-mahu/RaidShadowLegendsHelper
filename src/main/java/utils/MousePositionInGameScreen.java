package utils;

import models.LocationAsPercentage;
import vault.Settings;

import java.awt.*;

import static java.lang.Math.round;

public class MousePositionInGameScreen {
    private final long hight;
    private final long width;

    public MousePositionInGameScreen() {
        width = Settings.getBottomRight().x - Settings.getTopLeft().x;
        hight = Settings.getBottomRight().y - Settings.getTopLeft().y;
    }

    public LocationAsPercentage calculatePercentagesBasedOnPoint(Point inGameRectanglePoint) {
        long xDistance = getXDistance(inGameRectanglePoint.x);
        long yDistance = getYDistance(inGameRectanglePoint.y);
        LocationAsPercentage locationAsPercentage = new LocationAsPercentage();
        locationAsPercentage.xPercentage = (xDistance * 100.0)/width;
        locationAsPercentage.yPercentage = (yDistance * 100.0)/hight;
        return locationAsPercentage;
    }

    public Point calculatePointBasedOnLocationAsPercentage(LocationAsPercentage locationAsPercentage) {
        return calculatePointBasedOnLocationAsPercentage(locationAsPercentage.xPercentage, locationAsPercentage.yPercentage);
    }

    public Point calculatePointBasedOnLocationAsPercentage(double xPercentage, double yPercentage) {
        return new Point(
                Settings.getTopLeft().x + (int) round((width * xPercentage)/100),
                Settings.getTopLeft().y + (int) round((hight * yPercentage)/100)
        );
    }

    private long getYDistance(int y) {
        return y - Settings.getTopLeft().y;
    }

    private long getXDistance(int x) {
        return x - Settings.getTopLeft().x;
    }
}
