/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainferia;

/**
 *
 * @author br
 */
public class MainFeria {
// Clase principal para ejecutar el programa
    public static void main(String[] args) {
        
        // Creamos un objeto de tipo Empresa
        Empresa empresa = new Empresa("TechSolutions", "Tecnología");
        
        // Creamos un objeto de tipo Feria
        Feria feria = new Feria("Feria Empresarial 2025", "Bogotá");
        
        // Registramos la empresa en la feria
        feria.registrarEmpresa(empresa);
        
        // Mostramos los datos de la feria
        feria.mostrarDatos();
    }
}

// Clase que representa una Empresa
class Empresa {
    String nombre;
    String sector;
    
    // Constructor para inicializar la empresa
    public Empresa(String nombre, String sector) {
        this.nombre = nombre;
        this.sector = sector;
    }
    
    // Método para mostrar la información de la empresa
    public void mostrarInfo() {
        System.out.println("Empresa: " + nombre + ", Sector: " + sector);
    }
}

// Clase que representa una Feria Empresarial
class Feria {
    String nombre;
    String ciudad;
    Empresa empresa; // Solo guardamos una empresa como ejemplo
    
    // Constructor para inicializar la feria
    public Feria(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    
    // Método para registrar una empresa en la feria
    public void registrarEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    // Método para mostrar los datos de la feria
    public void mostrarDatos() {
        System.out.println("Feria: " + nombre + ", Ciudad: " + ciudad);
        if (empresa != null) {
            System.out.print("Empresa registrada: ");
            empresa.mostrarInfo();
        } else {
            System.out.println("No hay empresas registradas.");
        }
    }
}
