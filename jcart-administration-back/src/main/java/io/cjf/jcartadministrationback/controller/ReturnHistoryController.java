package io.cjf.jcartadministrationback.controller;

import io.cjf.jcartadministrationback.dto.in.ReturnHistoryCreateInDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/returnhistory")
public class ReturnHistoryController {

    @PostMapping("/create")
    public Integer create(@RequestBody ReturnHistoryCreateInDTO returnHistoryCreateInDTO){
        return null;
    }
}
