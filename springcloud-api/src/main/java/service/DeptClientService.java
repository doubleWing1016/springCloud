package service;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;
import pojo.Dept;
import springcloud.DeptFallBack;


@FeignClient(value = "SPRINGCLOUD-DEPT",fallbackFactory = DeptFallBack.class)
public interface DeptClientService {
    @RequestMapping("test")
    Dept deptGet( Integer id);
}