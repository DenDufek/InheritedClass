public class ParentClass {
    private int intValue;
    private String stringValue;
    private double doubleValue;

    // Конструктор з параметрами
    public ParentClass(int intValue, String stringValue, double doubleValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
        this.doubleValue = doubleValue;
    }

    // Звичайний конструктор (без параметрів)
    public ParentClass() {
        // Залишаємо пустий конструктор, якщо вам потрібно
    }

    // Решта коду класу...

    public void displayMessage() {
        System.out.println("Message from ParentClass");
    }
}
