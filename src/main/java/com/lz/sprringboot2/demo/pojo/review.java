package com.lz.sprringboot2.demo.pojo;

/*
 * Created with IntelliJ IDEA.
 * @Author: lz
 * @Date: 2024/06/28/下午9:42
 * @Description:
 */

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author lz
 */
@NoArgsConstructor
@AllArgsConstructor
@TableName("reviews")
public class review {
    
    @TableId(value = "ReviewID", type = IdType.AUTO)
    @ExcelProperty(value = "用户ID", index = 0)
    private Long reviewId;

    
    @TableField("TaskID")
    @ExcelProperty(value = "委托ID", index = 1)
    private Long taskId;

    /**
     * 发布者 ID
     */
   
    @TableField("PublisherID")
    @ExcelProperty(value = "发布者ID", index = 2)
    private Long publisherId;

    /**
     * 接受者 ID
     */
    
    @TableField("AcceptorID")
    @ExcelProperty(value = "接受者ID", index = 3)
    private Long acceptorId;


    /**
     * 评价者 ID
     */
    
    @TableField("ReviewerID")
    @ExcelProperty(value = "评价者ID", index = 4)
    private Long reviewerId;

   
    @TableField("Rating")
    @ExcelProperty(value = "评价等级", index = 5)
    private Long rating;

   
    @TableField("COMMENT")
    @ExcelProperty(value = "评价评论", index = 6)
    private String comment;

    /**
     * 已获批准
     */
    @TableField("IsApproved")
    @ExcelProperty(value = "是否已批准", index = 7)
    private Boolean isApproved;

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public Long getAcceptorId() {
        return acceptorId;
    }

    public void setAcceptorId(Long acceptorId) {
        this.acceptorId = acceptorId;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getApproved() {
        return isApproved;
    }

    public void setApproved(Boolean approved) {
        isApproved = approved;
    }
}