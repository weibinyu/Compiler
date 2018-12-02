public class TaskNode {
    private int id;
    private String task;
    private String opCode;
    private String sort;
    private String kind;
    private boolean coerce;
    private String value;
    private TaskNode next;
    private TaskNode pred;
    private TaskNode predLeft;
    private TaskNode predRight;

    public TaskNode(String task,int id){
        this.task = task;
        this.id = id;
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public boolean getCoerce() {
        return coerce;
    }

    public void setCoerce(boolean coerce) {
        this.coerce = coerce;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TaskNode getNext() {
        return next;
    }

    public void setNext(TaskNode next) {
        this.next = next;
    }

    public TaskNode getPred() {
        return pred;
    }

    public void setPred(TaskNode pred) {
        this.pred = pred;
    }

    public TaskNode getPredLeft() {
        return predLeft;
    }

    public void setPredLeft(TaskNode predLeft) {
        this.predLeft = predLeft;
    }

    public TaskNode getPredRight() {
        return predRight;
    }

    public void setPredRight(TaskNode predRight) {
        this.predRight = predRight;
    }

    public String getTask() {
        return task;
    }

    public int getId() {
        return id;
    }
}
