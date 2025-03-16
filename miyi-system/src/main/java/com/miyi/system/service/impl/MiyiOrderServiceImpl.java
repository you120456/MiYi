package com.miyi.system.service.impl;

import java.util.List;
import com.miyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miyi.system.mapper.MiyiOrderMapper;
import com.miyi.system.domain.MiyiOrder;
import com.miyi.system.service.IMiyiOrderService;
import com.miyi.common.core.text.Convert;

/**
 * 订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Service
public class MiyiOrderServiceImpl implements IMiyiOrderService 
{
    @Autowired
    private MiyiOrderMapper miyiOrderMapper;

    /**
     * 查询订单
     * 
     * @param id 订单主键
     * @return 订单
     */
    @Override
    public MiyiOrder selectMiyiOrderById(Long id)
    {
        return miyiOrderMapper.selectMiyiOrderById(id);
    }

    /**
     * 查询订单列表
     * 
     * @param miyiOrder 订单
     * @return 订单
     */
    @Override
    public List<MiyiOrder> selectMiyiOrderList(MiyiOrder miyiOrder)
    {
        return miyiOrderMapper.selectMiyiOrderList(miyiOrder);
    }

    /**
     * 新增订单
     * 
     * @param miyiOrder 订单
     * @return 结果
     */
    @Override
    public int insertMiyiOrder(MiyiOrder miyiOrder)
    {
        return miyiOrderMapper.insertMiyiOrder(miyiOrder);
    }

    /**
     * 修改订单
     * 
     * @param miyiOrder 订单
     * @return 结果
     */
    @Override
    public int updateMiyiOrder(MiyiOrder miyiOrder)
    {
        miyiOrder.setUpdateTime(DateUtils.getNowDate());
        return miyiOrderMapper.updateMiyiOrder(miyiOrder);
    }

    /**
     * 批量删除订单
     * 
     * @param ids 需要删除的订单主键
     * @return 结果
     */
    @Override
    public int deleteMiyiOrderByIds(String ids)
    {
        return miyiOrderMapper.deleteMiyiOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除订单信息
     * 
     * @param id 订单主键
     * @return 结果
     */
    @Override
    public int deleteMiyiOrderById(Long id)
    {
        return miyiOrderMapper.deleteMiyiOrderById(id);
    }
}
