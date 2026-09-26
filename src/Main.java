public class Main {
    public static void main(String[] args) {


        Perro perro1 = new Perro("Max", 5, 12.0, "Henry Duvan", "Pincher");


        Perro perro2 = new Perro();
        perro2.setNombre("Rocky");
        perro2.setEdad(3);
        perro2.setPeso(20.0);
        perro2.setPropietario("Ana Maria");
        perro2.setRaza("Golden :)");

        gato gato1 = new gato("Minina", 3, 4.0, "Natalia Bayona", "Interior");




        gato gato2 = new gato();
        gato2.setNombre("Michi");
        gato2.setEdad(2);
        gato2.setPeso(5.0);
        gato2.setPropietario("Fabiola Esquivel");
        gato2.setLugar("Exterior");


        perro1.mostrarInformacion();
        perro2.mostrarInformacion();

        gato1.mostrarInformacion();
        gato2.mostrarInformacion();

    }
}