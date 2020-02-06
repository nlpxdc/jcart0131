package io.cjf.jcartadministrationback.dto.out;

public class OrderProductShipOutDTO {
    private Integer orderProductId;
    private String orderProductCode;
    private String orderProductName;
    private Integer orderProductQuantity;

    public Integer getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(Integer orderProductId) {
        this.orderProductId = orderProductId;
    }

    public String getOrderProductCode() {
        return orderProductCode;
    }

    public void setOrderProductCode(String orderProductCode) {
        this.orderProductCode = orderProductCode;
    }

    public String getOrderProductName() {
        return orderProductName;
    }

    public void setOrderProductName(String orderProductName) {
        this.orderProductName = orderProductName;
    }

    public Integer getOrderProductQuantity() {
        return orderProductQuantity;
    }

    public void setOrderProductQuantity(Integer orderProductQuantity) {
        this.orderProductQuantity = orderProductQuantity;
    }
}
