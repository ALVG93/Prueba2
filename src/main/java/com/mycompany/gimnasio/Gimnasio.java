package com.mycompany.gimnasio;

import com.mycompany.gimnasio.objetos.Clase;
import com.mycompany.gimnasio.objetos.Cliente;
import com.mycompany.gimnasio.objetos.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

public class Gimnasio {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Profesor> profesores = new ArrayList<Profesor>();
        ArrayList<Clase> clases = new ArrayList<Clase>();

        Cliente cliente = null;
        Profesor profesor = null;
        Clase clase = null;
        int idCliente;
        int idProfesor;
        String nombre;
        String apellidos;
        String DNI;
        int numeroTelefono;
        int idClase;
        String titulo;
        String descripcion;
        String hora;

        int opcion = 10;

        do {
            Utils.imprimirMenu();
            
            opcion = sca.nextInt();

            switch (opcion) {
                case 1:
                    clientes.add(Utils.registrarCliente());

                    break;
                case 2:
                    Utils.eliminarCliente(clientes);

                    break;
                case 3:
                    System.out.println("Introduzca el id del nuevo profesor: ");
                    idProfesor = sca.nextInt();
                    profesor = new Profesor(idProfesor);
                    sca.nextLine();
                    System.out.println("Introduzca el nombre del nuevo profesor: ");
                    nombre = sca.nextLine();
                    profesor.nombre = nombre;
                    System.out.println("Introduzca los apellidos del nuevo profesor: ");
                    apellidos = sca.nextLine();
                    profesor.apellidos = apellidos;
                    System.out.println("Introduzca el DNI del nuevo profesor: ");
                    DNI = sca.nextLine();
                    profesor.DNI = DNI;
                    System.out.println("Introduzca el número de teléfono del nuevo profesor: ");
                    numeroTelefono = sca.nextInt();
                    profesor.numeroTelefono = numeroTelefono;
                    profesores.add(profesor);

                    break;
                case 4:
                    System.out.println("Introduzca el id del profesor a dar de baja: ");
                    idCliente = sca.nextInt();
                    if (profesores.isEmpty()) {
                        System.out.println("No hay profesores para dar de baja...");
                    } else {

                        for (Profesor clienteABorrar : profesores) {
                            if (clienteABorrar.idProfesor == idCliente) {
                                profesor = clienteABorrar;

                            }
                        }
                        profesores.remove(profesor);
                    }

                    break;
                case 5:
                    System.out.println("Introduzca el id de la nueva clase: ");
                    idClase = sca.nextInt();
                    clase = new Clase(idClase);
                    sca.nextLine();
                    System.out.println("Introduzca el título de la nueva clase: ");
                    titulo = sca.nextLine();
                    clase.titulo = titulo;
                    System.out.println("Introduzca la descripción de la nueva clase: ");
                    descripcion = sca.nextLine();
                    clase.descripcion = descripcion;
                    System.out.println("Introduzca el id del profesor de la nueva clase: ");
                    idProfesor = sca.nextInt();
                    clase.idProfesor = idProfesor;
                    sca.nextLine();
                    System.out.println("Introduzca la hora de la nueva clase: ");
                    hora = sca.nextLine();
                    clase.hora = hora;
                    clases.add(clase);

                    break;
                case 6:
                    System.out.println("Introduzca el id de la clase a eliminar: ");
                    idCliente = sca.nextInt();
                    if (clases.isEmpty()) {
                        System.out.println("No hay clases para borrar...");
                    } else {

                        for (Clase clienteABorrar : clases) {
                            if (clienteABorrar.idClase == idCliente) {
                                clase = clienteABorrar;

                            }
                        }

                        clases.remove(clase);
                    }

                    break;
                case 7:
                    Utils.imprimirClientes(clientes);

                    break;
                case 8:
                    if (profesores.isEmpty()) {
                        System.out.println("No hay profesores para mostrar...");
                    } else {

                        for (Profesor prodesorAMostrar : profesores) {
                            System.out.println("ID: " + prodesorAMostrar.idProfesor);
                            System.out.println("Nombre: " + prodesorAMostrar.nombre);
                            System.out.println("Apellidos: " + prodesorAMostrar.apellidos);
                            System.out.println("DNI: " + prodesorAMostrar.DNI);
                            System.out.println("Número de teléfono: " + prodesorAMostrar.numeroTelefono);
                            System.out.println("");
                        }
                    }

                    break;
                case 9:
                    if (clases.isEmpty()) {
                        System.out.println("No hay clases para mostrar...");
                    } else {

                        for (Clase claseAMostrar : clases) {
                            System.out.println("ID: " + claseAMostrar.idClase);
                            System.out.println("Título: " + claseAMostrar.titulo);
                            System.out.println("Descripcion: " + claseAMostrar.descripcion);
                            System.out.println("ID del profsor: " + claseAMostrar.idProfesor);
                            System.out.println("Hora: " + claseAMostrar.hora);
                            System.out.println("");
                        }
                    }

                    break;
                case 10:
                    System.out.println("Cerrando el programa...");

                    break;
                default:
                    System.out.println("La opción seleccionada no existe...");
            }
        } while (opcion != 10);
    }
}
