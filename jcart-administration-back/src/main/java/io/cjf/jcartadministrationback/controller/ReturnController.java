package io.cjf.jcartadministrationback.controller;

import io.cjf.jcartadministrationback.dto.in.ReturnUpdateInDTO;
import io.cjf.jcartadministrationback.dto.out.PageOutDTO;
import io.cjf.jcartadministrationback.dto.out.ReturnListOutDTO;
import io.cjf.jcartadministrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(@RequestParam(required = false) Integer returnId,
                                               @RequestParam(required = false) Long orderId,
                                               @RequestParam(required = false) String customerName,
                                               @RequestParam(required = false) String productCode,
                                               @RequestParam(required = false) String productName,
                                               @RequestParam(required = false) Byte status,
                                               @RequestParam(required = false) Long createTimestamp,
                                               @RequestParam(required = false) Long updateTimestamp,
                                               @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody ReturnUpdateInDTO returnUpdateInDTO){

    }
}
