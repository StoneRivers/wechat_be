package me.stonerivers.controller;

import me.stonerivers.model.requset.MainReq;
import me.stonerivers.model.response.SuccessVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhangYuanan on 2017/12/30.
 */
@RestController
@RequestMapping("/1/main")
public class MainController {

    @RequestMapping(value = "/validate.json", method = {RequestMethod.POST, RequestMethod.GET})
    public SuccessVo validate(@RequestBody MainReq request) throws Exception {
        System.out.println(request.getKeyWord());
        return  SuccessVo.keyValueVo("data","message");
    }

}
