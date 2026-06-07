package app;

import model.Direccion;
import model.Persona;
import model.Empleado;

public class Main {
    public static void main (String[] args){

        // objeto 1 : Dirección
        Direccion dir1 = new Direccion("General Freire 0627",
                "La Cisterna", "Santiago");

       // objeto 2 : Persona (cliente)
       Persona cliente = new Persona("Daniela Herrera",
                "18.694.730-4","dherrerav.94@gmail.com",dir1);

       // objeto 3 : Empleado(Guia turistico)
       Direccion dir2 = new Direccion("Mexico 541",
                "Recoleta", "Santiago");
       Empleado guia = new Empleado("Juan Perez",
                "10.123.456-5", "juan.perez@gmail.com",
                dir2, "Guia Turistico", 800000);


       System.out.println("****** CLIENTE ******");
       System.out.println(cliente);
       System.out.println("\n****** EMPLEADO ******");
       System.out.println(guia);
       

    }
}