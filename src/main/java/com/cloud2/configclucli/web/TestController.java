package com.cloud2.configclucli.web;

import com.cloud2.commons.constants.Constants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiuHeYong
 * @create: 2019-06-13
 * @description:
 **/
@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;

    @RequestMapping(Constants.CLOUD2 + "/from")
    public String from() {
        return this.from;
    }

}
