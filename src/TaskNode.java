public class TaskNode {

    private String task;
    private String opCode;
    private String sort;
    private String kind;
    private boolean coerce;
    private String value;

    public TaskNode(String task){
        this.task = task;
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

    public boolean isCoerce() {
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
}
