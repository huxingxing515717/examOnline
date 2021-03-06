package org.tlh.exam.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by 离歌笑tlh/hu ping on 2019/5/1
 * <p>
 * Github: https://github.com/tlhhup
 */
@Data
public class Question {

    private Integer id;
    private String name;//问题名称，简写
    private String content;//存问题的所有信息，题目、答案
    private Integer duration;
    private Integer points;
    private String answer;
    private Integer difficulty;
    private String analysis;
    private String reference;
    private String examingPoint;
    private String keyword;
    private Integer creatorId;
    private String creatorName;
    private Integer questionTypeId;
    private Date createTime;
    private Date updateTime;
    private Boolean isActive;


    /****** 关联表数据 *******/
    private String questionTypeName;

}
