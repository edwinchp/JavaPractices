package exam_guide.a3_protected_default; //variable is here
import exam_guide.a2_protected_default.Parent;

/*
    From a different package, you can access to
    a superclass member
 */
public class Cousin extends Parent {
    void testIt(){
        System.out.println("Protected variable from a different pkg: " + variable);
    }
}
