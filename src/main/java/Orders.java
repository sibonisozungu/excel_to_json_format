import java.util.Date;

public class Orders {
    private String orderId;
    private String orderDate;
    private String shipDate;
    private String shipMode;
    private String customerID;
    private String customerName;
    private String country;
    private String region;
    private String productId;
    private String salesAmount;
    private String quantity;
    private String discountAmount;
    private String profitAmount;

    public Orders() {
    }

    public Orders(String orderId, String orderDate, String shipDate, String shipMode, String customerID, String customerName, String country, String region, String productId, String salesAmount, String quantity, String discountAmount, String profitAmount) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.shipDate = shipDate;
        this.shipMode = shipMode;
        this.customerID = customerID;
        this.customerName = customerName;
        this.country = country;
        this.region = region;
        this.productId = productId;
        this.salesAmount = salesAmount;
        this.quantity = quantity;
        this.discountAmount = discountAmount;
        this.profitAmount = profitAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getShipDate() {
        return shipDate;
    }

    public String getShipMode() {
        return shipMode;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getProductId() {
        return productId;
    }

    public String getSalesAmount() {
        return salesAmount;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public String getProfitAmount() {
        return profitAmount;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public void setShipMode(String shipMode) {
        this.shipMode = shipMode;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setSalesAmount(String salesAmount) {
        this.salesAmount = salesAmount;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setProfitAmount(String profitAmount) {
        this.profitAmount = profitAmount;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId='" + orderId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", shipDate='" + shipDate + '\'' +
                ", shipMode='" + shipMode + '\'' +
                ", customerID='" + customerID + '\'' +
                ", customerName='" + customerName + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", productId='" + productId + '\'' +
                ", salesAmount=" + salesAmount +
                ", quantity=" + quantity +
                ", discountAmount=" + discountAmount +
                ", profitAmount=" + profitAmount +
                '}';
    }
}
