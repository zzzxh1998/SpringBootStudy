package xiaohu.entity;

public class orderdetails {
    private Integer orderNumber;
    private String productCode;
    private Integer priceEach;
    private Integer orderLineNumber;

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(Integer priceEach) {
        this.priceEach = priceEach;
    }

    public Integer getOrderLineNumber() {
        return orderLineNumber;
    }

    public void setOrderLineNumber(Integer orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }

    @Override
    public String toString() {
        return "orderdetails{" +
                "orderNumber=" + orderNumber +
                ", productCode='" + productCode + '\'' +
                ", priceEach=" + priceEach +
                ", orderLineNumber=" + orderLineNumber +
                '}';
    }
}
