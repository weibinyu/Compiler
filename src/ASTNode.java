import java.util.ArrayList;

public class ASTNode{
    private String name;
    private String argumentType;
    private String OP_code;
    private ArrayList<ASTNode> childrens;

    public ASTNode(String name,String at,String oq) {
        this.name = name;
        this.argumentType = at;
        this.OP_code = oq;
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

    public void addChild(ASTNode astNode){
        this.childrens.add(astNode);
    }
}
