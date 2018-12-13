import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

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
    private Scope SCOPE;
    //private Signature SIG;
    private ASTNode TARGET;
    private Stack<ASTNode> LOOPS;


    public ASTNode(String name,String at,String op,int id) {
        this.name = name;
        this.argumentType = at;
        this.OP_code = op;
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

    public Stack<ASTNode> getLOOPS() {
        return LOOPS;
    }

    public void setLOOPS(Stack<ASTNode> LOOPS) {
        this.LOOPS = LOOPS;
    }

    public Scope getSCOPE() {
        return SCOPE;
    }

    public void setSCOPE(Scope SCOPE) {
        this.SCOPE = SCOPE;
    }

    //check if all children is ok
    public boolean isOk(){
        for(ASTNode n : this.children){
            if(!n.getOK()){
                return false;
            }
        }
        return true;
    }
    //check if all children is complete
    public boolean isComplete(){
        for(ASTNode n : this.children){
            if(!n.getCOMPLETE()){
                return false;
            }
        }
        return true;
    }
    //reverse children order
    public void reverse(){
        Collections.reverse(this.children);
    }
}
