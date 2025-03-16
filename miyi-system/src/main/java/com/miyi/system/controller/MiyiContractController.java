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
import com.miyi.system.domain.MiyiContract;
import com.miyi.system.service.IMiyiContractService;
import com.miyi.common.core.controller.BaseController;
import com.miyi.common.core.domain.AjaxResult;
import com.miyi.common.utils.poi.ExcelUtil;
import com.miyi.common.core.page.TableDataInfo;

/**
 * 合同Controller
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Controller
@RequestMapping("/system/contract")
public class MiyiContractController extends BaseController
{
    private String prefix = "system/contract";

    @Autowired
    private IMiyiContractService miyiContractService;

    @RequiresPermissions("system:contract:view")
    @GetMapping()
    public String contract()
    {
        return prefix + "/contract";
    }

    /**
     * 查询合同列表
     */
    @RequiresPermissions("system:contract:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MiyiContract miyiContract)
    {
        startPage();
        List<MiyiContract> list = miyiContractService.selectMiyiContractList(miyiContract);
        return getDataTable(list);
    }

    /**
     * 导出合同列表
     */
    @RequiresPermissions("system:contract:export")
    @Log(title = "合同", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MiyiContract miyiContract)
    {
        List<MiyiContract> list = miyiContractService.selectMiyiContractList(miyiContract);
        ExcelUtil<MiyiContract> util = new ExcelUtil<MiyiContract>(MiyiContract.class);
        return util.exportExcel(list, "合同数据");
    }

    /**
     * 新增合同
     */
    @RequiresPermissions("system:contract:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存合同
     */
    @RequiresPermissions("system:contract:add")
    @Log(title = "合同", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MiyiContract miyiContract)
    {
        return toAjax(miyiContractService.insertMiyiContract(miyiContract));
    }

    /**
     * 修改合同
     */
    @RequiresPermissions("system:contract:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        MiyiContract miyiContract = miyiContractService.selectMiyiContractById(id);
        mmap.put("miyiContract", miyiContract);
        return prefix + "/edit";
    }

    /**
     * 修改保存合同
     */
    @RequiresPermissions("system:contract:edit")
    @Log(title = "合同", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MiyiContract miyiContract)
    {
        return toAjax(miyiContractService.updateMiyiContract(miyiContract));
    }

    /**
     * 删除合同
     */
    @RequiresPermissions("system:contract:remove")
    @Log(title = "合同", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(miyiContractService.deleteMiyiContractByIds(ids));
    }
}
