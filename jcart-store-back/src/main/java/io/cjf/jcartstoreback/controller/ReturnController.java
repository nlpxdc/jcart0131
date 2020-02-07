package io.cjf.jcartstoreback.controller;

import io.cjf.jcartstoreback.dto.in.ReturnCreateInDTO;
import io.cjf.jcartstoreback.dto.out.PageOutDTO;
import io.cjf.jcartstoreback.dto.out.ReturnListOutDTO;
import io.cjf.jcartstoreback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @PostMapping("/create")
    public Integer create(@RequestBody ReturnCreateInDTO returnCreateInDTO){
        return null;
    }

    @GetMapping("/getWithPage")
    public PageOutDTO<ReturnListOutDTO> getWithPage(@RequestParam Integer pageNum,
                                                    Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }
}
