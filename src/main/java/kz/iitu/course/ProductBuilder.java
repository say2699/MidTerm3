package kz.iitu.course;

import org.springframework.stereotype.Component;

@Component
public class ProductBuilder implements Builder {
    private Product product;

    public void reset() {
        this.product = new Product();
    }
    public Product getResult() {
        return this.product;
    }

    public void setID(int id) {
        this.product.setID(id);
    }
    public void setPrice(int price) {
        this.product.setPrice(price);
    }

    public void setName(String name) {
        this.product.setName(name);
    }
    public void setAmount(int amount) {
        this.product.setAmount(amount);

    }

}
