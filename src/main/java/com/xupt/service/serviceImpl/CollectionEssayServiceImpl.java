package com.xupt.service.serviceImpl;

import com.xupt.dao.ICollectionEssayDao;
import com.xupt.service.ICollectionEssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionEssayServiceImpl implements ICollectionEssayService {

    private final int COLLECTION_ESSAY_TABLE_COUNT = 5;
    private String PRE_COLLECTION_ESSAY_TABLE_NAME = "ebcollention_essay_";

    @Autowired
    private ICollectionEssayDao collectionEssayDao;

    public int searchWhereToSaveCollectionEssay(Integer user_id) {
        int result;

        result = user_id % COLLECTION_ESSAY_TABLE_COUNT;

        return result;
    }

    public void collectEssay(Integer user_id, Integer essay_id) {

        int tableCount = searchWhereToSaveCollectionEssay(user_id);
        String collectionEssayTableName = PRE_COLLECTION_ESSAY_TABLE_NAME + tableCount;

        collectionEssayDao.saveCollectionEssay(collectionEssayTableName, user_id, essay_id);
    }

    public void cancelCollectEssay(Integer user_id, Integer essay_id) {

        int tableCount = searchWhereToSaveCollectionEssay(user_id);
        String collectionEssayTableName = PRE_COLLECTION_ESSAY_TABLE_NAME + tableCount;

        collectionEssayDao.deleteCollectionEssay(collectionEssayTableName, user_id, essay_id);
    }
}
