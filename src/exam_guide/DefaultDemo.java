package exam_guide;

//Not necessary to import the default class

import exam_guide.a1_main_access_modifiers.AbstractClass;
import exam_guide.a1_main_access_modifiers.FinalClass;

class DefaultDemo {
    public static void main(String[] args) {
        //DEFAULT CLASS
        DefaultClass dC = new DefaultClass();
        dC.setDefaultVar("Set to default class");

        String s = dC.getDefaultVar();

        System.out.println(s);

        //FINAL CLASS
        //Do not try to inherit from FinalClass, it won't work
        FinalClass fC = new FinalClass();
        fC.setIntVar(4);
        System.out.println(fC.getIntVar());
        //System.out.println(pubVar); //variable from FinalClass


        AbstractClass abstClass = new AbstractClass() {
        }
    }
}
