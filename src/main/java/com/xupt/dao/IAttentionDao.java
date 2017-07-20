package com.xupt.dao;

import com.xupt.bean.AttentionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by 慧乔乔 on 2017/7/15.
 */
@Repository
public interface IAttentionDao {
    public void save(AttentionExample example);
    public void deleteOneByToUserId(AttentionExample example);
}
