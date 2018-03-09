public class AUTO {
private int puertas;
private int llantas;
private int personas;
private boolean prender, status;
private String color, nombre;

public AUTO (int puertas, int llantas, int personas, boolean prender, boolean status, String color, String nombre){
 
   this.puertas=puertas;
    this.llantas = llantas;
    this.personas = personas;
   this.prender=prender;
    this.status = status;
    this.color = color;
    this.nombre = nombre;
}//finar del costructor

    AUTO(int i, int i0, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public void encender(boolean a){
    this.prender=a;
}//final de encender
public boolean getprender(){
    System.out.println("el coche esta:"+prender);
    return prender;
}//final de prender
public boolean getstatus(){
    System.out.println("El statatus de coche es:"+status);
} //fun del status
public void getPuertas(){
    System.out.println("el coche tiene:"+puertas+"puertas");
} //fin de puertas
public int getllantas(){
    System.out.println("el coche tiene:"+llantas+"llantas");
    return llantas;
}//termino de llantas
public void getpersonas(){
   System.out.println("El cnumero de personas es::"+personas); 
}//fin de el personas
public void getcolor(){
    System.out.println("El color del coche es:"+color);
}//fin del color
public void getnombre (){
    System.out.println("El nombre del coche es"+nombre);
}
public void ToString(){
    String Aux="";
    Aux="el aut tiene\n"+llantas+"llantas\n"+puertas+"puertas\n esta";
    if(prender){
          Aux=Aux"encendido";
    }else{
        Aux=Aux+"apagado";
        return Aux;
    }//fin del tosting


}

    int getpuertas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class string {

        public string() {
        }
    }
}