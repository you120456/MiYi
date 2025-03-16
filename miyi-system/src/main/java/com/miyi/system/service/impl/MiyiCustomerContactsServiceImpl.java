package com.miyi.system.service.impl;

import java.util.List;
import com.miyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miyi.system.mapper.MiyiCustomerContactsMapper;
import com.miyi.system.domain.MiyiCustomerContacts;
import com.miyi.system.service.IMiyiCustomerContactsService;
import com.miyi.common.core.text.Convert;

/**
 * 客户公司联系人Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Service
public class MiyiCustomerContactsServiceImpl implements IMiyiCustomerContactsService 
{
    @Autowired
    private MiyiCustomerContactsMapper miyiCustomerContactsMapper;

    /**
     * 查询客户公司联系人
     * 
     * @param id 客户公司联系人主键
     * @return 客户公司联系人
     */
    @Override
    public MiyiCustomerContacts selectMiyiCustomerContactsById(Long id)
    {
        return miyiCustomerContactsMapper.selectMiyiCustomerContactsById(id);
    }

    /**
     * 查询客户公司联系人列表
     * 
     * @param miyiCustomerContacts 客户公司联系人
     * @return 客户公司联系人
     */
    @Override
    public List<MiyiCustomerContacts> selectMiyiCustomerContactsList(MiyiCustomerContacts miyiCustomerContacts)
    {
        return miyiCustomerContactsMapper.selectMiyiCustomerContactsList(miyiCustomerContacts);
    }

    /**
     * 新增客户公司联系人
     * 
     * @param miyiCustomerContacts 客户公司联系人
     * @return 结果
     */
    @Override
    public int insertMiyiCustomerContacts(MiyiCustomerContacts miyiCustomerContacts)
    {
        miyiCustomerContacts.setCreateTime(DateUtils.getNowDate());
        return miyiCustomerContactsMapper.insertMiyiCustomerContacts(miyiCustomerContacts);
    }

    /**
     * 修改客户公司联系人
     * 
     * @param miyiCustomerContacts 客户公司联系人
     * @return 结果
     */
    @Override
    public int updateMiyiCustomerContacts(MiyiCustomerContacts miyiCustomerContacts)
    {
        miyiCustomerContacts.setUpdateTime(DateUtils.getNowDate());
        return miyiCustomerContactsMapper.updateMiyiCustomerContacts(miyiCustomerContacts);
    }

    /**
     * 批量删除客户公司联系人
     * 
     * @param ids 需要删除的客户公司联系人主键
     * @return 结果
     */
    @Override
    public int deleteMiyiCustomerContactsByIds(String ids)
    {
        return miyiCustomerContactsMapper.deleteMiyiCustomerContactsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户公司联系人信息
     * 
     * @param id 客户公司联系人主键
     * @return 结果
     */
    @Override
    public int deleteMiyiCustomerContactsById(Long id)
    {
        return miyiCustomerContactsMapper.deleteMiyiCustomerContactsById(id);
    }
}
