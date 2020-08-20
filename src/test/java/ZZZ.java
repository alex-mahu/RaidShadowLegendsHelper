import org.testng.annotations.Test;

import java.awt.*;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.String.format;

public class ZZZ {

    @Test
    public void testName() {
        countDownFrom5();
        final Point p1 = MouseInfo.getPointerInfo().getLocation();
        countDownFrom5();
        final Point p2 = MouseInfo.getPointerInfo().getLocation();
        System.out.println(p1);
        System.out.println(p2);

    }
    @Test
    public void testName2() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        final Point p1 = MouseInfo.getPointerInfo().getLocation();
        reader.readLine();
        final Point p2 = MouseInfo.getPointerInfo().getLocation();
        System.out.println(p1);
        System.out.println(p2);

    }

    private void countDownFrom5() {
        for (int i = 5; i >= 0; i--) {
            System.out.printf("%d sec remaining!%n", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done!");
    }
}
