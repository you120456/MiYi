package com.miyi.system.service.impl;

import java.util.List;
import com.miyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miyi.system.mapper.MiyiCustomerMapper;
import com.miyi.system.domain.MiyiCustomer;
import com.miyi.system.service.IMiyiCustomerService;
import com.miyi.common.core.text.Convert;

/**
 * 客户Service业务层处理
 * 
 * @author miyi
 * @date 2025-03-16
 */
@Service
public class MiyiCustomerServiceImpl implements IMiyiCustomerService 
{
    @Autowired
    private MiyiCustomerMapper miyiCustomerMapper;

    /**
     * 查询客户
     * 
     * @param id 客户主键
     * @return 客户
     */
    @Override
    public MiyiCustomer selectMiyiCustomerById(Long id)
    {
        return miyiCustomerMapper.selectMiyiCustomerById(id);
    }

    /**
     * 查询客户列表
     * 
     * @param miyiCustomer 客户
     * @return 客户
     */
    @Override
    public List<MiyiCustomer> selectMiyiCustomerList(MiyiCustomer miyiCustomer)
    {
        return miyiCustomerMapper.selectMiyiCustomerList(miyiCustomer);
    }

    /**
     * 新增客户
     * 
     * @param miyiCustomer 客户
     * @return 结果
     */
    @Override
    public int insertMiyiCustomer(MiyiCustomer miyiCustomer)
    {
        miyiCustomer.setCreateTime(DateUtils.getNowDate());
        return miyiCustomerMapper.insertMiyiCustomer(miyiCustomer);
    }

    /**
     * 修改客户
     * 
     * @param miyiCustomer 客户
     * @return 结果
     */
    @Override
    public int updateMiyiCustomer(MiyiCustomer miyiCustomer)
    {
        miyiCustomer.setUpdateTime(DateUtils.getNowDate());
        return miyiCustomerMapper.updateMiyiCustomer(miyiCustomer);
    }

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的客户主键
     * @return 结果
     */
    @Override
    public int deleteMiyiCustomerByIds(String ids)
    {
        return miyiCustomerMapper.deleteMiyiCustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息
     * 
     * @param id 客户主键
     * @return 结果
     */
    @Override
    public int deleteMiyiCustomerById(Long id)
    {
        return miyiCustomerMapper.deleteMiyiCustomerById(id);
    }
}
