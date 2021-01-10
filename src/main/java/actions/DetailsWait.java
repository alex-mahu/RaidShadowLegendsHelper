package actions;

public final class DetailsWait implements IActionDetails {
    private final int waitInSeconds;

    public DetailsWait(int waitInSeconds) {
        this.waitInSeconds = waitInSeconds;
    }

    public int getWaitInSeconds() {
        return waitInSeconds;
    }
}
