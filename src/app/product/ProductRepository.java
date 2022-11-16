package app.product;

import app.product.subproduct.Sandwich;

public class ProductRepository {

    private Product [] products = {
            new Sandwich(1, " 로스트 치킨 샌드위치", 5000, 600, false, 8000),
             new Sandwich(2, " 애그마요 샌드위치", 4000, 400, false, 7000),
            new Sandwich(3, " 이탈리안 BMT 샌드위치", 5000, 600, false, 8000),
            new Sandwich(4, " 베지테리안 샌드위치", 5000, 600, false, 8000)
    };

    public Product[] getAllSandwich() {return products;}

    public Product findById(int productId){
        for (Product product : products) {
            if (product.getId() == productId) return product;
        }
        return null;
    }
}
