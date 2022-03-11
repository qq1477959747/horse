package com.dsjjsyyy.horse.model;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author 罗日程
 * @Description 二手房源信息
 * @create 2022/3/11
 */
@TableName("er_house")
public class HouseInfo implements Serializable {


    private static final long serialVersionUID = -2547681879202592414L;

    private Long id;

    private Long houseId;

    private String houseTitle;

    private String houseInfo;

    private String followInfo;

    private String position;

    private String tag;

    private String unitPrice;

    private BigDecimal totalPrice;

    private String source;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @Override
    public String toString() {
        return "HouseInfo{" +
                "id=" + id +
                ", houseId=" + houseId +
                ", houseTitle='" + houseTitle + '\'' +
                ", houseInfo='" + houseInfo + '\'' +
                ", followInfo='" + followInfo + '\'' +
                ", position='" + position + '\'' +
                ", tag='" + tag + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", totalPrice=" + totalPrice +
                ", source='" + source + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public HouseInfo(Long id, Long houseId, String houseTitle, String houseInfo, String followInfo, String position, String tag, String unitPrice, BigDecimal totalPrice, String source) {
        this.id = id;
        this.houseId = houseId;
        this.houseTitle = houseTitle;
        this.houseInfo = houseInfo;
        this.followInfo = followInfo;
        this.position = position;
        this.tag = tag;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.source = source;
    }

    public HouseInfo() {
    }

    public HouseInfo(Long id, String houseTitle, String houseInfo, String followInfo, String position, String tag, String unitPrice, BigDecimal totalPrice, String source) {
        this.id = id;
        this.houseTitle = houseTitle;
        this.houseInfo = houseInfo;
        this.followInfo = followInfo;
        this.position = position;
        this.tag = tag;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public HouseInfo(Long id, String houseTitle, String houseInfo, String followInfo, String position, String tag, String unitPrice, BigDecimal totalPrice) {
        this.id = id;
        this.houseTitle = houseTitle;
        this.houseInfo = houseInfo;
        this.followInfo = followInfo;
        this.position = position;
        this.tag = tag;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHouseTitle() {
        return houseTitle;
    }

    public void setHouseTitle(String houseTitle) {
        this.houseTitle = houseTitle;
    }

    public String getHouseInfo() {
        return houseInfo;
    }

    public void setHouseInfo(String houseInfo) {
        this.houseInfo = houseInfo;
    }

    public String getFollowInfo() {
        return followInfo;
    }

    public void setFollowInfo(String followInfo) {
        this.followInfo = followInfo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}
