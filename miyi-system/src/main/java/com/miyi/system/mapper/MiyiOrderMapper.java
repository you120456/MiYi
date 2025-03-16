package com.miyi.system.mapper;

import java.util.List;
import com.miyi.system.domain.MiyiOrder;

/**
 * 订单Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public interface MiyiOrderMapper 
{
    /**
     * 查询订单
     * 
     * @param id 订单主键
     * @return 订单
     */
    public MiyiOrder selectMiyiOrderById(Long id);

    /**
     * 查询订单列表
     * 
     * @param miyiOrder 订单
     * @return 订单集合
     */
    public List<MiyiOrder> selectMiyiOrderList(MiyiOrder miyiOrder);

    /**
     * 新增订单
     * 
     * @param miyiOrder 订单
     * @return 结果
     */
    public int insertMiyiOrder(MiyiOrder miyiOrder);

    /**
     * 修改订单
     * 
     * @param miyiOrder 订单
     * @return 结果
     */
    public int updateMiyiOrder(MiyiOrder miyiOrder);

    /**
     * 删除订单
     * 
     * @param id 订单主键
     * @return 结果
     */
    public int deleteMiyiOrderById(Long id);

    /**
     * 批量删除订单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMiyiOrderByIds(String[] ids);
}
