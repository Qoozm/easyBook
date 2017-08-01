package com.xupt.dao;

import com.xupt.bean.Anthology;
import com.xupt.bean.Essay;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAnthologyDao {
    public void saveAnthology(@Param("anthologyTableName") String anthologyTableName,
                              @Param("anthology") Anthology anthology);

    public List<Anthology> findUserAnthology(@Param("anthologyTableName") String anthologyTableName,
                                             @Param("anthology_user_id") Integer anthology_user_id);
}
