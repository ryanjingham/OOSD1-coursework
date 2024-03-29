package Part3Only;

public class Engine extends StockItem{
    private int horsepower;

    public Engine(String stockCode, int quantity, double price, int horsepower) {

        super(stockCode, quantity, price);
        this.horsepower = horsepower;
    }

    public String getStockName() {return "Engine";}

    public String getStockDescription() {return "car engine";}

    public String classToString() {
        String returnedString = "Stock Code : " + getFixedStockCode() + "\nStock Name : " + getStockName() +
                "\nStock Description : " + getStockDescription() + "\nQuantity in stock : " + getQuantity() +
                "\nPrice before VAT : " + getPrice() + "\nPrice after VAT : " + getPriceVAT();
        return returnedString;
    }
}
