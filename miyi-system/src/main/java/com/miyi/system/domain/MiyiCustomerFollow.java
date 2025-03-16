package com.miyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.miyi.common.annotation.Excel;
import com.miyi.common.core.domain.BaseEntity;

/**
 * 跟进记录对象 miyi_customer_follow
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public class MiyiCustomerFollow extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 跟进记录ID */
    private Long id;

    /** 联系人的用户编号 */
    @Excel(name = "联系人的用户编号")
    private Long contactUserId;

    /** 联系人 */
    @Excel(name = "联系人")
    private String contactName;

    /** 联系手机 */
    @Excel(name = "联系手机")
    private String contactMobile;

    /** 跟进内容 */
    @Excel(name = "跟进内容")
    private String content;

    /** 跟进类型/方式  1 新客户 2老客户复购，3售后问题 */
    @Excel(name = "跟进类型/方式  1 新客户 2老客户复购，3售后问题")
    private String recordType;

    /** 跟进状态1|新客|待再次沟通|有意向 */
    @Excel(name = "跟进状态1|新客|待再次沟通|有意向")
    private Long followStatus;

    /** 下次联系时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "下次联系时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date nextTime;

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

    public void setContactUserId(Long contactUserId) 
    {
        this.contactUserId = contactUserId;
    }

    public Long getContactUserId() 
    {
        return contactUserId;
    }

    public void setContactName(String contactName) 
    {
        this.contactName = contactName;
    }

    public String getContactName() 
    {
        return contactName;
    }

    public void setContactMobile(String contactMobile) 
    {
        this.contactMobile = contactMobile;
    }

    public String getContactMobile() 
    {
        return contactMobile;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setRecordType(String recordType) 
    {
        this.recordType = recordType;
    }

    public String getRecordType() 
    {
        return recordType;
    }

    public void setFollowStatus(Long followStatus) 
    {
        this.followStatus = followStatus;
    }

    public Long getFollowStatus() 
    {
        return followStatus;
    }

    public void setNextTime(Date nextTime) 
    {
        this.nextTime = nextTime;
    }

    public Date getNextTime() 
    {
        return nextTime;
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
            .append("contactUserId", getContactUserId())
            .append("contactName", getContactName())
            .append("contactMobile", getContactMobile())
            .append("content", getContent())
            .append("recordType", getRecordType())
            .append("followStatus", getFollowStatus())
            .append("nextTime", getNextTime())
            .append("createTime", getCreateTime())
            .append("updater", getUpdater())
            .append("updateTime", getUpdateTime())
            .append("creator", getCreator())
            .append("deleted", getDeleted())
            .toString();
    }
}
