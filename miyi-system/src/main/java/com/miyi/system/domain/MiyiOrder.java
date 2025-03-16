package com.miyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.miyi.common.annotation.Excel;
import com.miyi.common.core.domain.BaseEntity;

/**
 * 订单对象 miyi_order
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public class MiyiOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单ID */
    private Long id;

    /** 客户ID */
    @Excel(name = "客户ID")
    private Long customerId;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private Long orederNo;

    /** 客户签约人 */
    @Excel(name = "客户签约人")
    private String contactsId;

    /** 订单类型  | 新开，零续，批续，换卡，补卡，套餐升级，销户，组流量池，退卡，预存款，叠加包，流量池叠加包 */
    @Excel(name = "订单类型  | 新开，零续，批续，换卡，补卡，套餐升级，销户，组流量池，退卡，预存款，叠加包，流量池叠加包")
    private String orderType;

    /** 运营商 |   中国电信，中国移动，中国联通，4G-MIFI，工业路由器，物联网卡系统，国际卡 */
    @Excel(name = "运营商 |   中国电信，中国移动，中国联通，4G-MIFI，工业路由器，物联网卡系统，国际卡")
    private String operator;

    /** 套餐名称 */
    @Excel(name = "套餐名称")
    private String packageInfo;

    /** 套餐类型| 包年，包月，半年包，季度包，空卡，30天包，15天包，叠加包，无限量卡，预存款 */
    @Excel(name = "套餐类型| 包年，包月，半年包，季度包，空卡，30天包，15天包，叠加包，无限量卡，预存款")
    private String packageType;

    /** 数量 */
    @Excel(name = "数量")
    private Long cidNumber;

    /** 订单金额 */
    @Excel(name = "订单金额")
    private BigDecimal orderMoney;

    /** 订单单价 */
    @Excel(name = "订单单价")
    private BigDecimal orderPrice;

    /** 付费周期 */
    @Excel(name = "付费周期")
    private Long paymentCycle;

    /** 付款方式 微信，支付宝，对公转账，对私转账 */
    @Excel(name = "付款方式 微信，支付宝，对公转账，对私转账")
    private String paymentMethod;

    /** 卡片类型 三切卡 二维码打卡板 贴片卡  工业级两切卡 NB 卡  二切卡  语言卡 5G卡  工业大板卡  联通工业级大卡 联通工业级小卡，叠加卡，国际卡 预存款 */
    @Excel(name = "卡片类型 三切卡 二维码打卡板 贴片卡  工业级两切卡 NB 卡  二切卡  语言卡 5G卡  工业大板卡  联通工业级大卡 联通工业级小卡，叠加卡，国际卡 预存款")
    private String cardType;

    /** 沉默期 3个月，6个月，0个月 */
    @Excel(name = "沉默期 3个月，6个月，0个月")
    private String silentPeriod;

    /** 单卡峰值 6G 10G  15G  20G  100M 300M  */
    @Excel(name = "单卡峰值 6G 10G  15G  20G  100M 300M ")
    private String peakValue;

    /** 流量类型 通用卡，定向卡 */
    @Excel(name = "流量类型 通用卡，定向卡")
    private String trafficType;

    /** 下单时间 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "下单时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date orderTime;

    /** 出卡日期 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "出卡日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cardOutTime;

    /** 收款日期 */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @Excel(name = "收款日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date receiveTime;

    /** 返利 */
    @Excel(name = "返利")
    private BigDecimal orderRebate;

    /** 卡费 */
    @Excel(name = "卡费")
    private BigDecimal cidMoney;

    /** 停机保号 默认两个月 */
    @Excel(name = "停机保号 默认两个月")
    private Long stopReserve;

    /** 订单金额 */
    @Excel(name = "订单金额")
    private BigDecimal money;

    /** 已收到款项 */
    @Excel(name = "已收到款项")
    private BigDecimal returnMoney;

    /** 开始号段 */
    @Excel(name = "开始号段")
    private String starCid;

    /** 结束号段 */
    @Excel(name = "结束号段")
    private String endCid;

    /** 属性|流量卡，机卡绑定，非机卡绑定，带短信，流量池共享，区域限制，测试卡，开收据，开发票 */
    @Excel(name = "属性|流量卡，机卡绑定，非机卡绑定，带短信，流量池共享，区域限制，测试卡，开收据，开发票")
    private String cidAttribute;

    /** 订单状态 0存档、1已下单、2订单完成、3订单作废 */
    @Excel(name = "订单状态 0存档、1已下单、2订单完成、3订单作废")
    private String orderStatus;

    /** 合同状态 0存档、1合同已上传、2合同作废 */
    @Excel(name = "合同状态 0存档、1合同已上传、2合同作废")
    private String contractStatus;

    /** 发票状态 0存档、1已上传、2作废 */
    @Excel(name = "发票状态 0存档、1已上传、2作废")
    private String invoiceStatus;

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

    public void setCustomerId(Long customerId) 
    {
        this.customerId = customerId;
    }

    public Long getCustomerId() 
    {
        return customerId;
    }

    public void setOrederNo(Long orederNo) 
    {
        this.orederNo = orederNo;
    }

    public Long getOrederNo() 
    {
        return orederNo;
    }

    public void setContactsId(String contactsId) 
    {
        this.contactsId = contactsId;
    }

    public String getContactsId() 
    {
        return contactsId;
    }

    public void setOrderType(String orderType) 
    {
        this.orderType = orderType;
    }

    public String getOrderType() 
    {
        return orderType;
    }

    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }

    public void setPackageInfo(String packageInfo) 
    {
        this.packageInfo = packageInfo;
    }

    public String getPackageInfo() 
    {
        return packageInfo;
    }

    public void setPackageType(String packageType) 
    {
        this.packageType = packageType;
    }

    public String getPackageType() 
    {
        return packageType;
    }

    public void setCidNumber(Long cidNumber) 
    {
        this.cidNumber = cidNumber;
    }

    public Long getCidNumber() 
    {
        return cidNumber;
    }

    public void setOrderMoney(BigDecimal orderMoney) 
    {
        this.orderMoney = orderMoney;
    }

    public BigDecimal getOrderMoney() 
    {
        return orderMoney;
    }

    public void setOrderPrice(BigDecimal orderPrice) 
    {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getOrderPrice() 
    {
        return orderPrice;
    }

    public void setPaymentCycle(Long paymentCycle) 
    {
        this.paymentCycle = paymentCycle;
    }

    public Long getPaymentCycle() 
    {
        return paymentCycle;
    }

    public void setPaymentMethod(String paymentMethod) 
    {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() 
    {
        return paymentMethod;
    }

    public void setCardType(String cardType) 
    {
        this.cardType = cardType;
    }

    public String getCardType() 
    {
        return cardType;
    }

    public void setSilentPeriod(String silentPeriod) 
    {
        this.silentPeriod = silentPeriod;
    }

    public String getSilentPeriod() 
    {
        return silentPeriod;
    }

    public void setPeakValue(String peakValue) 
    {
        this.peakValue = peakValue;
    }

    public String getPeakValue() 
    {
        return peakValue;
    }

    public void setTrafficType(String trafficType) 
    {
        this.trafficType = trafficType;
    }

    public String getTrafficType() 
    {
        return trafficType;
    }

    public void setOrderTime(Date orderTime) 
    {
        this.orderTime = orderTime;
    }

    public Date getOrderTime() 
    {
        return orderTime;
    }

    public void setCardOutTime(Date cardOutTime) 
    {
        this.cardOutTime = cardOutTime;
    }

    public Date getCardOutTime() 
    {
        return cardOutTime;
    }

    public void setReceiveTime(Date receiveTime) 
    {
        this.receiveTime = receiveTime;
    }

    public Date getReceiveTime() 
    {
        return receiveTime;
    }

    public void setOrderRebate(BigDecimal orderRebate) 
    {
        this.orderRebate = orderRebate;
    }

    public BigDecimal getOrderRebate() 
    {
        return orderRebate;
    }

    public void setCidMoney(BigDecimal cidMoney) 
    {
        this.cidMoney = cidMoney;
    }

    public BigDecimal getCidMoney() 
    {
        return cidMoney;
    }

    public void setStopReserve(Long stopReserve) 
    {
        this.stopReserve = stopReserve;
    }

    public Long getStopReserve() 
    {
        return stopReserve;
    }

    public void setMoney(BigDecimal money) 
    {
        this.money = money;
    }

    public BigDecimal getMoney() 
    {
        return money;
    }

    public void setReturnMoney(BigDecimal returnMoney) 
    {
        this.returnMoney = returnMoney;
    }

    public BigDecimal getReturnMoney() 
    {
        return returnMoney;
    }

    public void setStarCid(String starCid) 
    {
        this.starCid = starCid;
    }

    public String getStarCid() 
    {
        return starCid;
    }

    public void setEndCid(String endCid) 
    {
        this.endCid = endCid;
    }

    public String getEndCid() 
    {
        return endCid;
    }

    public void setCidAttribute(String cidAttribute) 
    {
        this.cidAttribute = cidAttribute;
    }

    public String getCidAttribute() 
    {
        return cidAttribute;
    }

    public void setOrderStatus(String orderStatus) 
    {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() 
    {
        return orderStatus;
    }

    public void setContractStatus(String contractStatus) 
    {
        this.contractStatus = contractStatus;
    }

    public String getContractStatus() 
    {
        return contractStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) 
    {
        this.invoiceStatus = invoiceStatus;
    }

    public String getInvoiceStatus() 
    {
        return invoiceStatus;
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
            .append("orederNo", getOrederNo())
            .append("contactsId", getContactsId())
            .append("orderType", getOrderType())
            .append("operator", getOperator())
            .append("packageInfo", getPackageInfo())
            .append("packageType", getPackageType())
            .append("cidNumber", getCidNumber())
            .append("orderMoney", getOrderMoney())
            .append("orderPrice", getOrderPrice())
            .append("paymentCycle", getPaymentCycle())
            .append("paymentMethod", getPaymentMethod())
            .append("cardType", getCardType())
            .append("silentPeriod", getSilentPeriod())
            .append("peakValue", getPeakValue())
            .append("trafficType", getTrafficType())
            .append("orderTime", getOrderTime())
            .append("cardOutTime", getCardOutTime())
            .append("receiveTime", getReceiveTime())
            .append("orderRebate", getOrderRebate())
            .append("cidMoney", getCidMoney())
            .append("stopReserve", getStopReserve())
            .append("money", getMoney())
            .append("returnMoney", getReturnMoney())
            .append("remark", getRemark())
            .append("starCid", getStarCid())
            .append("endCid", getEndCid())
            .append("cidAttribute", getCidAttribute())
            .append("orderStatus", getOrderStatus())
            .append("contractStatus", getContractStatus())
            .append("invoiceStatus", getInvoiceStatus())
            .append("updater", getUpdater())
            .append("updateTime", getUpdateTime())
            .append("creator", getCreator())
            .append("deleted", getDeleted())
            .toString();
    }
}
