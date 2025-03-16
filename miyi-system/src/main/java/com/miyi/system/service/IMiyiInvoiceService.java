package com.miyi.system.service;

import java.util.List;
import com.miyi.system.domain.MiyiInvoice;

/**
 * 开票明细Service接口
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public interface IMiyiInvoiceService 
{
    /**
     * 查询开票明细
     * 
     * @param id 开票明细主键
     * @return 开票明细
     */
    public MiyiInvoice selectMiyiInvoiceById(Long id);

    /**
     * 查询开票明细列表
     * 
     * @param miyiInvoice 开票明细
     * @return 开票明细集合
     */
    public List<MiyiInvoice> selectMiyiInvoiceList(MiyiInvoice miyiInvoice);

    /**
     * 新增开票明细
     * 
     * @param miyiInvoice 开票明细
     * @return 结果
     */
    public int insertMiyiInvoice(MiyiInvoice miyiInvoice);

    /**
     * 修改开票明细
     * 
     * @param miyiInvoice 开票明细
     * @return 结果
     */
    public int updateMiyiInvoice(MiyiInvoice miyiInvoice);

    /**
     * 批量删除开票明细
     * 
     * @param ids 需要删除的开票明细主键集合
     * @return 结果
     */
    public int deleteMiyiInvoiceByIds(String ids);

    /**
     * 删除开票明细信息
     * 
     * @param id 开票明细主键
     * @return 结果
     */
    public int deleteMiyiInvoiceById(Long id);
}
