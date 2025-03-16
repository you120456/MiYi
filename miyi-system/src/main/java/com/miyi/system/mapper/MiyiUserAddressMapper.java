package com.miyi.system.mapper;

import java.util.List;
import com.miyi.system.domain.MiyiUserAddress;

/**
 * 公司收货信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public interface MiyiUserAddressMapper 
{
    /**
     * 查询公司收货信息
     * 
     * @param id 公司收货信息主键
     * @return 公司收货信息
     */
    public MiyiUserAddress selectMiyiUserAddressById(Long id);

    /**
     * 查询公司收货信息列表
     * 
     * @param miyiUserAddress 公司收货信息
     * @return 公司收货信息集合
     */
    public List<MiyiUserAddress> selectMiyiUserAddressList(MiyiUserAddress miyiUserAddress);

    /**
     * 新增公司收货信息
     * 
     * @param miyiUserAddress 公司收货信息
     * @return 结果
     */
    public int insertMiyiUserAddress(MiyiUserAddress miyiUserAddress);

    /**
     * 修改公司收货信息
     * 
     * @param miyiUserAddress 公司收货信息
     * @return 结果
     */
    public int updateMiyiUserAddress(MiyiUserAddress miyiUserAddress);

    /**
     * 删除公司收货信息
     * 
     * @param id 公司收货信息主键
     * @return 结果
     */
    public int deleteMiyiUserAddressById(Long id);

    /**
     * 批量删除公司收货信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMiyiUserAddressByIds(String[] ids);
}
