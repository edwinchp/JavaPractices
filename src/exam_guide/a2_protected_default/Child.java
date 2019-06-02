package exam_guide.a2_protected_default;

/*
    It is possible to inherit a protected member
    from superclass
 */

public class Child extends Parent{
     void test(){
        System.out.println("Variable from parent class" + variable); //variable is protected
    }
}
