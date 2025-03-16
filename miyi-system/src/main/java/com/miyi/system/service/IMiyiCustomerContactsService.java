package com.miyi.system.service;

import java.util.List;
import com.miyi.system.domain.MiyiCustomerContacts;

/**
 * 客户公司联系人Service接口
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public interface IMiyiCustomerContactsService 
{
    /**
     * 查询客户公司联系人
     * 
     * @param id 客户公司联系人主键
     * @return 客户公司联系人
     */
    public MiyiCustomerContacts selectMiyiCustomerContactsById(Long id);

    /**
     * 查询客户公司联系人列表
     * 
     * @param miyiCustomerContacts 客户公司联系人
     * @return 客户公司联系人集合
     */
    public List<MiyiCustomerContacts> selectMiyiCustomerContactsList(MiyiCustomerContacts miyiCustomerContacts);

    /**
     * 新增客户公司联系人
     * 
     * @param miyiCustomerContacts 客户公司联系人
     * @return 结果
     */
    public int insertMiyiCustomerContacts(MiyiCustomerContacts miyiCustomerContacts);

    /**
     * 修改客户公司联系人
     * 
     * @param miyiCustomerContacts 客户公司联系人
     * @return 结果
     */
    public int updateMiyiCustomerContacts(MiyiCustomerContacts miyiCustomerContacts);

    /**
     * 批量删除客户公司联系人
     * 
     * @param ids 需要删除的客户公司联系人主键集合
     * @return 结果
     */
    public int deleteMiyiCustomerContactsByIds(String ids);

    /**
     * 删除客户公司联系人信息
     * 
     * @param id 客户公司联系人主键
     * @return 结果
     */
    public int deleteMiyiCustomerContactsById(Long id);
}
