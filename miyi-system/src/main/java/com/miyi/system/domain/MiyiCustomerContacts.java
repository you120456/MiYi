package com.miyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.miyi.common.annotation.Excel;
import com.miyi.common.core.domain.BaseEntity;

/**
 * 客户公司联系人对象 miyi_customer_contacts
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public class MiyiCustomerContacts extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 联系人ID */
    private Long id;

    /** 客户ID */
    @Excel(name = "客户ID")
    private Long customerId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 手机 */
    @Excel(name = "手机")
    private String mobile;

    /** 生日 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 电话 */
    @Excel(name = "电话")
    private String telephone;

    /** 电子邮箱 */
    @Excel(name = "电子邮箱")
    private String email;

    /** 是否关键决策人1是0不是-1未知 */
    @Excel(name = "是否关键决策人1是0不是-1未知")
    private Long decision;

    /** 职务 */
    @Excel(name = "职务")
    private String post;

    /** 性别0女1男-1未知 */
    @Excel(name = "性别0女1男-1未知")
    private Long sex;

    /** 地址 */
    @Excel(name = "地址")
    private String detailAddress;

    /** 更新者 */
    @Excel(name = "更新者")
    private String updater;

    /** 创建者 */
    @Excel(name = "创建者")
    private String creator;

    /** 是否删除 1 删除，0未删除 */
    @Excel(name = "是否删除 1 删除，0未删除")
    private Long deleted;

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

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setMobile(String mobile) 
    {
        this.mobile = mobile;
    }

    public String getMobile() 
    {
        return mobile;
    }

    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }

    public void setTelephone(String telephone) 
    {
        this.telephone = telephone;
    }

    public String getTelephone() 
    {
        return telephone;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setDecision(Long decision) 
    {
        this.decision = decision;
    }

    public Long getDecision() 
    {
        return decision;
    }

    public void setPost(String post) 
    {
        this.post = post;
    }

    public String getPost() 
    {
        return post;
    }

    public void setSex(Long sex) 
    {
        this.sex = sex;
    }

    public Long getSex() 
    {
        return sex;
    }

    public void setDetailAddress(String detailAddress) 
    {
        this.detailAddress = detailAddress;
    }

    public String getDetailAddress() 
    {
        return detailAddress;
    }

    public void setUpdater(String updater) 
    {
        this.updater = updater;
    }

    public String getUpdater() 
    {
        return updater;
    }

    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }

    public void setDeleted(Long deleted) 
    {
        this.deleted = deleted;
    }

    public Long getDeleted() 
    {
        return deleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customerId", getCustomerId())
            .append("name", getName())
            .append("mobile", getMobile())
            .append("birthday", getBirthday())
            .append("telephone", getTelephone())
            .append("email", getEmail())
            .append("decision", getDecision())
            .append("post", getPost())
            .append("sex", getSex())
            .append("detailAddress", getDetailAddress())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updater", getUpdater())
            .append("updateTime", getUpdateTime())
            .append("creator", getCreator())
            .append("deleted", getDeleted())
            .toString();
    }
}
