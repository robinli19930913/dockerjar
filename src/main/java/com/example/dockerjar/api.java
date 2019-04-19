package com.example.dockerjar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description TODO
 * @Author robin
 * @Date 2019/4/19 21:54
 */
@Controller
@RequestMapping("/")
public class api {
    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "成功了，哈哈哈！恭喜！";
    }
}
