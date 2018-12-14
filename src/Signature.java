import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Signature {

    public Map<String ,ASTNode> para = new HashMap<String,ASTNode>();
    public ArrayList<ASTNode> paras;
    public ArrayList<ASTNode> in = new ArrayList<>();
    public ArrayList<ASTNode> out = new ArrayList<>();

    public void addFormalInParameter(String ID,ASTNode a){
        System.out.println(ID);
        System.out.println(a.getName() +" "+a.getKind()+" "+a.getOP_code());
        para.put(ID,a);
        in.add(a);
    };
    public void addFormalOutParameter(String ID,ASTNode a){
        para.put(ID,a);
        out.add(a);
    };
    public ASTNode getParameter(String ID){
        return para.get(ID);
    }
    public ASTNode getParameter(int i){
        return in.get(i);
    }
    public ArrayList<ASTNode> getIn(){
        return in;
    }
    public ArrayList<ASTNode> getOut(){
        return out;
    }
}
