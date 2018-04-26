package me.stonerivers.controller.special;

import me.stonerivers.util.CheckoutUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhangYuanan on 2018/4/26.
 */
@RestController
@RequestMapping("/special")
public class SpecialController {

    @RequestMapping(value = "/verify_token.json", method = RequestMethod.GET)
    public String hello(@Param("signature") String signature, @Param("timestamp") String timestamp,
                        @Param("nonce") String nonce, @Param("echostr") String echostr) {
        if (signature != null && CheckoutUtil.checkSignature(signature, timestamp, nonce)) {
            return echostr;
        }
        return "error";
    }
}
