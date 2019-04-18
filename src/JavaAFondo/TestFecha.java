package JavaAFondo;

public class TestFecha {
    public static void main(String[] args){
        Fecha myFecha = new Fecha();
        myFecha.setDia(24);
        myFecha.setMes(03);
        myFecha.setAnio(2019);

        System.out.println(myFecha.getDia());
        System.out.println(myFecha.getMes());
        System.out.println(myFecha.getAnio());

        System.out.println(myFecha);
    }
}
