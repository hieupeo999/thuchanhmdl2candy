public class Candy {
    public static int value = 0;
    private int id;
    private String color;
    private String property;
    private int amount;
    private int price;

    public Candy() {
    }

    public Candy(int id, String color, String property, int amount, int price) {
        this.id = ++value;
        this.color = color;
        this.property = property;
        this.amount = amount;
        this.price = price;
    }
    public Candy( String color, String property, int amount, int price) {

        this.color = color;
        this.property = property;
        this.amount = amount;
        this.price = price;
    }



    public static int getValue() {
        return value;
    }

    public static void setValue(int value) {
        Candy.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", property='" + property + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
