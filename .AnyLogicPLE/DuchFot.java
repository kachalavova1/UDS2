public enum DuchFot {
    ORANZOVY("pics/duchOranzovy.png"),
    MODRY("pics/duchModry.png"),
    CERVENY("pics/duchCerveny.png"),
    RUZOVY("pics/duchRuzovy.png");
    
    private String suborObrazka;
    
    private DuchFot(String subor){
        this.suborObrazka = subor;
    }
    
    public String getSuborObrazka(){
        return this.suborObrazka;
    }
}

