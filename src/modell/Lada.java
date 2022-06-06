
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
    
//    public void AranyLada(){
//        szin = "arany";
//        felirat = "Én rejtem a kincset";
//        vanKincs = false;
//    }
//    
//    public void EzustLada(){
//        szin = "ezüst";
//        felirat = "Nem én rejtem a kincset";
//        vanKincs = true;
//    }
//    
//    public void BronzLada(){
//        szin = "bronz";
//        felirat = "Az arany hazudik";
//        vanKincs = false;
//    }

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
