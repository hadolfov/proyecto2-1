/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.pkg1;

import java.util.Scanner;

class persona {
    private String nombre;
    private String apellido;
    private String edad;
    private String sexo;

    void registrar(){
        Scanner lector = new Scanner(System.in);
        String texto; 
        System.out.print("Digite el nombre: ");
        this.nombre = lector.next();
        System.out.print("Digite el apellido: ");
        this.apellido = lector.next();
        System.out.print("Digite la edad: ");
        this.edad = lector.next();
        System.out.print("Digite el sexo: ");
        this.sexo = lector.next();
    }

    void imprimirDatos(){
        System.out.println(this.apellido + " " + this.nombre + " " + this.edad + " " + this.sexo);
    }
}