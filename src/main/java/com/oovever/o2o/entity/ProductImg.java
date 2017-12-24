package com.oovever.o2o.entity;

import java.util.Date;

/**
 * 商品详情图片
 * @author OovEver
 * @DATE 2017/12/24 21:19
 */
public class ProductImg {
    private Long    productImgId;
//    图片地址
    private String  imgAddr;
//    图片说明
    private String  imgDesc;
    private Integer priority;
    private Date    createTime;
//    属于哪个商品的详情图片 与商品多对一
    private Long    productId;

    public Long getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(Long productImgId) {
        this.productImgId = productImgId;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
