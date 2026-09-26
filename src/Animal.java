public class Animal {
  private String nombre ;
    private int edad ;
    private double peso ;
    private String propietario ;

//Constructor vacio


    public Animal() {
    }
    //constructor con todos los parametros

    public Animal(String nombre, int edad, double peso, String propietario) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.propietario = propietario;
    }
    // los get y set


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    // to string

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", propietario='" + propietario + '\'' +
                '}';
    }
}
