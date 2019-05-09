package com.example.dockerjar;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class api {
    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "成功了，哈哈哈！恭喜！";
    }

    @RequestMapping("test1")
    @ResponseBody
    public String test1(){
        log.warn("====================warn========================");
        log.error("====================error========================");
        log.info("====================info========================");
        log.debug("====================debug========================");
        return "啦啦啦";
    }
}
