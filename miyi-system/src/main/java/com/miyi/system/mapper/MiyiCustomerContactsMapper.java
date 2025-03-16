package com.miyi.system.mapper;

import java.util.List;
import com.miyi.system.domain.MiyiCustomerContacts;

/**
 * 客户公司联系人Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public interface MiyiCustomerContactsMapper 
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
     * 删除客户公司联系人
     * 
     * @param id 客户公司联系人主键
     * @return 结果
     */
    public int deleteMiyiCustomerContactsById(Long id);

    /**
     * 批量删除客户公司联系人
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMiyiCustomerContactsByIds(String[] ids);
}
