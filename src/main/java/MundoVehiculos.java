public class MundoVehiculos {

    // Clase base Vehiculo
    static class Vehiculo {
        private String marca;
        private String modelo;

        public Vehiculo(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void encender() {
            System.out.println("El vehículo está encendido.");
        }
    }

    // Clase hija Auto
    static class Auto extends Vehiculo {
        public Auto(String marca, String modelo) {
            super(marca, modelo);
        }

        @Override
        public void encender() {
            System.out.println("El auto " + getMarca() + " " + getModelo() + " ha encendido su motor.");
        }
    }

    // Clase hija Motocicleta
    static class Motocicleta extends Vehiculo {
        public Motocicleta(String marca, String modelo) {
            super(marca, modelo);
        }

        @Override
        public void encender() {
            System.out.println("La motocicleta " + getMarca() + " " + getModelo() + " ha arrancado.");
        }
    }

    // Método main
    public static void main(String[] args) {
        Vehiculo miAuto = new Auto("Toyota", "Corolla");
        Vehiculo miMoto = new Motocicleta("Yamaha", "MT-07");

        miAuto.encender();
        miMoto.encender();
    }
}
