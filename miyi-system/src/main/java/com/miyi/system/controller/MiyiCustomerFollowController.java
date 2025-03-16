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
import com.miyi.system.domain.MiyiCustomerFollow;
import com.miyi.system.service.IMiyiCustomerFollowService;
import com.miyi.common.core.controller.BaseController;
import com.miyi.common.core.domain.AjaxResult;
import com.miyi.common.utils.poi.ExcelUtil;
import com.miyi.common.core.page.TableDataInfo;

/**
 * 跟进记录Controller
 * 
 * @author ruoyi
 * @date 2025-03-16
 */
@Controller
@RequestMapping("/system/follow")
public class MiyiCustomerFollowController extends BaseController
{
    private String prefix = "system/follow";

    @Autowired
    private IMiyiCustomerFollowService miyiCustomerFollowService;

    @RequiresPermissions("system:follow:view")
    @GetMapping()
    public String follow()
    {
        return prefix + "/follow";
    }

    /**
     * 查询跟进记录列表
     */
    @RequiresPermissions("system:follow:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MiyiCustomerFollow miyiCustomerFollow)
    {
        startPage();
        List<MiyiCustomerFollow> list = miyiCustomerFollowService.selectMiyiCustomerFollowList(miyiCustomerFollow);
        return getDataTable(list);
    }

    /**
     * 导出跟进记录列表
     */
    @RequiresPermissions("system:follow:export")
    @Log(title = "跟进记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MiyiCustomerFollow miyiCustomerFollow)
    {
        List<MiyiCustomerFollow> list = miyiCustomerFollowService.selectMiyiCustomerFollowList(miyiCustomerFollow);
        ExcelUtil<MiyiCustomerFollow> util = new ExcelUtil<MiyiCustomerFollow>(MiyiCustomerFollow.class);
        return util.exportExcel(list, "跟进记录数据");
    }

    /**
     * 新增跟进记录
     */
    @RequiresPermissions("system:follow:add")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存跟进记录
     */
    @RequiresPermissions("system:follow:add")
    @Log(title = "跟进记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MiyiCustomerFollow miyiCustomerFollow)
    {
        return toAjax(miyiCustomerFollowService.insertMiyiCustomerFollow(miyiCustomerFollow));
    }

    /**
     * 修改跟进记录
     */
    @RequiresPermissions("system:follow:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        MiyiCustomerFollow miyiCustomerFollow = miyiCustomerFollowService.selectMiyiCustomerFollowById(id);
        mmap.put("miyiCustomerFollow", miyiCustomerFollow);
        return prefix + "/edit";
    }

    /**
     * 修改保存跟进记录
     */
    @RequiresPermissions("system:follow:edit")
    @Log(title = "跟进记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MiyiCustomerFollow miyiCustomerFollow)
    {
        return toAjax(miyiCustomerFollowService.updateMiyiCustomerFollow(miyiCustomerFollow));
    }

    /**
     * 删除跟进记录
     */
    @RequiresPermissions("system:follow:remove")
    @Log(title = "跟进记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(miyiCustomerFollowService.deleteMiyiCustomerFollowByIds(ids));
    }
}
