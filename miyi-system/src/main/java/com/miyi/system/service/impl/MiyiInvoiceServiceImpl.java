package com.miyi.system.service.impl;

import java.util.List;
import com.miyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miyi.system.mapper.MiyiInvoiceMapper;
import com.miyi.system.domain.MiyiInvoice;
import com.miyi.system.service.IMiyiInvoiceService;
import com.miyi.common.core.text.Convert;

/**
 * 开票明细Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Service
public class MiyiInvoiceServiceImpl implements IMiyiInvoiceService 
{
    @Autowired
    private MiyiInvoiceMapper miyiInvoiceMapper;

    /**
     * 查询开票明细
     * 
     * @param id 开票明细主键
     * @return 开票明细
     */
    @Override
    public MiyiInvoice selectMiyiInvoiceById(Long id)
    {
        return miyiInvoiceMapper.selectMiyiInvoiceById(id);
    }

    /**
     * 查询开票明细列表
     * 
     * @param miyiInvoice 开票明细
     * @return 开票明细
     */
    @Override
    public List<MiyiInvoice> selectMiyiInvoiceList(MiyiInvoice miyiInvoice)
    {
        return miyiInvoiceMapper.selectMiyiInvoiceList(miyiInvoice);
    }

    /**
     * 新增开票明细
     * 
     * @param miyiInvoice 开票明细
     * @return 结果
     */
    @Override
    public int insertMiyiInvoice(MiyiInvoice miyiInvoice)
    {
        miyiInvoice.setCreateTime(DateUtils.getNowDate());
        return miyiInvoiceMapper.insertMiyiInvoice(miyiInvoice);
    }

    /**
     * 修改开票明细
     * 
     * @param miyiInvoice 开票明细
     * @return 结果
     */
    @Override
    public int updateMiyiInvoice(MiyiInvoice miyiInvoice)
    {
        miyiInvoice.setUpdateTime(DateUtils.getNowDate());
        return miyiInvoiceMapper.updateMiyiInvoice(miyiInvoice);
    }

    /**
     * 批量删除开票明细
     * 
     * @param ids 需要删除的开票明细主键
     * @return 结果
     */
    @Override
    public int deleteMiyiInvoiceByIds(String ids)
    {
        return miyiInvoiceMapper.deleteMiyiInvoiceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除开票明细信息
     * 
     * @param id 开票明细主键
     * @return 结果
     */
    @Override
    public int deleteMiyiInvoiceById(Long id)
    {
        return miyiInvoiceMapper.deleteMiyiInvoiceById(id);
    }
}
