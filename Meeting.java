public class Meeting extends Task {
    protected String topic;
    protected String project;
    protected String start;

    public SimpleTask(int id, String topic,String project,String start) {
        super(id);
        this.topic = topic;
        this.project = project;
        this.start = start;
    }
    public String getProject() {
        return project;
    }
    public String getStart() {
        return start;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
