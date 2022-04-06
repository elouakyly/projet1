package superjeu;

public class House extends SpacialElement {
    private int price;

    public House(String name, int x, int y, int price) {
        super(name, x, y);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("House{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
