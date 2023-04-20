public class Epic extends Task {
    protected String[] subtasks = new String[text];
    protected String text;

    public Epic(int id, String[] subtasks) {
        super(id); // вызов родительского конструктора
        this.subtasks = text; // заполнение своих полей
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    public String getText() {
        return text;
    }
}
