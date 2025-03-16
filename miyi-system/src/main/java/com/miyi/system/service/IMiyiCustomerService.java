package com.miyi.system.service;

import java.util.List;
import com.miyi.system.domain.MiyiCustomer;

/**
 * 客户Service接口
 * 
 * @author miyi
 * @date 2025-03-16
 */
public interface IMiyiCustomerService 
{
    /**
     * 查询客户
     * 
     * @param id 客户主键
     * @return 客户
     */
    public MiyiCustomer selectMiyiCustomerById(Long id);

    /**
     * 查询客户列表
     * 
     * @param miyiCustomer 客户
     * @return 客户集合
     */
    public List<MiyiCustomer> selectMiyiCustomerList(MiyiCustomer miyiCustomer);

    /**
     * 新增客户
     * 
     * @param miyiCustomer 客户
     * @return 结果
     */
    public int insertMiyiCustomer(MiyiCustomer miyiCustomer);

    /**
     * 修改客户
     * 
     * @param miyiCustomer 客户
     * @return 结果
     */
    public int updateMiyiCustomer(MiyiCustomer miyiCustomer);

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的客户主键集合
     * @return 结果
     */
    public int deleteMiyiCustomerByIds(String ids);

    /**
     * 删除客户信息
     * 
     * @param id 客户主键
     * @return 结果
     */
    public int deleteMiyiCustomerById(Long id);
}
