package com.one.dao.commentModel;

import com.one.entity.commentModel.OldComment;

import java.util.List;
public interface OldCommentDao {

    /*得到所有的评估信息*/
    List<OldComment> getAllOldComments(String name);
}
