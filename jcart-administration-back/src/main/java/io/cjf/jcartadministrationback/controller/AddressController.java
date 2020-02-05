package io.cjf.jcartadministrationback.controller;

import io.cjf.jcartadministrationback.dto.out.AddressShowOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/getById")
    public AddressShowOutDTO getById(@RequestParam Integer addressId){
        return null;
    }

}
