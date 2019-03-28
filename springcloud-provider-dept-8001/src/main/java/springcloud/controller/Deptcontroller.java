package springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Dept;
import springcloud.dao.DeptBao;

@RestController
public class Deptcontroller {
    @Autowired
    private DeptBao deptBao;
    @RequestMapping("test")
    @HystrixCommand
    public Dept deptGet()
    {
        return deptBao.getByid(2);
    }


}
