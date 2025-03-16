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
import com.miyi.system.domain.MiyiOrder;
import com.miyi.system.service.IMiyiOrderService;
import com.miyi.common.core.controller.BaseController;
import com.miyi.common.core.domain.AjaxResult;
import com.miyi.common.utils.poi.ExcelUtil;
import com.miyi.common.core.page.TableDataInfo;

/**
 * 订单Controller
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Controller
@RequestMapping("/system/order")
public class MiyiOrderController extends BaseController
{
    private String prefix = "system/order";

    @Autowired
    private IMiyiOrderService miyiOrderService;

    @RequiresPermissions("system:order:view")
    @GetMapping()
    public String order()
    {
        return prefix + "/order";
    }

    /**
     * 查询订单列表
     */
    @RequiresPermissions("system:order:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MiyiOrder miyiOrder)
    {
        startPage();
        List<MiyiOrder> list = miyiOrderService.selectMiyiOrderList(miyiOrder);
        return getDataTable(list);
    }

    /**
     * 导出订单列表
     */
    @RequiresPermissions("system:order:export")
    @Log(title = "订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MiyiOrder miyiOrder)
    {
        List<MiyiOrder> list = miyiOrderService.selectMiyiOrderList(miyiOrder);
        ExcelUtil<MiyiOrder> util = new ExcelUtil<MiyiOrder>(MiyiOrder.class);
        return util.exportExcel(list, "订单数据");
    }

    /**
     * 新增订单
     */
    @RequiresPermissions("system:order:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存订单
     */
    @RequiresPermissions("system:order:add")
    @Log(title = "订单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MiyiOrder miyiOrder)
    {
        return toAjax(miyiOrderService.insertMiyiOrder(miyiOrder));
    }

    /**
     * 修改订单
     */
    @RequiresPermissions("system:order:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        MiyiOrder miyiOrder = miyiOrderService.selectMiyiOrderById(id);
        mmap.put("miyiOrder", miyiOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存订单
     */
    @RequiresPermissions("system:order:edit")
    @Log(title = "订单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MiyiOrder miyiOrder)
    {
        return toAjax(miyiOrderService.updateMiyiOrder(miyiOrder));
    }

    /**
     * 删除订单
     */
    @RequiresPermissions("system:order:remove")
    @Log(title = "订单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(miyiOrderService.deleteMiyiOrderByIds(ids));
    }
}
