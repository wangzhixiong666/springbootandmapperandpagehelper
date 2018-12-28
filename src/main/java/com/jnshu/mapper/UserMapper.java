package com.jnshu.mapper;

import com.jnshu.config.BaseMapper;
import com.jnshu.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
    //如果你需要一些自定义的方法,原来怎么写现在一样的写,没有任何变化
    /**
     * 根据用户名统计（假设它是一个很复杂的SQL）
     * @param id
     * @return 统计结果
     */
    Boolean deleteById(long id);
    User findById(long id);
}
