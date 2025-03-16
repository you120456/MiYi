package com.miyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.miyi.common.annotation.Excel;
import com.miyi.common.core.domain.BaseEntity;

/**
 * 开票明细对象 miyi_invoice
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public class MiyiInvoice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 开票明细ID */
    private Long id;

    /** 合同ID */
    @Excel(name = "合同ID")
    private Long contractId;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private Long orederNo;

    /** 客户ID */
    @Excel(name = "客户ID")
    private Long customerId;

    /** 开票主体 */
    @Excel(name = "开票主体")
    private String invoiceBody;

    /** 开票内容 */
    @Excel(name = "开票内容")
    private String content;

    /** 发票抬头 */
    @Excel(name = "发票抬头")
    private String invoiceName;

    /** 抬头类型1企业2个人3事业单位 */
    @Excel(name = "抬头类型1企业2个人3事业单位")
    private String invoiceIssue;

    /** 1增普2增专 */
    @Excel(name = "1增普2增专")
    private String invoiceType;

    /** 统一社会信用代码 */
    @Excel(name = "统一社会信用代码")
    private String registerNo;

    /** 开户行名称 */
    @Excel(name = "开户行名称")
    private String bankName;

    /** 开户账号 */
    @Excel(name = "开户账号")
    private String bankNo;

    /** 发票税前金额 */
    @Excel(name = "发票税前金额")
    private BigDecimal money;

    /** 税率 */
    @Excel(name = "税率")
    private BigDecimal taxRate;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    /** 接收发票邮箱 */
    @Excel(name = "接收发票邮箱")
    private String email;

    /** 收件人 */
    @Excel(name = "收件人")
    private String userName;

    /** 收件手机 */
    @Excel(name = "收件手机")
    private String userPhone;

    /** 邮寄地址 */
    @Excel(name = "邮寄地址")
    private String userAddress;

    /** 开票附件 */
    @Excel(name = "开票附件")
    private String files;

    /** 快递公司  */
    @Excel(name = "快递公司 ")
    private String trackingCompany;

    /** 快递单号 */
    @Excel(name = "快递单号")
    private String trackingNumber;

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

    public void setContractId(Long contractId) 
    {
        this.contractId = contractId;
    }

    public Long getContractId() 
    {
        return contractId;
    }

    public void setOrederNo(Long orederNo) 
    {
        this.orederNo = orederNo;
    }

    public Long getOrederNo() 
    {
        return orederNo;
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

    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setInvoiceName(String invoiceName) 
    {
        this.invoiceName = invoiceName;
    }

    public String getInvoiceName() 
    {
        return invoiceName;
    }

    public void setInvoiceIssue(String invoiceIssue) 
    {
        this.invoiceIssue = invoiceIssue;
    }

    public String getInvoiceIssue() 
    {
        return invoiceIssue;
    }

    public void setInvoiceType(String invoiceType) 
    {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceType() 
    {
        return invoiceType;
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

    public void setMoney(BigDecimal money) 
    {
        this.money = money;
    }

    public BigDecimal getMoney() 
    {
        return money;
    }

    public void setTaxRate(BigDecimal taxRate) 
    {
        this.taxRate = taxRate;
    }

    public BigDecimal getTaxRate() 
    {
        return taxRate;
    }

    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }

    public void setUserPhone(String userPhone) 
    {
        this.userPhone = userPhone;
    }

    public String getUserPhone() 
    {
        return userPhone;
    }

    public void setUserAddress(String userAddress) 
    {
        this.userAddress = userAddress;
    }

    public String getUserAddress() 
    {
        return userAddress;
    }

    public void setFiles(String files) 
    {
        this.files = files;
    }

    public String getFiles() 
    {
        return files;
    }

    public void setTrackingCompany(String trackingCompany) 
    {
        this.trackingCompany = trackingCompany;
    }

    public String getTrackingCompany() 
    {
        return trackingCompany;
    }

    public void setTrackingNumber(String trackingNumber) 
    {
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber() 
    {
        return trackingNumber;
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
            .append("contractId", getContractId())
            .append("orederNo", getOrederNo())
            .append("customerId", getCustomerId())
            .append("invoiceBody", getInvoiceBody())
            .append("content", getContent())
            .append("invoiceName", getInvoiceName())
            .append("invoiceIssue", getInvoiceIssue())
            .append("invoiceType", getInvoiceType())
            .append("registerNo", getRegisterNo())
            .append("bankName", getBankName())
            .append("bankNo", getBankNo())
            .append("money", getMoney())
            .append("taxRate", getTaxRate())
            .append("remarks", getRemarks())
            .append("email", getEmail())
            .append("userName", getUserName())
            .append("userPhone", getUserPhone())
            .append("userAddress", getUserAddress())
            .append("files", getFiles())
            .append("trackingCompany", getTrackingCompany())
            .append("trackingNumber", getTrackingNumber())
            .append("createTime", getCreateTime())
            .append("updater", getUpdater())
            .append("updateTime", getUpdateTime())
            .append("creator", getCreator())
            .append("deleted", getDeleted())
            .toString();
    }
}
