package com.entity.vo;

import com.entity.JiaoxueziyuanLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教学资源评价
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaoxueziyuan_liuyan")
public class JiaoxueziyuanLiuyanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 教学资源
     */

    @TableField(value = "jiaoxueziyuan_id")
    private Integer jiaoxueziyuanId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 评价内容
     */

    @TableField(value = "jiaoxueziyuan_liuyan_content")
    private String jiaoxueziyuanLiuyanContent;


    /**
     * 回复内容
     */

    @TableField(value = "reply_content")
    private String replyContent;


    /**
     * 评价时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：教学资源
	 */
    public Integer getJiaoxueziyuanId() {
        return jiaoxueziyuanId;
    }


    /**
	 * 获取：教学资源
	 */

    public void setJiaoxueziyuanId(Integer jiaoxueziyuanId) {
        this.jiaoxueziyuanId = jiaoxueziyuanId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：评价内容
	 */
    public String getJiaoxueziyuanLiuyanContent() {
        return jiaoxueziyuanLiuyanContent;
    }


    /**
	 * 获取：评价内容
	 */

    public void setJiaoxueziyuanLiuyanContent(String jiaoxueziyuanLiuyanContent) {
        this.jiaoxueziyuanLiuyanContent = jiaoxueziyuanLiuyanContent;
    }
    /**
	 * 设置：回复内容
	 */
    public String getReplyContent() {
        return replyContent;
    }


    /**
	 * 获取：回复内容
	 */

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }
    /**
	 * 设置：评价时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：评价时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
