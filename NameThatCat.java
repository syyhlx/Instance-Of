
import java.util.*;
public class NameThatCat {

    public static void main(String[] args) throws Exception {
        // using InputStreamReader
        String nameThatKitty = "";
        try {
            Scanner scanInput = new Scanner(System.in);

            while (scanInput.hasNext()) {
                nameThatKitty = scanInput.next();

                //System.out.println("Your name is: " + nameThatKitty);
                Cat newKitten = CatFactory.getCatByKey(nameThatKitty.toLowerCase());
                System.out.println(newKitten.toString());
            }

            //System.out.println("bye bye!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "feral":
                    cat = new MeanCat("Claws");
                    break;
                case "miss":
                    cat = new NiceCat("Missy");
                    break;
                case "smudge":
                    cat = new NiceCat("Smudgey");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "I'm " + getName() + ", an alley cat";
        }
    }

    static class MeanCat extends Cat {
        MeanCat(String name) {
            super(name);
        }

        public String toString() {
            return "I'm " + getName() + ", and I'm going to claw your eyes out";
        }
    }

    static class NiceCat extends Cat {
        NiceCat(String name) {
            super(name);
        }

        public String toString() {
            return "I'm a nice kitten named " + getName();
        }
    }
}
