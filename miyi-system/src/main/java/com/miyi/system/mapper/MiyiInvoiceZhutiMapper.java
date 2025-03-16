package com.miyi.system.mapper;

import java.util.List;
import com.miyi.system.domain.MiyiInvoiceZhuti;

/**
 * 开票主体Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public interface MiyiInvoiceZhutiMapper 
{
    /**
     * 查询开票主体
     * 
     * @param id 开票主体主键
     * @return 开票主体
     */
    public MiyiInvoiceZhuti selectMiyiInvoiceZhutiById(Long id);

    /**
     * 查询开票主体列表
     * 
     * @param miyiInvoiceZhuti 开票主体
     * @return 开票主体集合
     */
    public List<MiyiInvoiceZhuti> selectMiyiInvoiceZhutiList(MiyiInvoiceZhuti miyiInvoiceZhuti);

    /**
     * 新增开票主体
     * 
     * @param miyiInvoiceZhuti 开票主体
     * @return 结果
     */
    public int insertMiyiInvoiceZhuti(MiyiInvoiceZhuti miyiInvoiceZhuti);

    /**
     * 修改开票主体
     * 
     * @param miyiInvoiceZhuti 开票主体
     * @return 结果
     */
    public int updateMiyiInvoiceZhuti(MiyiInvoiceZhuti miyiInvoiceZhuti);

    /**
     * 删除开票主体
     * 
     * @param id 开票主体主键
     * @return 结果
     */
    public int deleteMiyiInvoiceZhutiById(Long id);

    /**
     * 批量删除开票主体
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMiyiInvoiceZhutiByIds(String[] ids);
}
