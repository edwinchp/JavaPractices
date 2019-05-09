package exam_guide.access_modifiers;

//This class can only be used by other classes which are in the same package
class DefaultClass {
    private String defaultVar;

    public void setDefaultVar(String newVar){
        defaultVar = newVar;
    }

    public String getDefaultVar(){
        return defaultVar;
    }


}
