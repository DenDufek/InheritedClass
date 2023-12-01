public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт класу ParentClass
        ParentClass parentObject = new ParentClass(42, "Parent", 3.14);
        System.out.println("ParentClass object: " + parentObject);

        // Створюємо об'єкт класу ChildClass
        ChildClass childObject = new ChildClass(42, "Child", 3.14, true);
        System.out.println("ChildClass object: " + childObject);

        // Створюємо об'єкт класу AnotherClass
        AnotherClass anotherObject = new AnotherClass("Another");
        System.out.println("AnotherClass object: " + anotherObject);
    }
}
