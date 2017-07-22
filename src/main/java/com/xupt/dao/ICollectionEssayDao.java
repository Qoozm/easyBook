package com.xupt.dao;

import org.apache.ibatis.annotations.Param;

public interface ICollectionEssayDao {

    public void saveCollectionEssay(@Param("collectionEssayTableName") String collectionEssayTableName,
                                    @Param("user_id") Integer user_id,
                                    @Param("essay_id") Integer essay_id);

    public void deleteCollectionEssay(@Param("collectionEssayTableName") String collectionEssayTableName,
                                      @Param("user_id") Integer user_id,
                                      @Param("essay_id") Integer essay_id);
}
