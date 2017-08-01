package com.xupt.dao;

import com.xupt.bean.Thumb;
import org.apache.ibatis.annotations.Param;

public interface IThumbDao {

    public void saveThumb(@Param(("thumbTableName")) String thumbTableName,
                          @Param("thumb") Thumb thumb);
}
