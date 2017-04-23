package io.github.dearzack.repository;

import io.github.dearzack.bean.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Zack on 2017/4/23.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //通过年龄查询
    public List<Girl> findByAge(Integer age);
}
