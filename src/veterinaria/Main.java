/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.util.ArrayList;

/**
 *
 * @author gipao
 */
public class Main {

    private static ArrayList<Persona> personas = new ArrayList<>();
    
    public static void main(String[] args) {
        ArrayList<Veterinaria> veterinarias = new ArrayList<>();

        java.util.Scanner teclado
                = new java.util.Scanner(System.in);

        System.out.println("Registro de veterinaria:");

        boolean newv = true;
        do {
            System.out.println("Nombre de la veterinaria: ");
            String nombreV = teclado.next();
            Veterinaria vet = new Veterinaria(nombreV);
            
        boolean newp = true;
        do{
            System.out.println("Nombre del cliente:");
            String nombre = teclado.next();
            System.out.println("Identidad del cliente:");
            String id = teclado.next();
            Persona per = new Persona(nombre, id);
           
            boolean newm = true;
            ArrayList<Mascota> mascotasV = new ArrayList<>();
            do {
                System.out.println("Los siguientes datos son del animal ");
                System.out.println("Identificación:");
                String idM = teclado.next();
                System.out.println("Nombre:");
                String nombreM = teclado.next();
                System.out.println("Color del pelaje:");
                String colorM = teclado.next();
                System.out.println("Tipo:");
                String tipoM = teclado.next();
                switch (tipoM) {
                    case "Gato":
                        boolean is = true;
                        System.out.println("Es cazador");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        int isC = teclado.nextInt();
                        if (isC == 2) {
                            is = false;
                        }
                        Gato gato = new Gato(is, idM, nombreM, colorM);
                        mascotasV.add(gato);
                        break;
                    case "Perro":
                        System.out.println("Raza:");
                        String raza = teclado.next();
                        Perro perro = new Perro(raza, idM, nombreM, colorM);
                        mascotasV.add(perro);
                        break;
                    case "Hamster":
                        System.out.println("Peso:");
                        double peso = teclado.nextDouble();
                        Hamster hamster = new Hamster(peso, idM, nombreM, colorM);
                        mascotasV.add(hamster);
                        break;
                    default:
                        System.out.println("El tipo de mascota ingresado no existe");
                        break;
                }
                per.setMascotas(mascotasV);
                System.out.println("Deseea registrar una nueva mascota de "+per+" :");
                System.out.println("1. Si");
                System.out.println("2. No");
                int m = teclado.nextInt();
                if (m == 2) {
                    newm = false;
                }
            } while (newm);
            vet.setMascotas(mascotasV);
             personas.add(per);  
             
        System.out.println("Deseea registrar una nueva persona:");
        System.out.println("1. Si");
        System.out.println("2. No");
        int p = teclado.nextInt();
        if (p == 2) {
        newp = false;
        }
        }while(newp);
            veterinarias.add(vet);
            System.out.println("Deseea registrar una nueva veterinaria:");
            System.out.println("1. Si");
            System.out.println("2. No");
            int v = teclado.nextInt();
            if (v == 2) {
                newv = false;
            }
        } while (newv);

        System.out.println("Informacion:");
        System.out.println("1. Informacion de una veterinaria");
        System.out.println("2. Mostrar todas las mascotas de todas las veterinarias registradas");
        System.out.println("3. Informacion de las mascotas de una persona");
        int buscarInf = teclado.nextInt();
        switch (buscarInf) {
            case 1:
                System.out.println("Nombre de la veterinaria que desea información:");
                String infV = teclado.next();
                Veterinaria vet = null;

                for (Veterinaria v : veterinarias) {
                    if (v.getNombre().equals(infV)) {
                        vet = v;
                    }
                }
                if (vet != null) {
                    System.out.println("1. Eliminar mascota ");
                    System.out.println("2. Mostrar por tipo de mascota ");
                    System.out.println("3. Mostrar mascotas ");
                    int inf = teclado.nextInt();

                    switch (inf) {
                        case 1:
                            System.out.println("Mascota que deseea eliminar: ");
                            String eliminar = teclado.next();

                            Mascota mascotaBusqueda = vet.buscarMascota(eliminar);
                            if (mascotaBusqueda != null) {
                                vet.eliminarPet(mascotaBusqueda);
                            } else {
                                System.out.println("La mascotas que desea eliminar "
                                        + "no existe en esta veterinaria ");
                            }
                            break;
                        case 2:
                            System.out.println("Tipo:");
                            String showTipo = teclado.next();
                            vet.mostrarPorTipo(showTipo);
                            
                            break;
                        case 3:
                            leerPets(vet);
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida");
                            break;
                    }
                } else {
                    System.out.println("La veterinaria ingresada no existe");
                }

            case 2:
                for (Veterinaria allVeterinarias : veterinarias) {
                    allVeterinarias.mostrarPet();
                }
                break;

            case 3:
                System.out.println("Nombre de la persona:");
                String dueno = teclado.next();
                System.out.println("Nombre de la veterinaria:");
                String buscarNombreV = teclado.next();
                Veterinaria duenoV = null;

                for (Veterinaria v : veterinarias) {
                    if (v.getNombre().equals(buscarNombreV)) {
                        duenoV = v;
                    }
                }
                if (duenoV != null) {
                    personaVet(duenoV, dueno);
                    break;

                } else {
                    System.out.println("La veterinaria ingresada no existe");
                }
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }

    public static void leerPets(Veterinaria v) {
        System.out.println("Mascotas: ");
        v.mostrarPet();
    }

    public static void personaVet(Veterinaria v, String n) {
        for (Persona p : personas) {
            if (p.getNombre().equals(n)) {
                p.showPets();
            } else {
                System.out.println("No se encuentran registradas mascotas de " + n
                        + "en la veterinaria");
            }
        }
    }
}
