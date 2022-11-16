package app.product;

/** 완성 제품에 관련한 부분
 * 생성자에서 완성 제품/ 재료를 따로 생성
 */
public class Product {
    private int id;
    private String name;
    private int price;
    private int kcal;

    public Product(int id, String name, int price, int kcal) { // 샌드위치류
        this.id = id;
        this.name = name;
        this.price = price;
        this.kcal = kcal;
    }

    public Product(int id, String name, int kcal) { // 재료
        this.id = id;
        this.name = name;
        this.kcal = kcal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }
}
