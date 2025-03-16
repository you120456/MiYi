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
import com.miyi.system.domain.MiyiUserAddress;
import com.miyi.system.service.IMiyiUserAddressService;
import com.miyi.common.core.controller.BaseController;
import com.miyi.common.core.domain.AjaxResult;
import com.miyi.common.utils.poi.ExcelUtil;
import com.miyi.common.core.page.TableDataInfo;

/**
 * 公司收货信息Controller
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Controller
@RequestMapping("/system/address")
public class MiyiUserAddressController extends BaseController
{
    private String prefix = "system/address";

    @Autowired
    private IMiyiUserAddressService miyiUserAddressService;

    @RequiresPermissions("system:address:view")
    @GetMapping()
    public String address()
    {
        return prefix + "/address";
    }

    /**
     * 查询公司收货信息列表
     */
    @RequiresPermissions("system:address:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MiyiUserAddress miyiUserAddress)
    {
        startPage();
        List<MiyiUserAddress> list = miyiUserAddressService.selectMiyiUserAddressList(miyiUserAddress);
        return getDataTable(list);
    }

    /**
     * 导出公司收货信息列表
     */
    @RequiresPermissions("system:address:export")
    @Log(title = "公司收货信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MiyiUserAddress miyiUserAddress)
    {
        List<MiyiUserAddress> list = miyiUserAddressService.selectMiyiUserAddressList(miyiUserAddress);
        ExcelUtil<MiyiUserAddress> util = new ExcelUtil<MiyiUserAddress>(MiyiUserAddress.class);
        return util.exportExcel(list, "公司收货信息数据");
    }

    /**
     * 新增公司收货信息
     */
    @RequiresPermissions("system:address:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存公司收货信息
     */
    @RequiresPermissions("system:address:add")
    @Log(title = "公司收货信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MiyiUserAddress miyiUserAddress)
    {
        return toAjax(miyiUserAddressService.insertMiyiUserAddress(miyiUserAddress));
    }

    /**
     * 修改公司收货信息
     */
    @RequiresPermissions("system:address:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        MiyiUserAddress miyiUserAddress = miyiUserAddressService.selectMiyiUserAddressById(id);
        mmap.put("miyiUserAddress", miyiUserAddress);
        return prefix + "/edit";
    }

    /**
     * 修改保存公司收货信息
     */
    @RequiresPermissions("system:address:edit")
    @Log(title = "公司收货信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MiyiUserAddress miyiUserAddress)
    {
        return toAjax(miyiUserAddressService.updateMiyiUserAddress(miyiUserAddress));
    }

    /**
     * 删除公司收货信息
     */
    @RequiresPermissions("system:address:remove")
    @Log(title = "公司收货信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(miyiUserAddressService.deleteMiyiUserAddressByIds(ids));
    }
}
