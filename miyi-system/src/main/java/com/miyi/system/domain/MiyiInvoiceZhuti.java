package com.miyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.miyi.common.annotation.Excel;
import com.miyi.common.core.domain.BaseEntity;

/**
 * 开票主体对象 miyi_invoice_zhuti
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public class MiyiInvoiceZhuti extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 客户ID */
    @Excel(name = "客户ID")
    private Long customerId;

    /** 开票主体 */
    @Excel(name = "开票主体")
    private String invoiceBody;

    /** 发票抬头 */
    @Excel(name = "发票抬头")
    private String invoiceName;

    /** 统一社会信用代码 */
    @Excel(name = "统一社会信用代码")
    private String registerNo;

    /** 开户行名称 */
    @Excel(name = "开户行名称")
    private String bankName;

    /** 开户账号 */
    @Excel(name = "开户账号")
    private String bankNo;

    /** 更新者 */
    @Excel(name = "更新者")
    private String updater;

    /** 创建者 */
    @Excel(name = "创建者")
    private String creator;

    /** 是否删除 1 删除，0未删除 */
    @Excel(name = "是否删除 1 删除，0未删除")
    private Integer deleted;

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

    public void setInvoiceBody(String invoiceBody) 
    {
        this.invoiceBody = invoiceBody;
    }

    public String getInvoiceBody() 
    {
        return invoiceBody;
    }

    public void setInvoiceName(String invoiceName) 
    {
        this.invoiceName = invoiceName;
    }

    public String getInvoiceName() 
    {
        return invoiceName;
    }

    public void setRegisterNo(String registerNo) 
    {
        this.registerNo = registerNo;
    }

    public String getRegisterNo() 
    {
        return registerNo;
    }

    public void setBankName(String bankName) 
    {
        this.bankName = bankName;
    }

    public String getBankName() 
    {
        return bankName;
    }

    public void setBankNo(String bankNo) 
    {
        this.bankNo = bankNo;
    }

    public String getBankNo() 
    {
        return bankNo;
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

    public void setDeleted(Integer deleted) 
    {
        this.deleted = deleted;
    }

    public Integer getDeleted() 
    {
        return deleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customerId", getCustomerId())
            .append("invoiceBody", getInvoiceBody())
            .append("invoiceName", getInvoiceName())
            .append("registerNo", getRegisterNo())
            .append("bankName", getBankName())
            .append("bankNo", getBankNo())
            .append("createTime", getCreateTime())
            .append("updater", getUpdater())
            .append("updateTime", getUpdateTime())
            .append("creator", getCreator())
            .append("deleted", getDeleted())
            .toString();
    }
}
