package com.miyi.system.service.impl;

import java.util.List;
import com.miyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miyi.system.mapper.MiyiCustomerFollowMapper;
import com.miyi.system.domain.MiyiCustomerFollow;
import com.miyi.system.service.IMiyiCustomerFollowService;
import com.miyi.common.core.text.Convert;

/**
 * 跟进记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Service
public class MiyiCustomerFollowServiceImpl implements IMiyiCustomerFollowService 
{
    @Autowired
    private MiyiCustomerFollowMapper miyiCustomerFollowMapper;

    /**
     * 查询跟进记录
     * 
     * @param id 跟进记录主键
     * @return 跟进记录
     */
    @Override
    public MiyiCustomerFollow selectMiyiCustomerFollowById(Long id)
    {
        return miyiCustomerFollowMapper.selectMiyiCustomerFollowById(id);
    }

    /**
     * 查询跟进记录列表
     * 
     * @param miyiCustomerFollow 跟进记录
     * @return 跟进记录
     */
    @Override
    public List<MiyiCustomerFollow> selectMiyiCustomerFollowList(MiyiCustomerFollow miyiCustomerFollow)
    {
        return miyiCustomerFollowMapper.selectMiyiCustomerFollowList(miyiCustomerFollow);
    }

    /**
     * 新增跟进记录
     * 
     * @param miyiCustomerFollow 跟进记录
     * @return 结果
     */
    @Override
    public int insertMiyiCustomerFollow(MiyiCustomerFollow miyiCustomerFollow)
    {
        miyiCustomerFollow.setCreateTime(DateUtils.getNowDate());
        return miyiCustomerFollowMapper.insertMiyiCustomerFollow(miyiCustomerFollow);
    }

    /**
     * 修改跟进记录
     * 
     * @param miyiCustomerFollow 跟进记录
     * @return 结果
     */
    @Override
    public int updateMiyiCustomerFollow(MiyiCustomerFollow miyiCustomerFollow)
    {
        miyiCustomerFollow.setUpdateTime(DateUtils.getNowDate());
        return miyiCustomerFollowMapper.updateMiyiCustomerFollow(miyiCustomerFollow);
    }

    /**
     * 批量删除跟进记录
     * 
     * @param ids 需要删除的跟进记录主键
     * @return 结果
     */
    @Override
    public int deleteMiyiCustomerFollowByIds(String ids)
    {
        return miyiCustomerFollowMapper.deleteMiyiCustomerFollowByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除跟进记录信息
     * 
     * @param id 跟进记录主键
     * @return 结果
     */
    @Override
    public int deleteMiyiCustomerFollowById(Long id)
    {
        return miyiCustomerFollowMapper.deleteMiyiCustomerFollowById(id);
    }
}
