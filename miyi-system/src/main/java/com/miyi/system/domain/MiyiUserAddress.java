package com.miyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.miyi.common.annotation.Excel;
import com.miyi.common.core.domain.BaseEntity;

/**
 * 公司收货信息对象 miyi_user_address
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public class MiyiUserAddress extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 收货信息ID */
    private Long id;

    /** 客户ID */
    @Excel(name = "客户ID")
    private Long customerId;

    /** 收货人姓名 */
    @Excel(name = "收货人姓名")
    private String realName;

    /** 收货人电话 */
    @Excel(name = "收货人电话")
    private String phone;

    /** 收货人所在省 */
    @Excel(name = "收货人所在省")
    private String province;

    /** 收货人所在市 */
    @Excel(name = "收货人所在市")
    private String city;

    /** 城市id */
    @Excel(name = "城市id")
    private String cityId;

    /** 收货人所在区 */
    @Excel(name = "收货人所在区")
    private String district;

    /** 收货人详细地址 */
    @Excel(name = "收货人详细地址")
    private String detail;

    /** 邮编 */
    @Excel(name = "邮编")
    private String postCode;

    /** 是否默认 */
    @Excel(name = "是否默认")
    private String isDuf;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private Long isDel;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setCustomerId(Long customerId) 
    {
        this.customerId = customerId;
    }

    public Long getCustomerId() 
    {
        return customerId;
    }

    public void setRealName(String realName) 
    {
        this.realName = realName;
    }

    public String getRealName() 
    {
        return realName;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCityId(String cityId) 
    {
        this.cityId = cityId;
    }

    public String getCityId() 
    {
        return cityId;
    }

    public void setDistrict(String district) 
    {
        this.district = district;
    }

    public String getDistrict() 
    {
        return district;
    }

    public void setDetail(String detail) 
    {
        this.detail = detail;
    }

    public String getDetail() 
    {
        return detail;
    }

    public void setPostCode(String postCode) 
    {
        this.postCode = postCode;
    }

    public String getPostCode() 
    {
        return postCode;
    }

    public void setIsDuf(String isDuf) 
    {
        this.isDuf = isDuf;
    }

    public String getIsDuf() 
    {
        return isDuf;
    }

    public void setIsDel(Long isDel) 
    {
        this.isDel = isDel;
    }

    public Long getIsDel() 
    {
        return isDel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customerId", getCustomerId())
            .append("realName", getRealName())
            .append("phone", getPhone())
            .append("province", getProvince())
            .append("city", getCity())
            .append("cityId", getCityId())
            .append("district", getDistrict())
            .append("detail", getDetail())
            .append("postCode", getPostCode())
            .append("isDuf", getIsDuf())
            .append("isDel", getIsDel())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
