import java.util.ArrayList;

public class ASTNode{
    private int id;
    private String name;
    private String argumentType;
    private String OP_code;
    private ArrayList<ASTNode> children = new ArrayList<>();
    private String Kind;
    private Boolean Coerce;
    private Boolean COMPLETE;
    private Boolean OK;
    private TaskNode first;
    private TaskNode last;
    private TaskNode next;
    private TaskNode pred;


    public ASTNode(String name,String at,String oq,int id) {
        this.name = name;
        this.argumentType = at;
        this.OP_code = oq;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getArgumentType() {
        return argumentType;
    }

    public String getOP_code() {
        return OP_code;
    }

    public int getId(){
        return id;
    }

    public void addChild(ASTNode astNode){
        this.children.add(astNode);
    }
    public ArrayList<ASTNode> getChildren(){
        return children;
    }

    public void setKind(String kind) {
        this.Kind = kind;
    }

    public String getKind() {
        return Kind;
    }

    public void setCoerce(Boolean coerce) {
        Coerce = coerce;
    }

    public Boolean getCoerce() {
        return Coerce;
    }
    public Boolean getCOMPLETE() {
        return COMPLETE;
    }

    public Boolean getOK() {
        return OK;
    }

    public void setCOMPLETE(Boolean COMPLETE) {
        this.COMPLETE = COMPLETE;
    }

    public void setOK(Boolean OK) {
        this.OK = OK;
    }

    public TaskNode getFirst() {
        return first;
    }

    public void setFirst(TaskNode first) {
        this.first = first;
    }

    public TaskNode getLast() {
        return last;
    }

    public void setLast(TaskNode last) {
        this.last = last;
    }

    public TaskNode getNext() {
        return next;
    }

    public void setNext(TaskNode next) {
        this.next = next;
    }

    public int getTotalChildren(int t){
        int total = t;
        for(ASTNode a : this.children){
            total += 1;
        }
        return total;
    }
}
