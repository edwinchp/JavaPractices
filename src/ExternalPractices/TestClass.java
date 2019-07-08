package ExternalPractices;

/*
    Wait! You can't import a class that has
    a Default access modifier. TestClass is not
    in the same package as DefaultClass.

 */
//import exam_guide.DefaultClass;

/*
    A1_Parent is a public class, which has a protected member.
    Just a funny fact, I just realized a class cannot be protected lol.
 */
import exam_guide.a2_protected_default.A1_Parent;

public class TestClass extends A1_Parent {

    public static void main(String[] args) {

        /*
            As you can't import a Default class,
            you won't be able to instantiate it. Dah!
         */
        //DefaultClass dC = new DefaultClass();



        /*
            You are inside a static method, so you can't access
            to a member from outside the class if that is not
            static too. With that been said, see the testIt() method.
         */
        //System.out.println(protectedString);

    }

    void testIt(){
        /*
            You CAN access to a protected member,
            no matter if you are trying to use it from
            an outside package as long as you call it
            from a subclass.
         */
        System.out.println("From Child class" + protectedString);
    }
}
