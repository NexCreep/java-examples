package Ejercicio19;

import java.util.Arrays;

class Series
{
    private final char[] generos = new char[]{'D', 'S', 'C', 'T'};
    
    private String titulo = "";
    private short capitulos = 10;
    private char genero = 'D';
    private String guionista = "";
    private String[] actores = new String[]{"", "", "", "", ""};
    private float precio = 0f;
    
    //! Constructores
    Series(){}
    Series(String titulo, String guionista){
        this.titulo = titulo;
        this.guionista = guionista;
    }
    Series(String titulo, short capitulos, char genero, String guionista, String[] actores, float precio){
        this.titulo = titulo;
        this.capitulos = capitulos;
        insertarGenero(genero);
        this.guionista = guionista;
        System.arraycopy(actores, 0, this.actores, 0, this.actores.length);
        this.precio = precio;
    }
    
    //! Getters y Setters
    String getTitulo(){ return titulo; }
    short getCapitulos(){ return capitulos; } 
    char getGenero(){ return genero; }
    String getGuionista(){ return guionista; }
    String[] getActores(){ return actores; } 
    float getPrecio(){ return precio; }
    
    void setTitulo(String titulo){ this.titulo = titulo; }
    void setCapitulos(short capitulos){ this.capitulos = capitulos; } 
    void setGenero(char genero){ insertarGenero(genero); }
    void setGuionista(String guionista){ this.guionista = guionista; }
    void setActores(String[] actores){ System.arraycopy(actores, 0, this.actores, 0, this.actores.length); } 
    void setPrecio(float precio){ this.precio = precio; }
    
    //! Metodos de clase
    private void insertarGenero(char genero){
        int i = 0;
        boolean located = false;
        do{
            if (Character.toUpperCase(genero) == generos[i]){
                this.genero = Character.toUpperCase(genero);
                located = true;
            }
            i++;
        }while(i < generos.length && !located);
        
    }
        
    //! Class to String
    public String toString(){
        return titulo + " tiene, " + capitulos + " capitulos, su genero es '" + genero + 
        "', su guión ha sido escrito por " + guionista + ", y actuada por " +
        Arrays.toString(actores) + ", y se puede ver por " + precio + " €.";
    }
    
}
