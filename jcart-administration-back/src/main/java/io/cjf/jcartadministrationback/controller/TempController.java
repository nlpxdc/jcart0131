package io.cjf.jcartadministrationback.controller;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
public class TempController {

    @GetMapping("/test")
    public String test(){
        String password = "123456";
        String bcryptHashString = BCrypt.withDefaults().hashToString(12, password.toCharArray());
        return bcryptHashString;
    }

}
