import java.util.HashMap;
import java.util.Map;

public class Scope {
    private Scope outer;
    private Boolean complete;

    public Map<String ,ASTNode> defs = new HashMap<>(); //first ID then Kind:

    public Scope(Scope outer){
        this.outer = outer;
    }

    public Boolean	isDefined(String ID){
        if(ID == null){
            return false;
        }
        return	defs.containsKey(ID);
    }
    public void	setDefinition(String ID,ASTNode	TYPE_SPEC){
        defs.put(ID,TYPE_SPEC);
    }
    public ASTNode getDefinition(String	ID){
        if	(isDefined(ID))
            return	defs.get(ID);
        else	if	(outer	!=	null)
            return	outer.getDefinition(ID);
        else
            return new ASTNode("Error",null,null,99999999);
    }

    public Scope getOuter() {
        return outer;
    }

    public void setOuter(Scope outer) {
        this.outer = outer;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }
}
