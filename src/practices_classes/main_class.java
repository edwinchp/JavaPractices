package practices_classes;

public class main_class {
    public static void main(String args[]){
        System.out.println("Hi");

        Futbolista jugador = new Futbolista();

        String nombre = jugador.getNombre();
        System.out.println(nombre);

        jugador.setNombre("Edwin");
        System.out.println("new name is " + jugador.getNombre());


    }
}
