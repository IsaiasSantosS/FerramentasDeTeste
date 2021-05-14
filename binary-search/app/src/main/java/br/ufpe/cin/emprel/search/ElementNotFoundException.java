package br.ufpe.cin.emprel.search;

public class ElementNotFoundException extends RuntimeException{
    public ElementNotFoundException(){
        super("Elemento Not Found");
    }
}
