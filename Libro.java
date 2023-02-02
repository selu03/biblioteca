
package clases.Biblioteca;
public class Libro {
String titulo;
String autor;
int ejemplares;
int prestados;


Libro() {
    
}
Libro(String titulo,String autor,int ejemplares,int prestados){
titulo=this.titulo;
autor=this.autor;
ejemplares=this.ejemplares;
prestados=this.prestados;
}
void settitulo(String titulo) {
   this.titulo=titulo; 
}
void setautor(String autor) {
    this.autor=autor;
}
void setejemplares(int ejemplares) {
    this.ejemplares=ejemplares;
}
void setprestados(int prestados) {
  this.prestados=prestados; 
}
String getitulo(){
    return this.titulo;
}
String getautor(){
    return this.autor;
}
int getjemplares(){
    return this.ejemplares;
}
int getjprestados(){
    return this.prestados;
}
boolean prestamos(){
    boolean respuesta;
    
    
    if(this.ejemplares>0) {
        this.ejemplares--;
        this.prestados++;
        respuesta=true;
        
    }else{
        respuesta=false;
    }
    return respuesta;
}
boolean devolucion() {
    boolean res;
    if (this.prestados>0) {
        this.ejemplares++;
        this.prestados--;
        res=true;
    }else{
        res=false;

    }return res;
}

public String toString() {
return "El titulo " +this.titulo+ " escrito por el autor " +this.autor+ ", ha producido un total de " +this.ejemplares+ " ejemplares y ha prestado " +this.prestados;

}
}
    



