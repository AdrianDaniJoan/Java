/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasmediasarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adria
 */
public class Notasmediasarray {
    public static Scanner teclado= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escaner de teclado
        
        //Reservo memoria para el ArrayList
        ArrayList<Double> lista= new ArrayList<Double>();
        ArrayList<M_Media> listamedia= new ArrayList<M_Media>();
        String nombre;
        String alumno;
        Double resultado=0.0;
        //Vamos a establecer el nombre de la asignatura
        do {
        System.out.println("Introduzca el nombre del alumno");
        alumno=teclado.next();
        if (!"q".equals(alumno)) {
        System.out.println("Introduzca la materia");
        nombre=teclado.next();
        while (!"s".equals(nombre)) {
        calcularMedia(lista,nombre,alumno,listamedia);
            System.out.println("Introduzca la siguiente materia");
        nombre=teclado.next();
        }
        double notatotal=0;
        int cont=0;
        if (!"q".equals(alumno)){
        /*for (M_Media a:listamedia) {
            if (a.getNombre_Alumno()==alumno) {
                notatotal=notatotal+a.getNota_media();
                cont++;
            }
        }*/
        //notatotal=notatotal/cont;
            //System.out.println("La nota media en las asignatus del alumno "+alumno+" es igual a "+notatotal);
        //M_Media juntar = new M_Media(alumno,notatotal);
        //listamedia.add(juntar);
        }
        } else {
            //Salir del bucle while y if
            System.out.println("adios");
            break;
        }
        } while (nombre != "q");
        for (M_Media a:listamedia) {
            System.out.println("El nombre del alumno es "+a.getNombre_Alumno()+" y en la materia "+a.getNombre()+" tiene de media: "+a.getNota_media());
        }
    }
    
    
    public static void calcularMedia(ArrayList<Double> lista,String nombre,String alumno,ArrayList<M_Media> guardar){
        //Atributos y escaneres
        Double nota;
        lista.clear();
        Double resultado=0.0;
        //Realizamos la media
        System.out.println("Introduza las notas del alumno "+alumno);
        System.out.println("Introduce '-1' para salir del programa");
        do {
        nota=teclado.nextDouble();
        if (nota>=0){
        lista.add(nota);
        }
        } while (nota >= -0.5);
        for (Double a:lista) {
            resultado=resultado+a;
        }
        resultado=resultado/lista.size();
        System.out.println("El resultado es de la materia "+nombre+" es "+resultado);
        //M_Media juntar= new M_Media();
        //juntar.setNombre(nombre);
        //juntar.setNota_media(resultado);
        M_Media juntar = new M_Media(nombre,resultado,alumno);
        guardar.add(juntar);
            
            };
}
