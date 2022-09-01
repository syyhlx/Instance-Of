public class AnimalInheritance {

    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "like a dinosaur";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "like a cat";
        }
    }
    public static class Dragon extends BigAnimal {
        protected String getSize() {
            return "A dragon is big, " + super.getSize();
        }
    }

    public static class Goose extends SmallAnimal {
        public String getSize() {
            return "A goose is small, " + super.getSize();
        }
    }
}
