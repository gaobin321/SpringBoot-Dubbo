package com.wenba.common.domain;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * arris_info
 * @author 
 */
public class ArrisInfo implements Serializable {


    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 表达式版本
     */
    private String arrisVers;

    /**
     * 表达式名称
     */
    private String arrisName;

    /**
     * 表达式详情
     */
    private String arrisDetail;

    /**
     * 表达式描述
     */
    private String arrisDesc;

    /**
     * 表达式是否是当前版本: 1 是 0 否'
     */
    private Byte arrisIsCurrV;

    /**
     * 创建人
     */
    private Integer createId;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JSONField(format="yyyy-MM-dd")
    private String createTime;

    /**
     * 更新人
     */
    private Integer updateId;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JSONField(format="yyyy-MM-dd")
    private String updateTime;

    /**
     * 扩展字段
     */
    private String ext;


    private int pageNum;

    private int pageSize;

    private String create_start;

    private String create_end;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArrisVers() {
        return arrisVers;
    }

    public void setArrisVers(String arrisVers) {
        this.arrisVers = arrisVers;
    }

    public String getArrisName() {
        return arrisName;
    }

    public void setArrisName(String arrisName) {
        this.arrisName = arrisName;
    }

    public String getArrisDetail() {
        return arrisDetail;
    }

    public void setArrisDetail(String arrisDetail) {
        this.arrisDetail = arrisDetail;
    }

    public String getArrisDesc() {
        return arrisDesc;
    }

    public void setArrisDesc(String arrisDesc) {
        this.arrisDesc = arrisDesc;
    }

    public Byte getArrisIsCurrV() {
        return arrisIsCurrV;
    }

    public void setArrisIsCurrV(Byte arrisIsCurrV) {
        this.arrisIsCurrV = arrisIsCurrV;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getCreate_start() {
        return create_start;
    }

    public void setCreate_start(String create_start) {
        this.create_start = create_start;
    }

    public String getCreate_end() {
        return create_end;
    }

    public void setCreate_end(String create_end) {
        this.create_end = create_end;
    }


    @Override
    public String toString() {
        return "ArrisInfo{" +
                "id=" + id +
                ", arrisVers='" + arrisVers + '\'' +
                ", arrisName='" + arrisName + '\'' +
                ", arrisDetail='" + arrisDetail + '\'' +
                ", arrisDesc='" + arrisDesc + '\'' +
                ", arrisIsCurrV=" + arrisIsCurrV +
                ", createId=" + createId +
                ", createTime=" + createTime +
                ", updateId=" + updateId +
                ", updateTime=" + updateTime +
                ", ext='" + ext + '\'' +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", create_start='" + create_start + '\'' +
                ", create_end='" + create_end + '\'' +
                '}';
    }
}