package com.miyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.miyi.common.annotation.Excel;
import com.miyi.common.core.domain.BaseEntity;

/**
 * 客户对象 miyi_customer
 * 
 * @author miyi
 * @date 2025-03-16
 */
public class MiyiCustomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客户ID */
    private Long id;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String customerName;

    /** 营业执照号 */
    @Excel(name = "营业执照号")
    private String businessLicense;

    /** 营业执照附件 */
    @Excel(name = "营业执照附件")
    private String files;

    /** 法人姓名 */
    @Excel(name = "法人姓名")
    private String farenName;

    /** 法人手机号 */
    @Excel(name = "法人手机号")
    private String farenMobile;

    /** 经办人姓名 */
    @Excel(name = "经办人姓名")
    private String jbrName;

    /** 经办人手机号 */
    @Excel(name = "经办人手机号")
    private String jbrMobile;

    /** 经办人职位 */
    @Excel(name = "经办人职位")
    private String jbrPosition;

    /** 经办人邮箱 */
    @Excel(name = "经办人邮箱")
    private String jbrEmail;

    /** 经营业务 */
    @Excel(name = "经营业务")
    private String operatingBusiness;

    /** 公司网站 */
    @Excel(name = "公司网站")
    private String companyWebsite;

    /** 注册资金 */
    @Excel(name = "注册资金")
    private String registeredCapital;

    /** 详细地址 */
    @Excel(name = "详细地址")
    private String detailAddress;

    /** 客户来源 */
    @Excel(name = "客户来源")
    private String customerSource;

    /** 客户类型 */
    @Excel(name = "客户类型")
    private String customerType;

    /** 客户级别 */
    @Excel(name = "客户级别")
    private String level;

    /** 客户行业 */
    @Excel(name = "客户行业")
    private String industry;

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

    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getCustomerName() 
    {
        return customerName;
    }

    public void setBusinessLicense(String businessLicense) 
    {
        this.businessLicense = businessLicense;
    }

    public String getBusinessLicense() 
    {
        return businessLicense;
    }

    public void setFiles(String files) 
    {
        this.files = files;
    }

    public String getFiles() 
    {
        return files;
    }

    public void setFarenName(String farenName) 
    {
        this.farenName = farenName;
    }

    public String getFarenName() 
    {
        return farenName;
    }

    public void setFarenMobile(String farenMobile) 
    {
        this.farenMobile = farenMobile;
    }

    public String getFarenMobile() 
    {
        return farenMobile;
    }

    public void setJbrName(String jbrName) 
    {
        this.jbrName = jbrName;
    }

    public String getJbrName() 
    {
        return jbrName;
    }

    public void setJbrMobile(String jbrMobile) 
    {
        this.jbrMobile = jbrMobile;
    }

    public String getJbrMobile() 
    {
        return jbrMobile;
    }

    public void setJbrPosition(String jbrPosition) 
    {
        this.jbrPosition = jbrPosition;
    }

    public String getJbrPosition() 
    {
        return jbrPosition;
    }

    public void setJbrEmail(String jbrEmail) 
    {
        this.jbrEmail = jbrEmail;
    }

    public String getJbrEmail() 
    {
        return jbrEmail;
    }

    public void setOperatingBusiness(String operatingBusiness) 
    {
        this.operatingBusiness = operatingBusiness;
    }

    public String getOperatingBusiness() 
    {
        return operatingBusiness;
    }

    public void setCompanyWebsite(String companyWebsite) 
    {
        this.companyWebsite = companyWebsite;
    }

    public String getCompanyWebsite() 
    {
        return companyWebsite;
    }

    public void setRegisteredCapital(String registeredCapital) 
    {
        this.registeredCapital = registeredCapital;
    }

    public String getRegisteredCapital() 
    {
        return registeredCapital;
    }

    public void setDetailAddress(String detailAddress) 
    {
        this.detailAddress = detailAddress;
    }

    public String getDetailAddress() 
    {
        return detailAddress;
    }

    public void setCustomerSource(String customerSource) 
    {
        this.customerSource = customerSource;
    }

    public String getCustomerSource() 
    {
        return customerSource;
    }

    public void setCustomerType(String customerType) 
    {
        this.customerType = customerType;
    }

    public String getCustomerType() 
    {
        return customerType;
    }

    public void setLevel(String level) 
    {
        this.level = level;
    }

    public String getLevel() 
    {
        return level;
    }

    public void setIndustry(String industry) 
    {
        this.industry = industry;
    }

    public String getIndustry() 
    {
        return industry;
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
            .append("customerName", getCustomerName())
            .append("businessLicense", getBusinessLicense())
            .append("files", getFiles())
            .append("farenName", getFarenName())
            .append("farenMobile", getFarenMobile())
            .append("jbrName", getJbrName())
            .append("jbrMobile", getJbrMobile())
            .append("jbrPosition", getJbrPosition())
            .append("jbrEmail", getJbrEmail())
            .append("operatingBusiness", getOperatingBusiness())
            .append("remark", getRemark())
            .append("companyWebsite", getCompanyWebsite())
            .append("registeredCapital", getRegisteredCapital())
            .append("detailAddress", getDetailAddress())
            .append("customerSource", getCustomerSource())
            .append("customerType", getCustomerType())
            .append("level", getLevel())
            .append("industry", getIndustry())
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
