public class Main {
    public static void main(String[] args) {
        var valor = suma(10, 25, 54);

        System.out.println("La suma de los 3 valores es: " + valor);

        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println("Mi coche tiene" + " " + miCoche.puertas + " " + "puerta");
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {

    public int puertas = 0;

    public void AgregarPuerta() {
        this.puertas++;
    }

}