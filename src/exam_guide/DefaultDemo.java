package exam_guide;

//Not necessary to import the default class

class DefaultDemo {
    public static void main(String[] args) {
        DefaultClass dC = new DefaultClass();
        dC.setDefaultVar("SOMETHING");

        String s = dC.getDefaultVar();

        System.out.println(s);
    }
}
