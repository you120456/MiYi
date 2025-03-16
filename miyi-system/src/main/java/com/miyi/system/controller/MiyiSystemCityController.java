package com.miyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.miyi.common.annotation.Log;
import com.miyi.common.enums.BusinessType;
import com.miyi.system.domain.MiyiSystemCity;
import com.miyi.system.service.IMiyiSystemCityService;
import com.miyi.common.core.controller.BaseController;
import com.miyi.common.core.domain.AjaxResult;
import com.miyi.common.utils.poi.ExcelUtil;
import com.miyi.common.core.page.TableDataInfo;

/**
 * 城市管理Controller
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Controller
@RequestMapping("/system/city")
public class MiyiSystemCityController extends BaseController
{
    private String prefix = "system/city";

    @Autowired
    private IMiyiSystemCityService miyiSystemCityService;

    @RequiresPermissions("system:city:view")
    @GetMapping()
    public String city()
    {
        return prefix + "/city";
    }

    /**
     * 查询城市管理列表
     */
    @RequiresPermissions("system:city:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MiyiSystemCity miyiSystemCity)
    {
        startPage();
        List<MiyiSystemCity> list = miyiSystemCityService.selectMiyiSystemCityList(miyiSystemCity);
        return getDataTable(list);
    }

    /**
     * 导出城市管理列表
     */
    @RequiresPermissions("system:city:export")
    @Log(title = "城市管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MiyiSystemCity miyiSystemCity)
    {
        List<MiyiSystemCity> list = miyiSystemCityService.selectMiyiSystemCityList(miyiSystemCity);
        ExcelUtil<MiyiSystemCity> util = new ExcelUtil<MiyiSystemCity>(MiyiSystemCity.class);
        return util.exportExcel(list, "城市管理数据");
    }

    /**
     * 新增城市管理
     */
    @RequiresPermissions("system:city:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存城市管理
     */
    @RequiresPermissions("system:city:add")
    @Log(title = "城市管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MiyiSystemCity miyiSystemCity)
    {
        return toAjax(miyiSystemCityService.insertMiyiSystemCity(miyiSystemCity));
    }

    /**
     * 修改城市管理
     */
    @RequiresPermissions("system:city:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        MiyiSystemCity miyiSystemCity = miyiSystemCityService.selectMiyiSystemCityById(id);
        mmap.put("miyiSystemCity", miyiSystemCity);
        return prefix + "/edit";
    }

    /**
     * 修改保存城市管理
     */
    @RequiresPermissions("system:city:edit")
    @Log(title = "城市管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MiyiSystemCity miyiSystemCity)
    {
        return toAjax(miyiSystemCityService.updateMiyiSystemCity(miyiSystemCity));
    }

    /**
     * 删除城市管理
     */
    @RequiresPermissions("system:city:remove")
    @Log(title = "城市管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(miyiSystemCityService.deleteMiyiSystemCityByIds(ids));
    }
}
