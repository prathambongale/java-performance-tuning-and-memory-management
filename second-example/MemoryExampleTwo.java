public class MemoryExampleTwo {
    
    public static void main(String[] args) {
        MemoryExampleTwo main = new MemoryExampleTwo();
        main.start();
    }

    public void start() {
        String last = "Z";
        Container container = new Container();
        container.setInitial("C");
        another(container, last);
        System.out.println(container.getInitial());
    }

    public void another(Container initialHolder, String newInitial) {
        newInitial.toLowerCase();
        initialHolder.setInitial("B");
        Container initial2 = new Container();
        initialHolder=initial2;
        System.out.println(initialHolder.getInitial());
        System.out.println(newInitial);
    }
}
