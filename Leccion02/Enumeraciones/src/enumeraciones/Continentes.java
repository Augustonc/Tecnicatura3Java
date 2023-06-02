package enumeraciones;

public enum Continentes {
    AFRICA(53, "1.2 Billones"),
    EUROPA(46, "1.1 Billones"),
    ASIA(44, "1.5 Billones"),
    AMERICA(34, "1.1 Billones"),
    OCEANIA(14, "0.8 Billones");
    
    private final int paises;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    //Método Get
    
    public int getPaises(){
        return this.paises;
        
    }
    public String getHabitante(){
        return this.habitantes;
    }
}
