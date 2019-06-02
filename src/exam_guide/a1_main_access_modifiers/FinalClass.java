package exam_guide.a1_main_access_modifiers;

/*
    Final class CANNOT be extended/subclassed
    It can ONLY be instantiated
 */

public final class FinalClass {
    private int intVar;
    public static int pubVar;

    public void setIntVar(int intVar1) {
        this.intVar = intVar1;
    }

    public int getIntVar() {
        return intVar;
    }

    // Instantiated
    FinalClass finalClass = new FinalClass();

}
