package io.cjf.jcartstoreback.controller;

import io.cjf.jcartstoreback.dto.in.CustomerRegisterInDTO;
import io.cjf.jcartstoreback.dto.out.CustomerProfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/register")
    public Integer register(CustomerRegisterInDTO customerRegisterInDTO){
        return null;
    }

    @GetMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password){
        return null;
    }

    @GetMapping("/getProfile")
    public CustomerProfileOutDTO getProfile(Integer customerId){
        return null;
    }

    @PostMapping("/changePassword")
    public void changePassword(@RequestParam String originPwd,
                               @RequestParam String newPwd,
                               Integer customerId){

    }

    @GetMapping("/sendPwdResetCodeToEmail")
    public void sendPwdResetCodeToEmail(String email){

    }

    @PostMapping("/resetPwdByEmail")
    public void resetPwdByEmail(@RequestParam String email,
                                @RequestParam String code,
                                @RequestParam String newPwd){

    }

    @GetMapping("/sendPwdResetCodeToMobile")
    public void sendPwdResetCodeToMobile(String mobile){

    }

    @PostMapping("/resetPwdByMobile")
    public void resetPwdByMobile(@RequestParam String mobile,
                                 @RequestParam String code,
                                 @RequestParam String newPwd){

    }
}
