package com.miyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.miyi.common.annotation.Excel;
import com.miyi.common.core.domain.BaseEntity;

/**
 * 城市管理对象 miyi_system_city
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public class MiyiSystemCity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 城市id */
    @Excel(name = "城市id")
    private Long cityId;

    /** 省市级别 */
    @Excel(name = "省市级别")
    private Long level;

    /** 父级id */
    @Excel(name = "父级id")
    private Long parentId;

    /** 区号 */
    @Excel(name = "区号")
    private String areaCode;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 合并名称 */
    @Excel(name = "合并名称")
    private String mergerName;

    /** 经度 */
    @Excel(name = "经度")
    private String lng;

    /** 纬度 */
    @Excel(name = "纬度")
    private String lat;

    /** 是否展示 */
    @Excel(name = "是否展示")
    private Integer isShow;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setCityId(Long cityId) 
    {
        this.cityId = cityId;
    }

    public Long getCityId() 
    {
        return cityId;
    }

    public void setLevel(Long level) 
    {
        this.level = level;
    }

    public Long getLevel() 
    {
        return level;
    }

    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }

    public void setAreaCode(String areaCode) 
    {
        this.areaCode = areaCode;
    }

    public String getAreaCode() 
    {
        return areaCode;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setMergerName(String mergerName) 
    {
        this.mergerName = mergerName;
    }

    public String getMergerName() 
    {
        return mergerName;
    }

    public void setLng(String lng) 
    {
        this.lng = lng;
    }

    public String getLng() 
    {
        return lng;
    }

    public void setLat(String lat) 
    {
        this.lat = lat;
    }

    public String getLat() 
    {
        return lat;
    }

    public void setIsShow(Integer isShow) 
    {
        this.isShow = isShow;
    }

    public Integer getIsShow() 
    {
        return isShow;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cityId", getCityId())
            .append("level", getLevel())
            .append("parentId", getParentId())
            .append("areaCode", getAreaCode())
            .append("name", getName())
            .append("mergerName", getMergerName())
            .append("lng", getLng())
            .append("lat", getLat())
            .append("isShow", getIsShow())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
