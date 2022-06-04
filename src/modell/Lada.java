
package modell;

public class Lada {
    private String szin;
    private String felirat;
    private boolean vanKincs;

    public Lada(String szin, String felirat, boolean vanKincs) {
        this.szin = szin;
        this.felirat = felirat;
        this.vanKincs = vanKincs;
    }
    

    public String getSzin() {
        return szin;
    }

    public String getFelirat() {
        return felirat;
    }

    public boolean isVanKincs() {
        return vanKincs;
    }
    
    
}
