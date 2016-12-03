package com.project.model;

import java.math.BigDecimal;
import java.util.Date;

public class Goods {
    private String id;

    private String name;

    private String shopId;

    private String classesId;

    private BigDecimal markketPrice;

    private BigDecimal salePrice;

    private Integer salePoints;

    private Boolean isSingleOrder;

    private Boolean isUnifiedSpecs;

    private Boolean isGroup;

    private Boolean isSale;

    private Boolean isFrozen;

    private Boolean shippingType;

    private BigDecimal shippingFee;

    private BigDecimal commission;

    private Integer stockCount;

    private Integer lockCount;

    private Integer saleCount;

    private Integer customizeStockCount;

    private Integer limitedCount;

    private Integer rank;

    private Date createdAt;

    private Date updatedAt;

    private Boolean status;

    private String descriptions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getClassesId() {
        return classesId;
    }

    public void setClassesId(String classesId) {
        this.classesId = classesId == null ? null : classesId.trim();
    }

    public BigDecimal getMarkketPrice() {
        return markketPrice;
    }

    public void setMarkketPrice(BigDecimal markketPrice) {
        this.markketPrice = markketPrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getSalePoints() {
        return salePoints;
    }

    public void setSalePoints(Integer salePoints) {
        this.salePoints = salePoints;
    }

    public Boolean getIsSingleOrder() {
        return isSingleOrder;
    }

    public void setIsSingleOrder(Boolean isSingleOrder) {
        this.isSingleOrder = isSingleOrder;
    }

    public Boolean getIsUnifiedSpecs() {
        return isUnifiedSpecs;
    }

    public void setIsUnifiedSpecs(Boolean isUnifiedSpecs) {
        this.isUnifiedSpecs = isUnifiedSpecs;
    }

    public Boolean getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Boolean isGroup) {
        this.isGroup = isGroup;
    }

    public Boolean getIsSale() {
        return isSale;
    }

    public void setIsSale(Boolean isSale) {
        this.isSale = isSale;
    }

    public Boolean getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public Boolean getShippingType() {
        return shippingType;
    }

    public void setShippingType(Boolean shippingType) {
        this.shippingType = shippingType;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Integer getLockCount() {
        return lockCount;
    }

    public void setLockCount(Integer lockCount) {
        this.lockCount = lockCount;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getCustomizeStockCount() {
        return customizeStockCount;
    }

    public void setCustomizeStockCount(Integer customizeStockCount) {
        this.customizeStockCount = customizeStockCount;
    }

    public Integer getLimitedCount() {
        return limitedCount;
    }

    public void setLimitedCount(Integer limitedCount) {
        this.limitedCount = limitedCount;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions == null ? null : descriptions.trim();
    }
}