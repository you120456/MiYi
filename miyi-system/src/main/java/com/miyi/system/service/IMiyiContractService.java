package com.miyi.system.service;

import java.util.List;
import com.miyi.system.domain.MiyiContract;

/**
 * 合同Service接口
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public interface IMiyiContractService 
{
    /**
     * 查询合同
     * 
     * @param id 合同主键
     * @return 合同
     */
    public MiyiContract selectMiyiContractById(Long id);

    /**
     * 查询合同列表
     * 
     * @param miyiContract 合同
     * @return 合同集合
     */
    public List<MiyiContract> selectMiyiContractList(MiyiContract miyiContract);

    /**
     * 新增合同
     * 
     * @param miyiContract 合同
     * @return 结果
     */
    public int insertMiyiContract(MiyiContract miyiContract);

    /**
     * 修改合同
     * 
     * @param miyiContract 合同
     * @return 结果
     */
    public int updateMiyiContract(MiyiContract miyiContract);

    /**
     * 批量删除合同
     * 
     * @param ids 需要删除的合同主键集合
     * @return 结果
     */
    public int deleteMiyiContractByIds(String ids);

    /**
     * 删除合同信息
     * 
     * @param id 合同主键
     * @return 结果
     */
    public int deleteMiyiContractById(Long id);
}
