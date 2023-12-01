// ChildClass.java
public class ChildClass extends ParentClass {
    private boolean additionalField;

    public ChildClass(int privateField, String protectedField, double publicField, boolean additionalField) {
        super(privateField, protectedField, publicField);
        this.additionalField = additionalField;
    }

    public void childMethod() {
        System.out.println("This is a method in ChildClass.");
    }
}
