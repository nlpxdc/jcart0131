package io.cjf.jcartadministrationback.dto.out;

import java.util.List;

public class OrderInvoiceOutDTO {
    private Long orderId;
    private Long createTimestamp;
    private Short payMethod;

    private String invoiceAddress;

    private List<OrderProductOutDTO> orderProducts;
    private Double orderProductTotalPrice;

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

    public Short getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Short payMethod) {
        this.payMethod = payMethod;
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public List<OrderProductOutDTO> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(List<OrderProductOutDTO> orderProducts) {
        this.orderProducts = orderProducts;
    }

    public Double getOrderProductTotalPrice() {
        return orderProductTotalPrice;
    }

    public void setOrderProductTotalPrice(Double orderProductTotalPrice) {
        this.orderProductTotalPrice = orderProductTotalPrice;
    }
}
