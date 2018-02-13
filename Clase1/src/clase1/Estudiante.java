/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

//Aqui se creo la clase heredada de Persona con el "extends"

public class Estudiante extends Persona{

String codigo;

public String getcodigo(){

return codigo;
}

//El "@Override" es el polimorfismo y aqui ya permite agregar mas variables a la clase como se ve  a bajo en "nombre_completo" 
@Override
 public String nombre_completo(){

String nombre_completo;
nombre_completo = Nombre +" "+ Apellido+" "+codigo;


    //Recuerde que cuando se crea clase String o int en vez de void retorna se agrea el return 
return nombre_completo;

 }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    

}
