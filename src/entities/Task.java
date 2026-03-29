package entities;

public class Task {

    private final int id;
    private String title;
    private boolean done;
    public Task(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        String status = done ? "[X]" : "[ ]";
        return "[" + id + "] " + status + " " + title;
    }
}
