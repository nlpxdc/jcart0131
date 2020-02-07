package io.cjf.jcartstoreback.dto.out;

import java.util.List;

public class ReturnShowOutDTO {
    private Integer returnId;
    private Long orderId;
    private Long createTimestamp;
    private Long orderTimestamp;
    private String productCode;
    private String productName;
    private Integer quantity;
    private Byte reason;
    private Boolean opened;
    private Byte action;
    private List<ReturnHistoryOutDTO> returnHistories;

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

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

    public Long getOrderTimestamp() {
        return orderTimestamp;
    }

    public void setOrderTimestamp(Long orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Byte getReason() {
        return reason;
    }

    public void setReason(Byte reason) {
        this.reason = reason;
    }

    public Boolean getOpened() {
        return opened;
    }

    public void setOpened(Boolean opened) {
        this.opened = opened;
    }

    public Byte getAction() {
        return action;
    }

    public void setAction(Byte action) {
        this.action = action;
    }

    public List<ReturnHistoryOutDTO> getReturnHistories() {
        return returnHistories;
    }

    public void setReturnHistories(List<ReturnHistoryOutDTO> returnHistories) {
        this.returnHistories = returnHistories;
    }
}
