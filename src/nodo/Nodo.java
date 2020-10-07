package nodo;

public class Nodo{

    private int dato;
    private Nodo liga;

    public Nodo(int dato, Nodo liga){

        this.dato = dato;
        this.liga = liga;
    }

    public int getDato(){
        return dato;
    }

    public Nodo getLiga(){
        return liga;
    }

    public void setDato(int dato){
        this.dato = dato;
    }

    public void setLiga(Nodo liga){
        this.liga = liga;
    }

}