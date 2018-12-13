import java.util.Map;

public class Scope {
    private Scope outer;
    private Boolean complete;

    public Map<String ,String> defs; //first ID then Kind:
    public Scope(Scope outer){
        this.outer = outer;
    }
    public Boolean	isDefined(String	ID){
        return	defs.containsKey(ID);
    }
    public void	setDefinition(String	ID,	String	TYPE_SPEC){
        defs.put(ID,TYPE_SPEC);
    }
    public String getDefinition(String	ID){
        if	(isDefined(ID))
            return	defs.get(ID);
        else	if	(outer	!=	null)
            return	outer.getDefinition(ID);
        else
            return "ERROR";
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
