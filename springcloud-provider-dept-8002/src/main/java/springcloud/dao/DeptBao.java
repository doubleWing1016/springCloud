package springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import pojo.Dept;

@Mapper
@Service
public interface DeptBao {
    Dept getByid(Integer id);
}
