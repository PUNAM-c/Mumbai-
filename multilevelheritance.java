// Interface One
interface One {
    public void print_one();
}

// Interface Two
interface Two {
    public void print_two();
}

// Interface Three inheriting from One and Two
interface Three extends One, Two {
    public void print_three();
}

// Class implementing Three interface
class Child implements Three {
    @Override
    public void print_one() {
        System.out.println("One");
    }

    @Override
    public void print_two() {
        System.out.println("Two");
    }

    @Override
    public void print_three() {
        System.out.println("Three");
    }
}

// Main class
public class multilevelheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.print_one();    // Output: One
        c.print_two();    // Output: Two
        c.print_three();  // Output: Three
    }
}
