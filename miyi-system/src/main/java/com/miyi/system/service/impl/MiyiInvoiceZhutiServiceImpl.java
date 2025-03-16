package com.miyi.system.service.impl;

import java.util.List;
import com.miyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miyi.system.mapper.MiyiInvoiceZhutiMapper;
import com.miyi.system.domain.MiyiInvoiceZhuti;
import com.miyi.system.service.IMiyiInvoiceZhutiService;
import com.miyi.common.core.text.Convert;

/**
 * 开票主体Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Service
public class MiyiInvoiceZhutiServiceImpl implements IMiyiInvoiceZhutiService 
{
    @Autowired
    private MiyiInvoiceZhutiMapper miyiInvoiceZhutiMapper;

    /**
     * 查询开票主体
     * 
     * @param id 开票主体主键
     * @return 开票主体
     */
    @Override
    public MiyiInvoiceZhuti selectMiyiInvoiceZhutiById(Long id)
    {
        return miyiInvoiceZhutiMapper.selectMiyiInvoiceZhutiById(id);
    }

    /**
     * 查询开票主体列表
     * 
     * @param miyiInvoiceZhuti 开票主体
     * @return 开票主体
     */
    @Override
    public List<MiyiInvoiceZhuti> selectMiyiInvoiceZhutiList(MiyiInvoiceZhuti miyiInvoiceZhuti)
    {
        return miyiInvoiceZhutiMapper.selectMiyiInvoiceZhutiList(miyiInvoiceZhuti);
    }

    /**
     * 新增开票主体
     * 
     * @param miyiInvoiceZhuti 开票主体
     * @return 结果
     */
    @Override
    public int insertMiyiInvoiceZhuti(MiyiInvoiceZhuti miyiInvoiceZhuti)
    {
        miyiInvoiceZhuti.setCreateTime(DateUtils.getNowDate());
        return miyiInvoiceZhutiMapper.insertMiyiInvoiceZhuti(miyiInvoiceZhuti);
    }

    /**
     * 修改开票主体
     * 
     * @param miyiInvoiceZhuti 开票主体
     * @return 结果
     */
    @Override
    public int updateMiyiInvoiceZhuti(MiyiInvoiceZhuti miyiInvoiceZhuti)
    {
        miyiInvoiceZhuti.setUpdateTime(DateUtils.getNowDate());
        return miyiInvoiceZhutiMapper.updateMiyiInvoiceZhuti(miyiInvoiceZhuti);
    }

    /**
     * 批量删除开票主体
     * 
     * @param ids 需要删除的开票主体主键
     * @return 结果
     */
    @Override
    public int deleteMiyiInvoiceZhutiByIds(String ids)
    {
        return miyiInvoiceZhutiMapper.deleteMiyiInvoiceZhutiByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除开票主体信息
     * 
     * @param id 开票主体主键
     * @return 结果
     */
    @Override
    public int deleteMiyiInvoiceZhutiById(Long id)
    {
        return miyiInvoiceZhutiMapper.deleteMiyiInvoiceZhutiById(id);
    }
}
