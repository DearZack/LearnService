package io.github.dearzack.controller;

import io.github.dearzack.bean.Girl;
import io.github.dearzack.bean.Result;
import io.github.dearzack.repository.GirlRepository;
import io.github.dearzack.service.GirlService;
import io.github.dearzack.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Zack on 2017/4/23.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    /**
     * 保存一个女孩
//     * @param cupSize
//     * @param age
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl addGirl(@Valid Girl girl, BindingResult bindingResult
                        /*@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age*/) {
//        Girl girl = new Girl();
//        girl.setCupSize(cupSize);
//        girl.setAge(age);

        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }

        return girlRepository.save(girl);
    }

    /**
     * 获取所有的女孩
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> getGirls() {
        return girlRepository.findAll();
    }

    /**
     * 根据id查询一个
     * @param id
     * @return
     */
    @GetMapping(value = "girls/{id}")
    public Girl getOneGirl(@PathVariable("id") Integer id) {
        return girlRepository.findOne(id);
    }

    /**
     * 更新一个女生
     * @param id
     * @param cupSize
     * @param age
     * @return
     */
    @PutMapping(value = "girls/{id}")
    public Girl updateGirl(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    /**
     * 删除一个女生
     * @param id
     */
    @DeleteMapping(value = "girls/{id}")
    public void deleteGirl(@PathVariable("id") Integer id) {
        girlRepository.delete(id);
    }


    @GetMapping(value = "girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }

    @GetMapping(value = "girls/two")
    public void girlTwo() {
        girlService.insectTwoGirl();
    }

    @GetMapping(value = "girls/find/{id}")
    public Result findGirl(@PathVariable("id") Integer id) throws Exception{
        return ResultUtils.success(girlService.findGirl(id));
    }

}
