package vault;

import java.awt.*;

import static java.util.Objects.isNull;


public final class Settings {

    private static Point topLeft;
    private static Point bottomRight;

    private Settings() {
    }

    public static Point getTopLeft() {
        if (isNull(topLeft)) {
            return null;
        }
        return new Point(topLeft);
    }

    public static void setTopLeft(Point topLeft) {
        Settings.topLeft = topLeft;
    }

    public static Point getBottomRight() {
        if (isNull(bottomRight)) {
            return null;
        }
        return new Point(bottomRight);
    }

    public static void setBottomRight(Point bottomRight) {
        Settings.bottomRight = bottomRight;
    }

    public static boolean canWriteCornersToFile() {
        return !((isNull(Settings.topLeft)) || (isNull(Settings.bottomRight)));
    }
}
