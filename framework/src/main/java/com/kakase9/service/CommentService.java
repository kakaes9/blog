package com.kakase9.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kakase9.domain.ResponseResult;
import com.kakase9.domain.entity.Comment;


/**
 * 评论表(Comment)表服务接口
 *
 * @author makejava
 * @since 2022-09-15 15:14:22
 */
public interface CommentService extends IService<Comment> {

    ResponseResult commentList(String commentType, Long articleId, Integer pageNum, Integer pageSize);

    ResponseResult addComment(Comment comment);
}
