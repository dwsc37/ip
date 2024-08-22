package task;

import java.util.ArrayList;

/**
 * List of tasks stored by BotManager
 *
 * @author dwsc37
 */
public class TaskList {
    private final ArrayList<Task> taskList = new ArrayList<>();

    public void addTask(Task task) {
        taskList.add(task);
    }

    public int getTaskCount() {
        return taskList.size();
    }

    public Task markTask(int taskIndex) {
        taskList.get(taskIndex).mark();
        return taskList.get(taskIndex);
    }

    public Task unmarkTask(int taskIndex) {
        taskList.get(taskIndex).unmark();
        return taskList.get(taskIndex);
    }

    public String getSummary() {
        if (taskList.isEmpty()) {
            return "You have no tasks currently.";
        } else if (taskList.size() == 1) {
            return "You have 1 task currently.";
        }
        return "You have " + taskList.size() + " tasks currently.";
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getSummary()).append("\n");
        for (int i = 0; i < getTaskCount(); i++) {
            stringBuilder.append(i + 1).append(". ");
            stringBuilder.append(taskList.get(i).toString()).append("\n");
        }

        return stringBuilder.toString();
    }
}
