package task;

/**
 * A generic task stored by BotManager
 *
 * @author dwsc37
 */
public abstract class Task {
    private final String description;
    private boolean isDone = false;

    public Task(String description) {
        this.description = description;
    }

    public Task(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    protected void mark() {
        isDone = true;
    }

    protected void unmark() {
        isDone = false;
    }

    private String getStatusIcon() {
        return isDone ? "[X]" : "[ ]";
    }

    @Override
    public String toString() {
        return getStatusIcon() + " " + description;
    }

    public String toData() {
        return description + " | " + isDone;
    }
}
