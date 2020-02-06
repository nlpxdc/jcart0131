package io.cjf.jcartadministrationback.controller;

import io.cjf.jcartadministrationback.dto.out.OrderListOutDTO;
import io.cjf.jcartadministrationback.dto.out.OrderShowOutDTO;
import io.cjf.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(@RequestParam(required = false) Long orderId,
                                              @RequestParam(required = false) String customerName,
                                              @RequestParam(required = false) Byte status,
                                              @RequestParam(required = false) Double totalPrice,
                                              @RequestParam(required = false) Long createTimestamp,
                                              @RequestParam(required = false) Long updateTimestamp,
                                              @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(){
        return null;
    }

    public
}
