package Casas;

public class Casa {
    private int hab;
    private String tipo;
    private float costo;

    public Casa (String tipo, int hab, float costo){
        this.tipo=tipo;
        this.hab=hab;
        this.costo=costo;
    }

    public Casa(String tipo){
        this(tipo, 2, 2000000);
    }

    public int hashCode(){
        return tipo.hashCode() * hab * costo;

    }

    public boolean equals (Casa ObjetoCasa){
        if(ObjetoCasa!=null && ObjetoCasa instanceof Casa){
            if(tipo.equals() && costo.equals()){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return tipo + "\t" + costo + "\t" + hab;

    }
}