package com.xupt.dao;

import com.xupt.bean.DynamicThumb;
import com.xupt.bean.Thumb;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface IThumbDao {

    public void saveThumb(@Param(("thumbTableName")) String thumbTableName,
                          @Param("thumb") Thumb thumb);

    public List<DynamicThumb> selectThumbDynamic(@Param("thumbTableName") String thumbTableName,
                                                 @Param("thumb_user_id") Integer thumb_user_id);
}
