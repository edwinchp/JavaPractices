package exam_guide.a3_protected_default;
import exam_guide.a2_protected_default.Child; // variable is here

public class CousinTwo extends Child {
    void testIt(){
        // It is possible to get access even though Child is in a different pkg
        System.out.println("From Child class" + variable);
    }

    /*
        This won't compile due to Child class is in a different pgk
        and cannot be referenced
     */
    Child child = new Child();
    //String someText =  child.variable;
}
