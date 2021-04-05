package sv.edu.udb.guia8app.datos;

public class Persona {
    private String dui;
    private String nombre;
    private String fecha_nacimeinto;
    private String genero;
    private String pesoo;
    private String altura;
    String key;

    public Persona() {
    }

    public Persona(String dui, String nombre, String fecha_nacimeinto, String genero, String pesoo, String altura) {
        this.dui = dui;
        this.nombre = nombre;
        this.fecha_nacimeinto = fecha_nacimeinto;
        this.genero = genero;
        this.pesoo = pesoo;
        this.altura = altura;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getFecha_nacimeinto() {
        return fecha_nacimeinto;
    }

    public void setFecha_nacimeinto(String fecha_nacimeinto) {
        this.fecha_nacimeinto = fecha_nacimeinto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPesoo() {
        return pesoo;
    }

    public void setPesoo(String pesoo) {
        this.pesoo = pesoo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}
