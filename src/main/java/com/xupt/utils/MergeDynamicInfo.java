package com.xupt.utils;

import com.xupt.bean.DynamicAttentionSubject;
import com.xupt.bean.DynamicAttentionUser;
import com.xupt.bean.DynamicComment;
import com.xupt.bean.DynamicThumb;

import java.util.ArrayList;
import java.util.List;

public class MergeDynamicInfo {

    public static void merge(List<DynamicThumb> dynamicThumbList,
                             List<DynamicComment> dynamicCommentList,
                             List<DynamicAttentionSubject> dynamicAttentionSubjectList,
                             List<DynamicAttentionUser> dynamicAttentionUserList,
                             List<Object> list) {
        int i = 0, j = 0;
        List<Object> list1 = merge1(dynamicThumbList, dynamicCommentList);
        List<Object> list2 = merge2(dynamicAttentionSubjectList, dynamicAttentionUserList);

        while (i < list1.size() && j < list2.size()) {
            Object object1 = list1.get(i);
            Object object2 = list2.get(j);
            if (object1 instanceof DynamicThumb && object2 instanceof DynamicAttentionSubject) {
                if (((DynamicThumb) object1).getThumb_date().getTime() >= ((DynamicAttentionSubject) object2).getAttention_subject_date().getTime()) {
                    list.add(object1);
                    i++;
                } else {
                    list.add(object2);
                    j++;
                }
            } else if (object1 instanceof DynamicThumb && object2 instanceof DynamicAttentionUser) {
                if (((DynamicThumb) object1).getThumb_date().getTime() >= ((DynamicAttentionUser) object2).getAttention_user_date().getTime()) {
                    list.add(object1);
                    i++;
                } else {
                    list.add(object2);
                    j++;
                }
            } else if (object1 instanceof DynamicComment && object2 instanceof DynamicAttentionSubject) {
                if (((DynamicComment) object1).getComment_date().getTime() >= ((DynamicAttentionSubject) object2).getAttention_subject_date().getTime()) {
                    list.add(object1);
                    i++;
                } else {
                    list.add(object2);
                    j++;
                }
            } else if (object1 instanceof DynamicComment && object2 instanceof DynamicAttentionUser) {
                if (((DynamicComment) object1).getComment_date().getTime() >= ((DynamicAttentionUser) object2).getAttention_user_date().getTime()) {
                    list.add(object1);
                    i++;
                } else {
                    list.add(object2);
                    j++;
                }
            }
        }

        if (i == list1.size()) {
            for (; j < list2.size(); j++)
                list.add(list2.get(j));
        } else {
            for (; i < list1.size(); i++)
                list.add(list1.get(i));
        }

    }

    private static List<Object> merge1(List<DynamicThumb> dynamicThumbList,
                                       List<DynamicComment> dynamicCommentList) {
        List<Object> list = new ArrayList<Object>();

        int i = 0, j = 0;
        while (i < dynamicThumbList.size() && j < dynamicCommentList.size()) {
            if (dynamicCommentList.get(j).getComment_date().getTime() >= dynamicThumbList.get(i).getThumb_date().getTime()) {
                list.add(dynamicCommentList.get(j));
                j++;
            } else {
                list.add(dynamicThumbList.get(i));
                i++;
            }
        }
        if (i == dynamicThumbList.size())
            for (; j < dynamicCommentList.size(); j++)
                list.add(dynamicCommentList.get(j));
        else
            for (; i < dynamicThumbList.size(); i++)
                list.add(dynamicThumbList.get(i));
        return list;
    }

    private static List<Object> merge2(List<DynamicAttentionSubject> dynamicAttentionSubjectList,
                                       List<DynamicAttentionUser> dynamicAttentionUserList) {
        List<Object> list = new ArrayList<Object>();

        int i = 0, j = 0;
        while (i < dynamicAttentionSubjectList.size() && j < dynamicAttentionUserList.size()) {
            if (dynamicAttentionUserList.get(j).getAttention_user_date().getTime() >= dynamicAttentionSubjectList.get(i).getAttention_subject_date().getTime()) {
                list.add(dynamicAttentionUserList.get(j));
                j++;
            } else {
                list.add(dynamicAttentionSubjectList.get(i));
                i++;
            }
        }
        if (i == dynamicAttentionSubjectList.size())
            for (; j < dynamicAttentionUserList.size(); j++)
                list.add(dynamicAttentionUserList.get(j));
        else
            for (; i < dynamicAttentionSubjectList.size(); i++)
                list.add(dynamicAttentionSubjectList.get(i));
        return list;
    }
}
