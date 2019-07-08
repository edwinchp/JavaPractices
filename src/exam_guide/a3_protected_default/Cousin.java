package exam_guide.a3_protected_default; //protectedString is here
import exam_guide.a2_protected_default.A1_Parent;

/*
    From a different package, you can access to
    a superclass member
 */
public class Cousin extends A1_Parent {
    void testIt(){
        System.out.println("Protected protectedString from a different pkg: " + protectedString);
    }
}
