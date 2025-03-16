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
import com.miyi.system.domain.MiyiInvoice;
import com.miyi.system.service.IMiyiInvoiceService;
import com.miyi.common.core.controller.BaseController;
import com.miyi.common.core.domain.AjaxResult;
import com.miyi.common.utils.poi.ExcelUtil;
import com.miyi.common.core.page.TableDataInfo;

/**
 * 开票明细Controller
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Controller
@RequestMapping("/system/invoice")
public class MiyiInvoiceController extends BaseController
{
    private String prefix = "system/invoice";

    @Autowired
    private IMiyiInvoiceService miyiInvoiceService;

    @RequiresPermissions("system:invoice:view")
    @GetMapping()
    public String invoice()
    {
        return prefix + "/invoice";
    }

    /**
     * 查询开票明细列表
     */
    @RequiresPermissions("system:invoice:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MiyiInvoice miyiInvoice)
    {
        startPage();
        List<MiyiInvoice> list = miyiInvoiceService.selectMiyiInvoiceList(miyiInvoice);
        return getDataTable(list);
    }

    /**
     * 导出开票明细列表
     */
    @RequiresPermissions("system:invoice:export")
    @Log(title = "开票明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MiyiInvoice miyiInvoice)
    {
        List<MiyiInvoice> list = miyiInvoiceService.selectMiyiInvoiceList(miyiInvoice);
        ExcelUtil<MiyiInvoice> util = new ExcelUtil<MiyiInvoice>(MiyiInvoice.class);
        return util.exportExcel(list, "开票明细数据");
    }

    /**
     * 新增开票明细
     */
    @RequiresPermissions("system:invoice:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存开票明细
     */
    @RequiresPermissions("system:invoice:add")
    @Log(title = "开票明细", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MiyiInvoice miyiInvoice)
    {
        return toAjax(miyiInvoiceService.insertMiyiInvoice(miyiInvoice));
    }

    /**
     * 修改开票明细
     */
    @RequiresPermissions("system:invoice:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        MiyiInvoice miyiInvoice = miyiInvoiceService.selectMiyiInvoiceById(id);
        mmap.put("miyiInvoice", miyiInvoice);
        return prefix + "/edit";
    }

    /**
     * 修改保存开票明细
     */
    @RequiresPermissions("system:invoice:edit")
    @Log(title = "开票明细", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MiyiInvoice miyiInvoice)
    {
        return toAjax(miyiInvoiceService.updateMiyiInvoice(miyiInvoice));
    }

    /**
     * 删除开票明细
     */
    @RequiresPermissions("system:invoice:remove")
    @Log(title = "开票明细", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(miyiInvoiceService.deleteMiyiInvoiceByIds(ids));
    }
}
