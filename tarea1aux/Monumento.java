
public class Monumento{
    private String nombre;
    private String ciudad;
    private String pais;
    private String continente;
    private int fechaConstruc;
    private String tipo; //se refiere a si es una torre, una estatua, etc

    public Monumento(String n, String c, String p, String cont, int fechaC, String t){
        nombre = n;
        ciudad = c;
        pais = p;
        continente = cont;
        fechaConstruc = fechaC;
        tipo = t;
    }
    public int calcularAntiguedad(){
        int actual = 2021;
        int antiguedad;
        antiguedad = actual - fechaConstruc;
        return antiguedad;
    }
    public String ubicar(){
        String ubicacion;
        ubicacion = "está ubicado en: " + ciudad + ", "+pais + ", "+ continente;
        System.out.println(ubicacion);
        return ubicacion;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}
