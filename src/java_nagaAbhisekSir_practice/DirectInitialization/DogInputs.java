package java_nagaAbhisekSir_practice.DirectInitialization;

public class DogInputs {
    private String breed;
    private String color;
    private int price;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws RuntimeException{
        if (price > 0 ){
            this.price = price;
        }else {
            throw new RuntimeException("Price can't be negative or zero......") ;
        }
    }
}
