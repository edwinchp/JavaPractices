package exam_guide.a1_main_access_modifiers;

/*
    Abstract class CANNOT be instantiated
    It can ONLY be extended/subclassed
 */

public abstract class AbstractClass {
    private String strAbstract;
    public static String publicAbstrac;

    public void setStrAbstract(String str) {
        this.strAbstract = str;
    }

    public String getStrAbstract() {
        return strAbstract;
    }
}
