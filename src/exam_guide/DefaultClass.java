package exam_guide;

    /*
        This class can only be used by other classes which are in the same package.
        The Default access modifier is implicit added. That's why it is not declare it.
        You can't declare a default class this way: default class DefaultClass {
        Just don't add the public, protected and private.
     */
    class DefaultClass {
    private String defaultVar;

    /*
        Those methods are public, but it is pointless
        to declare it that way because the class itself
        where they are stored, is Default.
     */
    public void setDefaultVar(String newVar) {
        defaultVar = newVar;
    }

    public String getDefaultVar() {
        return defaultVar;
    }


}
