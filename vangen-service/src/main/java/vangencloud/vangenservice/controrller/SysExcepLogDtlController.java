package vangencloud.vangenservice.controrller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vangencloud.vangenservice.pojo.SysExcepLogDtl;
import vangencloud.vangenservice.service.SysExcepLogDtlService;
import vangencloud.vangenservice.utils.R;


/**
 * 前端异常操作过程流水表
 *
 * @author SLF
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 09:23:47
 */
@RestController
@RequestMapping("sysexceplogdtl")
public class SysExcepLogDtlController {
    @Autowired
    private SysExcepLogDtlService sysExcepLogDtlService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestBody SysExcepLogDtl sysExcepLogDtl) {
        sysExcepLogDtlService.queryList(sysExcepLogDtl);
        return R.ok();
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id) {
        SysExcepLogDtl sysExcepLogDtl = sysExcepLogDtlService.queryObject(id);
        return R.ok().put("sysExcepLogDtl", sysExcepLogDtl);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SysExcepLogDtl sysExcepLogDtl) {
        sysExcepLogDtlService.save(sysExcepLogDtl);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SysExcepLogDtl sysExcepLogDtl) {
        sysExcepLogDtlService.update(sysExcepLogDtl);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids) {
        sysExcepLogDtlService.deleteBatch(ids);
        return R.ok();
    }

}
