package exam_guide.a2_protected_default;

public class A1_Parent {
    /*
        This protected String can only be
        accessed by an extended class.
        That's it, is the only rule.
        It doesn't matter if the sub-class
        is OUTSIDE the package.
     */
    protected String protectedString = "I am a protected string and I come from A1_Parent class :)";

}
