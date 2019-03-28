package springcloud;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import pojo.Dept;
import service.DeptClientService;

@Component
public class DeptFallBack implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept deptGet(Integer id) {
                return new Dept().setId(id).setAge(0).setName("无").setClasses("无").setDatabase("无");
            }
        };
    }
}
