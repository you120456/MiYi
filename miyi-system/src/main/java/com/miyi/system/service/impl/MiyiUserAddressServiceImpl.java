package com.miyi.system.service.impl;

import java.util.List;
import com.miyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miyi.system.mapper.MiyiUserAddressMapper;
import com.miyi.system.domain.MiyiUserAddress;
import com.miyi.system.service.IMiyiUserAddressService;
import com.miyi.common.core.text.Convert;

/**
 * 公司收货信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Service
public class MiyiUserAddressServiceImpl implements IMiyiUserAddressService 
{
    @Autowired
    private MiyiUserAddressMapper miyiUserAddressMapper;

    /**
     * 查询公司收货信息
     * 
     * @param id 公司收货信息主键
     * @return 公司收货信息
     */
    @Override
    public MiyiUserAddress selectMiyiUserAddressById(Long id)
    {
        return miyiUserAddressMapper.selectMiyiUserAddressById(id);
    }

    /**
     * 查询公司收货信息列表
     * 
     * @param miyiUserAddress 公司收货信息
     * @return 公司收货信息
     */
    @Override
    public List<MiyiUserAddress> selectMiyiUserAddressList(MiyiUserAddress miyiUserAddress)
    {
        return miyiUserAddressMapper.selectMiyiUserAddressList(miyiUserAddress);
    }

    /**
     * 新增公司收货信息
     * 
     * @param miyiUserAddress 公司收货信息
     * @return 结果
     */
    @Override
    public int insertMiyiUserAddress(MiyiUserAddress miyiUserAddress)
    {
        miyiUserAddress.setCreateTime(DateUtils.getNowDate());
        return miyiUserAddressMapper.insertMiyiUserAddress(miyiUserAddress);
    }

    /**
     * 修改公司收货信息
     * 
     * @param miyiUserAddress 公司收货信息
     * @return 结果
     */
    @Override
    public int updateMiyiUserAddress(MiyiUserAddress miyiUserAddress)
    {
        miyiUserAddress.setUpdateTime(DateUtils.getNowDate());
        return miyiUserAddressMapper.updateMiyiUserAddress(miyiUserAddress);
    }

    /**
     * 批量删除公司收货信息
     * 
     * @param ids 需要删除的公司收货信息主键
     * @return 结果
     */
    @Override
    public int deleteMiyiUserAddressByIds(String ids)
    {
        return miyiUserAddressMapper.deleteMiyiUserAddressByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除公司收货信息信息
     * 
     * @param id 公司收货信息主键
     * @return 结果
     */
    @Override
    public int deleteMiyiUserAddressById(Long id)
    {
        return miyiUserAddressMapper.deleteMiyiUserAddressById(id);
    }
}
