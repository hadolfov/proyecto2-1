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

    public persona() {
    }

    public persona(String nombre, String apellido, String edad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    public persona(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = "-";
    }

    public persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = "-";
        this.sexo = "-";
    }

    public persona(String nombre) {
        this.nombre = nombre;
        this.apellido = "-";
        this.edad = "-";
        this.sexo = "-";
    }
    
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}