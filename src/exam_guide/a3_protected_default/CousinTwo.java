package exam_guide.a3_protected_default;
import exam_guide.a2_protected_default.Child; // protectedString is here

public class CousinTwo extends Child {
    void testIt(){
        // It is possible to get access to METHOD even though Child is in a different pkg
        System.out.println("From Child class" + protectedString);
    }

    /*
        This won't compile due to Child class is in a different pgk
        and cannot be referenced. Well, if you make protectedString static,
        it will compile.
        The problem is that, I think, if the value of protectedString changes,
        you just have instantiated an object from that class with values that also
        have changed, making that object unstable. But not sure, let me read a little
        more about it and and post it here later. -Edwin. July 6, 2019.
     */
    Child child = new Child();
    //String someText =  child.protectedString;
}
