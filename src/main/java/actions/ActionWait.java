package actions;

import javax.swing.*;

public final class ActionWait implements IAction {
    @Override
    public void perform(IActionDetails details) {
        int delayInMilliseconds = ((DetailsWait) details).getWaitInSeconds() * 1000;
        long start = System.currentTimeMillis();
        Timer timer = new Timer(delayInMilliseconds, e -> {
            System.out.println(System.currentTimeMillis() - start);
            return;
        });
        timer.setRepeats(false);
        timer.start();
        System.out.println(System.currentTimeMillis() - start);
    }
}
