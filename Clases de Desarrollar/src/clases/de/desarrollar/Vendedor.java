/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.de.desarrollar;

/**
 *
 * @author Javier
 */
public class Vendedor {

    /**
     * @param args the command line arguments
     */
        int numvend;
        String nomvend;
        String nombrecomer;
        String provincia;
        String localidad;
        String direccion;
        public Vendedor(int numvend, String nomvend, String nombrecomer, String provincia, String localidad, String direccion){
            this.numvend = numvend;
            this.nomvend = nomvend;
            this.nombrecomer = nombrecomer;
            this.provincia = provincia;
            this.localidad = localidad;
            this.direccion = direccion;
            
        }
        public void setnumvend(int numvend){
            this.numvend=numvend;
        }
        public void setnomvend(String nomvend){
            this.nomvend=nomvend;
        }
        public void setnombrecomer(String nombrecomer){
            this.nombrecomer=nombrecomer;
        }
        public void setprovincia(String provincia){
            this.provincia=provincia;
        }
        public void setlocalidad(String localidad){
            this.localidad=localidad;
        }
        public void setdireccion(String direccion){
            this.direccion=direccion;
        }
        public int getnumvend(){
            return numvend;
        }
        public String getnomvend(){
            return nomvend;
        }
        public String getnombrecomer(){
            return nombrecomer;
        }
        public String getprovincia(){
            return provincia;
        }
        public String getlocalidad(){
            return localidad;
        }
        public String getdireccion(){
            return direccion;
        }
        
        
}
