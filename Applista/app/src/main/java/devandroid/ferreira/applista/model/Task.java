package devandroid.ferreira.applista.model;

public class Task public class Task {
    private String title;
    private boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
{import java.util.ArrayList;
        import java.util.List;

public class TaskController {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        Task task = new Task(title);
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void updateTask(int index, boolean completed) {
        Task task = tasks.get(index);
        task.setCompleted(completed);
    }

    public void deleteTask(int index) {
        tasks.remove(index);
    }
}

}
