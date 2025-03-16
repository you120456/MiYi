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
import com.miyi.system.domain.MiyiCustomer;
import com.miyi.system.service.IMiyiCustomerService;
import com.miyi.common.core.controller.BaseController;
import com.miyi.common.core.domain.AjaxResult;
import com.miyi.common.utils.poi.ExcelUtil;
import com.miyi.common.core.page.TableDataInfo;

/**
 * 客户Controller
 * 
 * @author miyi
 * @date 2025-03-16
 */
@Controller
@RequestMapping("/system/customer")
public class MiyiCustomerController extends BaseController
{
    private String prefix = "system/customer";

    @Autowired
    private IMiyiCustomerService miyiCustomerService;

    @RequiresPermissions("system:customer:view")
    @GetMapping()
    public String customer()
    {
        return prefix + "/customer";
    }

    /**
     * 查询客户列表
     */
    @RequiresPermissions("system:customer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MiyiCustomer miyiCustomer)
    {
        startPage();
        List<MiyiCustomer> list = miyiCustomerService.selectMiyiCustomerList(miyiCustomer);
        return getDataTable(list);
    }

    /**
     * 导出客户列表
     */
    @RequiresPermissions("system:customer:export")
    @Log(title = "客户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MiyiCustomer miyiCustomer)
    {
        List<MiyiCustomer> list = miyiCustomerService.selectMiyiCustomerList(miyiCustomer);
        ExcelUtil<MiyiCustomer> util = new ExcelUtil<MiyiCustomer>(MiyiCustomer.class);
        return util.exportExcel(list, "客户数据");
    }

    /**
     * 新增客户
     */
    @RequiresPermissions("system:customer:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户
     */
    @RequiresPermissions("system:customer:add")
    @Log(title = "客户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MiyiCustomer miyiCustomer)
    {
        return toAjax(miyiCustomerService.insertMiyiCustomer(miyiCustomer));
    }

    /**
     * 修改客户
     */
    @RequiresPermissions("system:customer:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        MiyiCustomer miyiCustomer = miyiCustomerService.selectMiyiCustomerById(id);
        mmap.put("miyiCustomer", miyiCustomer);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户
     */
    @RequiresPermissions("system:customer:edit")
    @Log(title = "客户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MiyiCustomer miyiCustomer)
    {
        return toAjax(miyiCustomerService.updateMiyiCustomer(miyiCustomer));
    }

    /**
     * 删除客户
     */
    @RequiresPermissions("system:customer:remove")
    @Log(title = "客户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(miyiCustomerService.deleteMiyiCustomerByIds(ids));
    }
}
