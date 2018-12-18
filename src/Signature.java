import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Signature {

    public Map<String ,ASTNode> para = new HashMap<>();
    public ArrayList<ASTNode> paras;
    public ArrayList<ASTNode> in = new ArrayList<>();
    public ArrayList<ASTNode> out = new ArrayList<>();

    public void addFormalInParameter(String ID,ASTNode a){
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
    public void reverse(){
        Collections.reverse(this.in);
    }
}
