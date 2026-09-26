public class Perro extends Animal {

    private String raza;

    // contructorvacio
    public Perro() {
        super();
    }

    //constructor con tdos los parametros
    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro(String nombre, int edad, double peso, String propietario, String raza) {
        super(nombre, edad, peso, propietario);
        this.raza = raza;
    }

    //  get and set
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    //metodos propios
    public double calcularDosisMedicina() {
        return getPeso() * 2.0;
    }

    public void mostrarInformacion() {
        System.out.println("========== PERRO ==========");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Propietario: " + getPropietario());
        System.out.println("Raza: " + raza);
        System.out.println("Dosis recomendada: " + calcularDosisMedicina() + " ml");
        System.out.println();
    }
}