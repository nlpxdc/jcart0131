package io.cjf.jcartadministrationback.dto.out;

import java.util.List;

public class OrderShipOutDTO {
    private Long orderId;
    private Long createTimestamp;
    private Short shipMethod;
    private Double shipPrice;
    private String shipAddress;
    private String receiverName;
    private String receiverMobile;

    private List<OrderProductShipOutDTO> orderProducts;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public Short getShipMethod() {
        return shipMethod;
    }

    public void setShipMethod(Short shipMethod) {
        this.shipMethod = shipMethod;
    }

    public Double getShipPrice() {
        return shipPrice;
    }

    public void setShipPrice(Double shipPrice) {
        this.shipPrice = shipPrice;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public List<OrderProductShipOutDTO> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(List<OrderProductShipOutDTO> orderProducts) {
        this.orderProducts = orderProducts;
    }
}
