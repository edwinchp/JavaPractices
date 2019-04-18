package JavaAFondo;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public String toString(){
        return "La fecha es: " + dia + "/" + mes + "/" + anio;
    }


    //SETTERS AND GETTERS
    public int getDia(){
        return dia;
    }

    public void setDia(int sDia){
        this.dia = sDia;
    }

    public int getMes(){
        return mes;
    }

    public void setMes(int sMes){
        this.mes = sMes;
    }

    public int getAnio(){
        return anio;
    }

    public void setAnio(int sAnio){
        this.anio = sAnio;
    }
}
