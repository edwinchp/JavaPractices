package practices_classes;

public class Futbolista {
    /*******Attributes*******/
    String nombre = "Pepito";
    String apellido;
    String dni;
    String posicion;
    double valor;

    /*******Methods*******/
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getDni(){
        return  dni;
    }
    public  String getPosicion(){
        return posicion;
    }

    public double getValor(){
        return valor;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
}
