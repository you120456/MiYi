package com.miyi.system.service.impl;

import java.util.List;
import com.miyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miyi.system.mapper.MiyiSystemCityMapper;
import com.miyi.system.domain.MiyiSystemCity;
import com.miyi.system.service.IMiyiSystemCityService;
import com.miyi.common.core.text.Convert;

/**
 * 城市管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Service
public class MiyiSystemCityServiceImpl implements IMiyiSystemCityService 
{
    @Autowired
    private MiyiSystemCityMapper miyiSystemCityMapper;

    /**
     * 查询城市管理
     * 
     * @param id 城市管理主键
     * @return 城市管理
     */
    @Override
    public MiyiSystemCity selectMiyiSystemCityById(Long id)
    {
        return miyiSystemCityMapper.selectMiyiSystemCityById(id);
    }

    /**
     * 查询城市管理列表
     * 
     * @param miyiSystemCity 城市管理
     * @return 城市管理
     */
    @Override
    public List<MiyiSystemCity> selectMiyiSystemCityList(MiyiSystemCity miyiSystemCity)
    {
        return miyiSystemCityMapper.selectMiyiSystemCityList(miyiSystemCity);
    }

    /**
     * 新增城市管理
     * 
     * @param miyiSystemCity 城市管理
     * @return 结果
     */
    @Override
    public int insertMiyiSystemCity(MiyiSystemCity miyiSystemCity)
    {
        miyiSystemCity.setCreateTime(DateUtils.getNowDate());
        return miyiSystemCityMapper.insertMiyiSystemCity(miyiSystemCity);
    }

    /**
     * 修改城市管理
     * 
     * @param miyiSystemCity 城市管理
     * @return 结果
     */
    @Override
    public int updateMiyiSystemCity(MiyiSystemCity miyiSystemCity)
    {
        miyiSystemCity.setUpdateTime(DateUtils.getNowDate());
        return miyiSystemCityMapper.updateMiyiSystemCity(miyiSystemCity);
    }

    /**
     * 批量删除城市管理
     * 
     * @param ids 需要删除的城市管理主键
     * @return 结果
     */
    @Override
    public int deleteMiyiSystemCityByIds(String ids)
    {
        return miyiSystemCityMapper.deleteMiyiSystemCityByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除城市管理信息
     * 
     * @param id 城市管理主键
     * @return 结果
     */
    @Override
    public int deleteMiyiSystemCityById(Long id)
    {
        return miyiSystemCityMapper.deleteMiyiSystemCityById(id);
    }
}
