public class gato extends Animal {

    private String lugar;

    // constructor vacio
    public gato() {
        super();
    }

    // constructor con todos los parametros
    public gato(String lugar) {
        this.lugar = lugar;
    }

    public gato(String nombre, int edad, double peso, String propietario, String lugar) {
        super(nombre, edad, peso, propietario);
        this.lugar = lugar;
    }

    // get and set

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    // metodos propios

    public double calcularCantidadAlimento() {
        return getPeso() * 15.0;
    }

    public void mostrarInformacion() {
        System.out.println("=== REPORTE GATO ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Propietario: " + getPropietario());
        System.out.println("Lugar: " + lugar);
        System.out.println("Alimento Diario: " + calcularCantidadAlimento() + " g");
    }
}