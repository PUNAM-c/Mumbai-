public class hybridinhertance {
    
    // Base class: Animal
    class Animal {
        void sound() {
            System.out.println("Animal makes sound");
        }
    }

    // Interface One: Wild
    interface Wild {
        void habitat();
    }

    // Interface Two: Pet
    interface Pet {
        void care();
    }

    // Derived class from Animal and Wild (multilevel inheritance)
    class Lion extends Animal implements Wild {
        @Override
        public void habitat() {
            System.out.println("Lion lives in the wild");
        }
    }

    // Another derived class from Animal and Pet (multilevel inheritance)
    class Dog extends Animal implements Pet {
        @Override
        public void care() {
            System.out.println("Dog needs daily care");
        }
    }

    // Hybrid class: Cross, which inherits from both Lion and Dog
    class Cross extends Lion {
        Dog petDog;

        Cross() {
            petDog = new Dog();
        }

        void petCare() {
            System.out.println("Cross pet care involves Lion and Dog care");
            habitat();     // From Lion (Wild)
            petDog.care();  // From Dog (Pet)
        }
    }

    // Main class
    public static void main(String[] args) {
    	hybridinhertance obj = new hybridinhertance();
        Cross hybrid = obj.new Cross();
        hybrid.sound();    // From Animal
        hybrid.habitat();  // From Lion (Wild)
        hybrid.petCare();  // From Cross (Hybrid)
    }
}
