package com.miyi.system.service.impl;

import java.util.List;
import com.miyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miyi.system.mapper.MiyiContractMapper;
import com.miyi.system.domain.MiyiContract;
import com.miyi.system.service.IMiyiContractService;
import com.miyi.common.core.text.Convert;

/**
 * 合同Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Service
public class MiyiContractServiceImpl implements IMiyiContractService 
{
    @Autowired
    private MiyiContractMapper miyiContractMapper;

    /**
     * 查询合同
     * 
     * @param id 合同主键
     * @return 合同
     */
    @Override
    public MiyiContract selectMiyiContractById(Long id)
    {
        return miyiContractMapper.selectMiyiContractById(id);
    }

    /**
     * 查询合同列表
     * 
     * @param miyiContract 合同
     * @return 合同
     */
    @Override
    public List<MiyiContract> selectMiyiContractList(MiyiContract miyiContract)
    {
        return miyiContractMapper.selectMiyiContractList(miyiContract);
    }

    /**
     * 新增合同
     * 
     * @param miyiContract 合同
     * @return 结果
     */
    @Override
    public int insertMiyiContract(MiyiContract miyiContract)
    {
        miyiContract.setCreateTime(DateUtils.getNowDate());
        return miyiContractMapper.insertMiyiContract(miyiContract);
    }

    /**
     * 修改合同
     * 
     * @param miyiContract 合同
     * @return 结果
     */
    @Override
    public int updateMiyiContract(MiyiContract miyiContract)
    {
        miyiContract.setUpdateTime(DateUtils.getNowDate());
        return miyiContractMapper.updateMiyiContract(miyiContract);
    }

    /**
     * 批量删除合同
     * 
     * @param ids 需要删除的合同主键
     * @return 结果
     */
    @Override
    public int deleteMiyiContractByIds(String ids)
    {
        return miyiContractMapper.deleteMiyiContractByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除合同信息
     * 
     * @param id 合同主键
     * @return 结果
     */
    @Override
    public int deleteMiyiContractById(Long id)
    {
        return miyiContractMapper.deleteMiyiContractById(id);
    }
}
