package com.xupt.service;

public interface ICollectionEssayService {

    public int searchWhereToSaveCollectionEssay(Integer user_id);

    public void collectEssay(Integer user_id, Integer essay_id);

    public void cancelCollectEssay(Integer user_id, Integer essay_id);
}
