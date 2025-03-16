package com.miyi.system.service;

import java.util.List;
import com.miyi.system.domain.MiyiSystemCity;

/**
 * 城市管理Service接口
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
public interface IMiyiSystemCityService 
{
    /**
     * 查询城市管理
     * 
     * @param id 城市管理主键
     * @return 城市管理
     */
    public MiyiSystemCity selectMiyiSystemCityById(Long id);

    /**
     * 查询城市管理列表
     * 
     * @param miyiSystemCity 城市管理
     * @return 城市管理集合
     */
    public List<MiyiSystemCity> selectMiyiSystemCityList(MiyiSystemCity miyiSystemCity);

    /**
     * 新增城市管理
     * 
     * @param miyiSystemCity 城市管理
     * @return 结果
     */
    public int insertMiyiSystemCity(MiyiSystemCity miyiSystemCity);

    /**
     * 修改城市管理
     * 
     * @param miyiSystemCity 城市管理
     * @return 结果
     */
    public int updateMiyiSystemCity(MiyiSystemCity miyiSystemCity);

    /**
     * 批量删除城市管理
     * 
     * @param ids 需要删除的城市管理主键集合
     * @return 结果
     */
    public int deleteMiyiSystemCityByIds(String ids);

    /**
     * 删除城市管理信息
     * 
     * @param id 城市管理主键
     * @return 结果
     */
    public int deleteMiyiSystemCityById(Long id);
}
