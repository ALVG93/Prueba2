package com.mycompany.gimnasio;

import com.mycompany.gimnasio.objetos.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    public static void imprimirMenu() {
        System.out.println("1. Registrar cliente.");
        System.out.println("2. Dar de baja a un cliente.");
        System.out.println("3. Registrar profesor.");
        System.out.println("4. Dar de baja a un profesor.");
        System.out.println("5. Agregar nueva clase.");
        System.out.println("6. Eliminar una clase.");
        System.out.println("7. Mostrar todos los clientes.");
        System.out.println("8. Mostrar todos los profesores.");
        System.out.println("9. Mostrar todas las clases.");
        System.out.println("10. Salir del programa.");
        System.out.println("Introduce el número de la opcion deseada: ");
    }

    public static Cliente registrarCliente() {
        Scanner sca = new Scanner(System.in);
        
        System.out.println("Introduzca el id del nuevo cliente: ");
        int idCliente = sca.nextInt();
        Cliente cliente = new Cliente(idCliente);
        sca.nextLine();
        System.out.println("Introduzca el nombre del nuevo cliente: ");
        String nombre = sca.nextLine();
        cliente.nombre = nombre;
        System.out.println("Introduzca los apellidos del nuevo cliente: ");
        String apellidos = sca.nextLine();
        cliente.apellidos = apellidos;
        System.out.println("Introduzca el DNI del nuevo cliente: ");
        cliente.DNI = sca.nextLine();
        System.out.println("Introduzca el número de teléfono del nuevo cliente: ");
        int numeroTelefono = sca.nextInt();
        cliente.numeroTelefono = numeroTelefono;

        return cliente;
    }

    public static void eliminarCliente(ArrayList<Cliente> clientes) {
        Scanner sca = new Scanner(System.in);
        
        System.out.println("Introduzca el id del cliente a dar de baja: ");
        int idCliente = sca.nextInt();
        
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para dar de baja...");
        } else {
            for (Cliente clienteABorrar : clientes) {
                if (clienteABorrar.idCliente == idCliente) {
                    clientes.remove(clienteABorrar);
                }
            }
        }
    }

    public static void imprimirClientes(ArrayList<Cliente> clientes) {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para mostrar...");
        } else {
            for (Cliente clienteAMostrar : clientes) {
                System.out.println("ID: " + clienteAMostrar.idCliente);
                System.out.println("Nombre: " + clienteAMostrar.nombre);
                System.out.println("Apellidos: " + clienteAMostrar.apellidos);
                System.out.println("DNI: " + clienteAMostrar.DNI);
                System.out.println("Número de teléfono: " + clienteAMostrar.numeroTelefono);
                System.out.println("");
            }
        }
    }
}
