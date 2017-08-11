package com.xupt.service.serviceImpl;

import com.xupt.bean.DynamicThumb;
import com.xupt.bean.Thumb;
import com.xupt.dao.IThumbDao;
import com.xupt.service.IThumbService;
import com.xupt.utils.GetEssayContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThumbService implements IThumbService {

    private final int THUMB_TABLE_COUNT = 5;
    private String PRE_THUMB_TABLE_NAME = "ebthumb_";

    private final IThumbDao thumbDao;

    @Autowired
    public ThumbService(IThumbDao thumbDao) {
        this.thumbDao = thumbDao;
    }

    public void saveThumb(Integer thumb_user_id, Integer thumb_essay_id) {

        int tableCount = thumb_user_id % THUMB_TABLE_COUNT;
        String thumbTableName = PRE_THUMB_TABLE_NAME + tableCount;

        Thumb thumb = new Thumb();
        thumb.setThumb_essay_id(thumb_essay_id);
        thumb.setThumb_user_id(thumb_user_id);
        thumbDao.saveThumb(thumbTableName, thumb);
    }

    public List<DynamicThumb> searchDynamicThumb(Integer thumb_user_id) {

        List<DynamicThumb> dynamicThumbList = new ArrayList<DynamicThumb>();
        for (int i = 0; i < THUMB_TABLE_COUNT; i++) {
            String thumbTableName = PRE_THUMB_TABLE_NAME + i;
            List<DynamicThumb> dynamicComments = thumbDao.selectThumbDynamic(thumbTableName, thumb_user_id);
            dynamicThumbList.addAll(dynamicComments);
        }
        for (DynamicThumb dynamicThumb : dynamicThumbList) {
            dynamicThumb.setEssay_content(GetEssayContent.getEssayContent(dynamicThumb.getEssay_content_path()));
        }
        return dynamicThumbList;
    }
}
