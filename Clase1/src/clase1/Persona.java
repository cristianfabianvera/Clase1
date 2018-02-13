/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;


public class Persona {

    String Nombre;
    String Apellido;
    
    //Se crea la clase publica en vez de vacia(void) se deja String o int como se necesite 
    public String nombre_completo(){

String nombre_completo;
nombre_completo = Nombre +""+ Apellido;


    //Recuerde que cuando se crea clase String o int en vez de void retorna se agrea el return 
return nombre_completo;

        }
//Aqui se llaman los getter and setter dando click derecho "insert code" y hay estan se seleccionan todos  
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }
}