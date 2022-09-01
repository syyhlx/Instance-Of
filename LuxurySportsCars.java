public class LuxurySportsCars {

    public static void main(String[] args) {
        new LuxurySportsCars.LuxuryCar().printlnDesire();
        new LuxurySportsCars.CheapCar().printlnDesire();
        new LuxurySportsCars.Ferrari().printlnDesire();
        new LuxurySportsCars.GeoMetro().printlnDesire();
    }

    public static class LuxuryCar {
        protected void printlnDesire() {
            System.out.println("I want to drive a luxury car.");
        }
    }

    public static class CheapCar {
        protected void printlnDesire() {
            System.out.println("I want to drive a cheap car.");
        }
    }
    public static class Ferrari extends LuxuryCar{
        public void printlnDesire() {
            System.out.println("I want to drive a Ferrari.");
        }
    }

    public static class GeoMetro extends CheapCar{
        public void printlnDesire() {
            System.out.println("I want to drive a Geo Metro.");
        }
    }

    public static class Constants {
        public static String WANT_STRING = "I want to drive ";
        public static String LUXURY_CAR = "a luxury car";
        public static String CHEAP_CAR = "a cheap car";
        public static String FERRARI_NAME = "a Ferrari";
        public static String GEO_METRO_NAME = "a Geo Metro";
    }
}
