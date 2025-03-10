//Memory Management
//Stack vs. Heap
public class MemoryExample {
    static void method1() {
        int x = 10; // Stored in Stack
        Integer y = new Integer(20); // Stored in Heap
    }

    public static void main(String[] args) {
        method1();
    }
}
