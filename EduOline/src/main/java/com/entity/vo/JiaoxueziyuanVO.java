package com.entity.vo;

import com.entity.JiaoxueziyuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教学资源
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaoxueziyuan")
public class JiaoxueziyuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 教学资源名称
     */

    @TableField(value = "jiaoxueziyuan_name")
    private String jiaoxueziyuanName;


    /**
     * 资源类型
     */

    @TableField(value = "jiaoxueziyuan_types")
    private Integer jiaoxueziyuanTypes;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 封面
     */

    @TableField(value = "jiaoxueziyuan_photo")
    private String jiaoxueziyuanPhoto;


    /**
     * 教学资源下载
     */

    @TableField(value = "jiaoxueziyuan_file")
    private String jiaoxueziyuanFile;


    /**
     * 教学资源详情
     */

    @TableField(value = "jiaoxueziyuan_content")
    private String jiaoxueziyuanContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：教学资源名称
	 */
    public String getJiaoxueziyuanName() {
        return jiaoxueziyuanName;
    }


    /**
	 * 获取：教学资源名称
	 */

    public void setJiaoxueziyuanName(String jiaoxueziyuanName) {
        this.jiaoxueziyuanName = jiaoxueziyuanName;
    }
    /**
	 * 设置：资源类型
	 */
    public Integer getJiaoxueziyuanTypes() {
        return jiaoxueziyuanTypes;
    }


    /**
	 * 获取：资源类型
	 */

    public void setJiaoxueziyuanTypes(Integer jiaoxueziyuanTypes) {
        this.jiaoxueziyuanTypes = jiaoxueziyuanTypes;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：封面
	 */
    public String getJiaoxueziyuanPhoto() {
        return jiaoxueziyuanPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setJiaoxueziyuanPhoto(String jiaoxueziyuanPhoto) {
        this.jiaoxueziyuanPhoto = jiaoxueziyuanPhoto;
    }
    /**
	 * 设置：教学资源下载
	 */
    public String getJiaoxueziyuanFile() {
        return jiaoxueziyuanFile;
    }


    /**
	 * 获取：教学资源下载
	 */

    public void setJiaoxueziyuanFile(String jiaoxueziyuanFile) {
        this.jiaoxueziyuanFile = jiaoxueziyuanFile;
    }
    /**
	 * 设置：教学资源详情
	 */
    public String getJiaoxueziyuanContent() {
        return jiaoxueziyuanContent;
    }


    /**
	 * 获取：教学资源详情
	 */

    public void setJiaoxueziyuanContent(String jiaoxueziyuanContent) {
        this.jiaoxueziyuanContent = jiaoxueziyuanContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
