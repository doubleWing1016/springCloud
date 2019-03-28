package springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Dept;
import service.DeptClientService;

@RestController
public class Deptcontroller {
    @Autowired
    private DeptClientService deptClientService;
   @GetMapping("consumer/test")
    public Dept get(){
        return deptClientService.deptGet(2);
    }
}
