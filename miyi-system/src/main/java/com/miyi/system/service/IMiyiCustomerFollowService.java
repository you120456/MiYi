package com.miyi.system.service;

import java.util.List;
import com.miyi.system.domain.MiyiCustomerFollow;

/**
 * 跟进记录Service接口
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public interface IMiyiCustomerFollowService 
{
    /**
     * 查询跟进记录
     * 
     * @param id 跟进记录主键
     * @return 跟进记录
     */
    public MiyiCustomerFollow selectMiyiCustomerFollowById(Long id);

    /**
     * 查询跟进记录列表
     * 
     * @param miyiCustomerFollow 跟进记录
     * @return 跟进记录集合
     */
    public List<MiyiCustomerFollow> selectMiyiCustomerFollowList(MiyiCustomerFollow miyiCustomerFollow);

    /**
     * 新增跟进记录
     * 
     * @param miyiCustomerFollow 跟进记录
     * @return 结果
     */
    public int insertMiyiCustomerFollow(MiyiCustomerFollow miyiCustomerFollow);

    /**
     * 修改跟进记录
     * 
     * @param miyiCustomerFollow 跟进记录
     * @return 结果
     */
    public int updateMiyiCustomerFollow(MiyiCustomerFollow miyiCustomerFollow);

    /**
     * 批量删除跟进记录
     * 
     * @param ids 需要删除的跟进记录主键集合
     * @return 结果
     */
    public int deleteMiyiCustomerFollowByIds(String ids);

    /**
     * 删除跟进记录信息
     * 
     * @param id 跟进记录主键
     * @return 结果
     */
    public int deleteMiyiCustomerFollowById(Long id);
}
