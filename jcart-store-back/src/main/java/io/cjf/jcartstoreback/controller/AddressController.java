package io.cjf.jcartstoreback.controller;

import io.cjf.jcartstoreback.dto.in.AddressCreateInDTO;
import io.cjf.jcartstoreback.dto.in.AddressUpdateInDTO;
import io.cjf.jcartstoreback.dto.out.AddressListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/getMyAddresses")
    public List<AddressListOutDTO> getMyAddresses(Integer customerId){
        return null;
    }

    @PostMapping("/createMy")
    public Integer createMy(@RequestBody AddressCreateInDTO addressCreateInDTO, Integer customerId){
        return null;
    }

    @PostMapping("/updateMy")
    public void updateMy(@RequestBody AddressUpdateInDTO addressUpdateInDTO){

    }
}
