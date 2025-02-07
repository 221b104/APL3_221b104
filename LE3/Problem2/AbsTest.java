
abstract class AbsTest implements Testable {
}

class ConcreteTest extends AbsTest {
    
    public void display() {
        System.out.println("Display method implemented in ConcreteTest class.");
    }

    public static void main(String[] args) {
        ConcreteTest concreteTestObj = new ConcreteTest();
        concreteTestObj.display();
    }
}
