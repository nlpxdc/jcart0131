package io.cjf.jcartadministrationback.controller;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import io.cjf.jcartadministrationback.constant.ClientExceptionConstant;
import io.cjf.jcartadministrationback.dto.in.*;
import io.cjf.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import io.cjf.jcartadministrationback.dto.out.AdministratorListOutDTO;
import io.cjf.jcartadministrationback.dto.out.PageOutDTO;
import io.cjf.jcartadministrationback.exception.ClientException;
import io.cjf.jcartadministrationback.po.Administrator;
import io.cjf.jcartadministrationback.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${jwt.expire.duration}")
    private Long jwtExpireDuration;

    @GetMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) throws ClientException {
        Administrator administrator = administratorService.selectByUsername(username);
        if (administrator == null){
            throw new ClientException(ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRCODE, ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRMSG);
        }
        String encPwdDB = administrator.getEncryptedPassword();
        BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), encPwdDB);

        if (result.verified) {

            Date now = new Date();
            long nowTimestamp = now.getTime();
            long expireTimestamp = nowTimestamp + jwtExpireDuration;
            Date expireTime = new Date(expireTimestamp);
            Integer administratorId = administrator.getAdministratorId();

            Algorithm algorithm = Algorithm.HMAC256(jwtSecret);
            String token = JWT.create()
                    .withIssuer("jcart")
                    .withIssuedAt(now)
                    .withSubject(username)
                    .withClaim("administratorId", administratorId)
                    .withExpiresAt(expireTime)
                    .sign(algorithm);
            return token;
        }else {
            throw new ClientException(ClientExceptionConstant.ADNINISTRATOR_PASSWORD_INVALID_ERRCODE, ClientExceptionConstant.ADNINISTRATOR_PASSWORD_INVALID_ERRMSG);
        }
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer administratorId) {
        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO) {

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam Integer pageNum) {
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO) {
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO) {

    }

    @GetMapping("/sendPasswordResetCodeToEmail")
    public void sendPasswordResetCodeToEmail(@RequestParam String email) {

    }

    @PostMapping("/resetPasswordByEmail")
    public void resetPasswordByEmail(@RequestBody AdministratorResetPwdEmailInDTO administratorResetPwdEmailInDTO) {

    }

    @GetMapping("/sendPasswordResetCodeToMobile")
    public void sendPasswordResetCodeToMobile(@RequestParam String mobile) {

    }

    @PostMapping("/resetPasswordByMobile")
    public void resetPasswordByMobile(@RequestBody AdministratorResetPwdMobileInDTO administratorResetPwdMobileInDTO) {

    }
}
