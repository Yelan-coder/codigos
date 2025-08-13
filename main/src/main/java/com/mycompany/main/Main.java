/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author br
 */
public class Main {

    public static void main(String[] args) {
   Moto moto = new Moto("Yamaha", "R15", "ABC123");
        Carro carro = new Carro("Toyota", "Corolla", "XYZ789");
        VehiculoCarga tractomula = new VehiculoCarga("Volvo", "FH16", "LMN456", 25000);

        System.out.println("=== Vehículos en el parqueadero ===");
        moto.mostrarInfo();
        carro.mostrarInfo();
        tractomula.mostrarInfo();
    }
}
// Clase base Vehiculo
class Vehiculo {
    String marca;
    String modelo;
    String placa;
// Constructor de la clase Vehiculo
    public Vehiculo(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
 // Método para mostrar datos del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Placa: " + placa);
    }
}
// Clase Moto que hereda de Vehiculo
class Moto extends Vehiculo {
    public Moto(String marca, String modelo, String placa) {
        super(marca, modelo, placa);
    }
}
// Clase Carro que hereda de Vehiculo
class Carro extends Vehiculo {
    public Carro(String marca, String modelo, String placa) {
        super(marca, modelo, placa);
    }
}
// Clase Vehiculocarga que hereda de Vehiculo
class VehiculoCarga extends Vehiculo {
    int capacidadCarga; // en kg

    public VehiculoCarga(String marca, String modelo, String placa, int capacidadCarga) {
        super(marca, modelo, placa);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " + capacidadCarga + " kg");
    }
     
    }

