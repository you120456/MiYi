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
import com.miyi.system.domain.MiyiInvoiceZhuti;
import com.miyi.system.service.IMiyiInvoiceZhutiService;
import com.miyi.common.core.controller.BaseController;
import com.miyi.common.core.domain.AjaxResult;
import com.miyi.common.utils.poi.ExcelUtil;
import com.miyi.common.core.page.TableDataInfo;

/**
 * 开票主体Controller
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Controller
@RequestMapping("/system/zhuti")
public class MiyiInvoiceZhutiController extends BaseController
{
    private String prefix = "system/zhuti";

    @Autowired
    private IMiyiInvoiceZhutiService miyiInvoiceZhutiService;

    @RequiresPermissions("system:zhuti:view")
    @GetMapping()
    public String zhuti()
    {
        return prefix + "/zhuti";
    }

    /**
     * 查询开票主体列表
     */
    @RequiresPermissions("system:zhuti:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MiyiInvoiceZhuti miyiInvoiceZhuti)
    {
        startPage();
        List<MiyiInvoiceZhuti> list = miyiInvoiceZhutiService.selectMiyiInvoiceZhutiList(miyiInvoiceZhuti);
        return getDataTable(list);
    }

    /**
     * 导出开票主体列表
     */
    @RequiresPermissions("system:zhuti:export")
    @Log(title = "开票主体", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MiyiInvoiceZhuti miyiInvoiceZhuti)
    {
        List<MiyiInvoiceZhuti> list = miyiInvoiceZhutiService.selectMiyiInvoiceZhutiList(miyiInvoiceZhuti);
        ExcelUtil<MiyiInvoiceZhuti> util = new ExcelUtil<MiyiInvoiceZhuti>(MiyiInvoiceZhuti.class);
        return util.exportExcel(list, "开票主体数据");
    }

    /**
     * 新增开票主体
     */
    @RequiresPermissions("system:zhuti:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存开票主体
     */
    @RequiresPermissions("system:zhuti:add")
    @Log(title = "开票主体", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MiyiInvoiceZhuti miyiInvoiceZhuti)
    {
        return toAjax(miyiInvoiceZhutiService.insertMiyiInvoiceZhuti(miyiInvoiceZhuti));
    }

    /**
     * 修改开票主体
     */
    @RequiresPermissions("system:zhuti:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        MiyiInvoiceZhuti miyiInvoiceZhuti = miyiInvoiceZhutiService.selectMiyiInvoiceZhutiById(id);
        mmap.put("miyiInvoiceZhuti", miyiInvoiceZhuti);
        return prefix + "/edit";
    }

    /**
     * 修改保存开票主体
     */
    @RequiresPermissions("system:zhuti:edit")
    @Log(title = "开票主体", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MiyiInvoiceZhuti miyiInvoiceZhuti)
    {
        return toAjax(miyiInvoiceZhutiService.updateMiyiInvoiceZhuti(miyiInvoiceZhuti));
    }

    /**
     * 删除开票主体
     */
    @RequiresPermissions("system:zhuti:remove")
    @Log(title = "开票主体", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(miyiInvoiceZhutiService.deleteMiyiInvoiceZhutiByIds(ids));
    }
}
