package com.miyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.miyi.common.annotation.Excel;
import com.miyi.common.core.domain.BaseEntity;

/**
 * 合同对象 miyi_contract
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public class MiyiContract extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 客户编号 */
    @Excel(name = "客户编号")
    private Long customerNumber;

    /** 客户签约人 */
    @Excel(name = "客户签约人")
    private String contactsId;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orederNo;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private String contractNo;

    /** 下单时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "下单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date orderTime;

    /** 合同金额 */
    @Excel(name = "合同金额")
    private BigDecimal money;

    /** 产品总金额 */
    @Excel(name = "产品总金额")
    private BigDecimal totalPrice;

    /** 已收到款项 */
    @Excel(name = "已收到款项")
    private BigDecimal returnMoney;

    /** 合同状态 0存档1合同已上传2合同作废 */
    @Excel(name = "合同状态 0存档1合同已上传2合同作废")
    private String checkStatus;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 公司签约人 */
    @Excel(name = "公司签约人")
    private Long orderAdminId;

    /** 更新者 */
    @Excel(name = "更新者")
    private String updater;

    /** 创建者 */
    @Excel(name = "创建者")
    private String creator;

    /** 删除 */
    @Excel(name = "删除")
    private Long deleted;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setCustomerNumber(Long customerNumber) 
    {
        this.customerNumber = customerNumber;
    }

    public Long getCustomerNumber() 
    {
        return customerNumber;
    }

    public void setContactsId(String contactsId) 
    {
        this.contactsId = contactsId;
    }

    public String getContactsId() 
    {
        return contactsId;
    }

    public void setOrederNo(String orederNo) 
    {
        this.orederNo = orederNo;
    }

    public String getOrederNo() 
    {
        return orederNo;
    }

    public void setContractNo(String contractNo) 
    {
        this.contractNo = contractNo;
    }

    public String getContractNo() 
    {
        return contractNo;
    }

    public void setOrderTime(Date orderTime) 
    {
        this.orderTime = orderTime;
    }

    public Date getOrderTime() 
    {
        return orderTime;
    }

    public void setMoney(BigDecimal money) 
    {
        this.money = money;
    }

    public BigDecimal getMoney() 
    {
        return money;
    }

    public void setTotalPrice(BigDecimal totalPrice) 
    {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPrice() 
    {
        return totalPrice;
    }

    public void setReturnMoney(BigDecimal returnMoney) 
    {
        this.returnMoney = returnMoney;
    }

    public BigDecimal getReturnMoney() 
    {
        return returnMoney;
    }

    public void setCheckStatus(String checkStatus) 
    {
        this.checkStatus = checkStatus;
    }

    public String getCheckStatus() 
    {
        return checkStatus;
    }

    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }

    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }

    public void setOrderAdminId(Long orderAdminId) 
    {
        this.orderAdminId = orderAdminId;
    }

    public Long getOrderAdminId() 
    {
        return orderAdminId;
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
            .append("customerNumber", getCustomerNumber())
            .append("contactsId", getContactsId())
            .append("orederNo", getOrederNo())
            .append("contractNo", getContractNo())
            .append("orderTime", getOrderTime())
            .append("money", getMoney())
            .append("totalPrice", getTotalPrice())
            .append("returnMoney", getReturnMoney())
            .append("checkStatus", getCheckStatus())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("orderAdminId", getOrderAdminId())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updater", getUpdater())
            .append("updateTime", getUpdateTime())
            .append("creator", getCreator())
            .append("deleted", getDeleted())
            .toString();
    }
}
