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
import com.miyi.system.domain.MiyiCustomerContacts;
import com.miyi.system.service.IMiyiCustomerContactsService;
import com.miyi.common.core.controller.BaseController;
import com.miyi.common.core.domain.AjaxResult;
import com.miyi.common.utils.poi.ExcelUtil;
import com.miyi.common.core.page.TableDataInfo;

/**
 * 客户公司联系人Controller
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Controller
@RequestMapping("/system/contacts")
public class MiyiCustomerContactsController extends BaseController
{
    private String prefix = "system/contacts";

    @Autowired
    private IMiyiCustomerContactsService miyiCustomerContactsService;

    @RequiresPermissions("system:contacts:view")
    @GetMapping()
    public String contacts()
    {
        return prefix + "/contacts";
    }

    /**
     * 查询客户公司联系人列表
     */
    @RequiresPermissions("system:contacts:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MiyiCustomerContacts miyiCustomerContacts)
    {
        startPage();
        List<MiyiCustomerContacts> list = miyiCustomerContactsService.selectMiyiCustomerContactsList(miyiCustomerContacts);
        return getDataTable(list);
    }

    /**
     * 导出客户公司联系人列表
     */
    @RequiresPermissions("system:contacts:export")
    @Log(title = "客户公司联系人", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MiyiCustomerContacts miyiCustomerContacts)
    {
        List<MiyiCustomerContacts> list = miyiCustomerContactsService.selectMiyiCustomerContactsList(miyiCustomerContacts);
        ExcelUtil<MiyiCustomerContacts> util = new ExcelUtil<MiyiCustomerContacts>(MiyiCustomerContacts.class);
        return util.exportExcel(list, "客户公司联系人数据");
    }

    /**
     * 新增客户公司联系人
     */
    @RequiresPermissions("system:contacts:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户公司联系人
     */
    @RequiresPermissions("system:contacts:add")
    @Log(title = "客户公司联系人", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MiyiCustomerContacts miyiCustomerContacts)
    {
        return toAjax(miyiCustomerContactsService.insertMiyiCustomerContacts(miyiCustomerContacts));
    }

    /**
     * 修改客户公司联系人
     */
    @RequiresPermissions("system:contacts:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        MiyiCustomerContacts miyiCustomerContacts = miyiCustomerContactsService.selectMiyiCustomerContactsById(id);
        mmap.put("miyiCustomerContacts", miyiCustomerContacts);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户公司联系人
     */
    @RequiresPermissions("system:contacts:edit")
    @Log(title = "客户公司联系人", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MiyiCustomerContacts miyiCustomerContacts)
    {
        return toAjax(miyiCustomerContactsService.updateMiyiCustomerContacts(miyiCustomerContacts));
    }

    /**
     * 删除客户公司联系人
     */
    @RequiresPermissions("system:contacts:remove")
    @Log(title = "客户公司联系人", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(miyiCustomerContactsService.deleteMiyiCustomerContactsByIds(ids));
    }
}
