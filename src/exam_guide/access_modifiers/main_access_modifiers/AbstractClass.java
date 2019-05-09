package exam_guide.access_modifiers.main_access_modifiers;
/*
    Abstract class can be instantiated
    Must always be subclassed
 */
public abstract class AbstractClass {
    private String strAbstract;
    public static String publicAbstrac;

    public void setStrAbstract(String str){
        this.strAbstract = str;
    }

    public String getStrAbstract(){
        return strAbstract;
    }
}
