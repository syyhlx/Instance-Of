import java.util.ArrayList;
import java.util.List;

public class InhertitanceProblems {

    public static interface LivingPart {
        Object containsBones();
    }

    public static class BodyPart implements LivingPart {
        private String name;

        public BodyPart(String name) {
            this.name = name;
        }

        public Object containsBones() {
            String response = "Yes";
            return response;
        }

        public String toString() {
            return "Yes".equals(containsBones()) ? name + " contains bones"
                    : name + " does not contain bones";
        }
    }

    public static class Finger extends BodyPart {
        private boolean isArtificial;

        public Finger(String name, boolean isArtificial) {
            super(name);
            this.isArtificial = isArtificial;
        }

        public Object containsBones() {
            return "Yes".equals(super.containsBones()) && !isArtificial ? "Yes": "No" ;
        }
    }

    public static void main(String[] args) {
        printlnFingers();
        printlnBodyParts();
        printlnLivingParts();
    }

    private static void printlnLivingParts() {
        System.out.println(new BodyPart("Hand").containsBones());
    }

    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("Hand"));
        bodyParts.add(new BodyPart("Leg"));
        bodyParts.add(new BodyPart("Head"));
        bodyParts.add(new BodyPart("Body"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("Thumb", true));
        fingers.add(new Finger("Forefinger", true));
        fingers.add(new Finger("Middle finger", true));
        fingers.add(new Finger("Ring-finger", false));
        fingers.add(new Finger("Pinky", true));
        System.out.println(fingers.toString());
    }
}
