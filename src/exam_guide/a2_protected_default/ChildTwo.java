package exam_guide.a2_protected_default;

/*
    It is possible to inherit a protected member
    from a subclass when that member is in
    a superclass
 */

public class ChildTwo extends Child{
    void testIt(){
        System.out.println("Variable from parent & child class" + variable);
    }
}
