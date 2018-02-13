

package clase1;

import java.util.Scanner;
public class Variable {


    
    public static void main(String[] args) {
        int numero1=6,numero2=5,resultado=0;
        System.out.println(numero1);
        resultado=numero1+numero2;
        System.out.println("El resultado de la suma es: " +resultado+"");
        resultado=numero1-numero2;
        System.out.println("El resultado de la resta es: "+resultado+"");
        resultado=numero1/numero2;
        System.out.println("El resultado de la division es: "+resultado+"");
        
        
        //Esto llama la clase Persona con sus atributos
        Persona Per= new Persona();
        
        //Aqui se pide el dato que va a mostrar con el metodo set  la clase persona de sus atributos nombre y apellido
        Per.setNombre("Cristian");
        Per.setApellido("Vera");
        
         //Aqui se muestra los datos ingresados con el Get
        System.out.println(Per.getNombre());
        System.out.println(Per.getApellido());
        System.out.println(Per.nombre_completo());
        
        Per.setNombre("Zoraida");
        Per.setApellido("Espitia");
        //El "err" en el sout da color rojo al texto a imprimir en pantalla
        System.err.println("EL segundo estudiante se llama : "+Per.getNombre()+" "+Per.getApellido()+"");
        Per.setNombre("Andres");
        Per.setApellido("Guti");
        System.err.println("El tercer estudiante se llama: "+Per.getNombre()+" "+Per.getApellido()+"");
        
        
        Estudiante  Est= new Estudiante();
        Est.setNombre("David");
        Est.setApellido("Avila");
        Est.setCodigo("01");
        System.out.println("\n El nombre del estudiante es:\n "+Est.getNombre()+"\n Apellido:\n "+Est.getApellido()+"\n Y su codigo es:\n "+Est.getcodigo());
        System.out.println("El estudiante: "+Est.nombre_completo());
        
        
    }
    
}
