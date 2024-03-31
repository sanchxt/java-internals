public class DetailedEnums {
    enum Fruit {
        APPLE("red"), ORANGE("orange"), BANANA("yellow"), GRAPE("purple");

        private String color;

        Fruit(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }
    }

    public static void main(String[] args) {
        Fruit favFruit = Fruit.APPLE;
        System.out.println("Fav fruit: " + favFruit);
        System.out.println("Its color: " + favFruit.getColor());

        System.out.println("\nAll fruits:");
        for (Fruit fruit : Fruit.values()) {
            System.out.println(fruit + " - Color: " + fruit.getColor());
        }
    }
}
