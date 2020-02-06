package io.cjf.jcartadministrationback.dto.out;

import java.util.List;

public class OrderShowOutDTO {
    private Long orderId;
    private Long createTimestamp;
    private Short payMethod;
    private Short shipMethod;
    private Double shipPrice;
    private Integer customerId;
    private String customerName;
    private String customerMobile;
    private String customerEmail;
    private Integer rewordPoints;

    private String invoiceAddress;
    private String shipAddress;

    private List<OrderProductOutDTO> orderProducts;
    private Double orderProductTotalPrice;
    private Double totalPrice;

    private List<OrderHistoryOutDTO> orderHistories;


}
