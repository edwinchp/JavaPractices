package exam_guide.access_modifiers.main_access_modifiers;

/*
Final class can be instantiated
Cannot be subclassed
 */
public final class FinalClass {
    private int intVar;
    public static int pubVar;

    public void setIntVar(int intVar1){
        this.intVar = intVar1;
    }

    public int getIntVar(){
        return intVar;
    }


}
