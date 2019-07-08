package exam_guide.a2_protected_default;

/*
    It is possible to inherit a protected member
    from superclass
 */

public class Child extends A1_Parent {
     void test(){
        System.out.println("Variable from parent class" + protectedString); //protectedString is protected
    }
}
