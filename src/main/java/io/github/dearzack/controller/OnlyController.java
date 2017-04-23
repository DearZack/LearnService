package io.github.dearzack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Zack on 2017/4/23.
 */
//@Controller //1
//@ResponseBody //2
@RestController //3
@RequestMapping("/hi")//整个类加前缀
public class OnlyController {
    //只用注解@Controller需要和templates的组合使用

    //1、2同时用比较推荐,或者只用3

    //1+2=3

    //only和only2同时映射
    @RequestMapping(value = {"only", "only2"}, method = RequestMethod.GET)
    public String hello() {
//        return "index"; //1
        return "Hello Spring Boot!!"; //2
    }


    //127.0.0.1:8080/learn/hi/only/2
    @RequestMapping(value = "only/{id}", method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id) {
        return "id:" + id;
    }

    //127.0.0.1:8080/learn/hi/only3?id=3
    @RequestMapping(value = "only3", method = RequestMethod.GET)
    public String say3(@RequestParam("id") Integer id) {
        return "id:" + id;
    }

    //RequestParam其他属性
    //required是否必传
    //defaultValue默认值
//    @RequestMapping(value = "only4", method = RequestMethod.GET)
    @GetMapping(value = "only4")
    //等同于@RequestMapping(value = "only4", method = RequestMethod.GET)
    //类似的还有@PostMapping(value = "only4"),等同于@RequestMapping(value = "only4", method = RequestMethod.POST)
    public String say4(@RequestParam(value = "id", required = false, defaultValue = "888") Integer id) {
        return "id:" + id;
    }
}
