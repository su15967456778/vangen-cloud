package vangencloud.vangenservice.controrller;

import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vangencloud.vangenservice.pojo.SysExcepLog;
import vangencloud.vangenservice.pojo.SysExcepLogDto.SysExcepLogListRequest;
import vangencloud.vangenservice.service.SysExcepLogService;
import vangencloud.vangenservice.utils.R;


/**
 * 前端异常记录流水表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 09:23:47
 */
@Api(value = "/excepLog", tags = "异常记录", description = "异常记录api")
@RestController
@RequestMapping("/excepLog")
public class SysExcepLogController {
    @Autowired
    private SysExcepLogService sysExcepLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @ApiOperation(value = "查询异常记录列表", httpMethod = "POST", notes = "查询异常记录列表")
    public R list(@RequestParam SysExcepLogListRequest sysExcepLogListRequest) {
        sysExcepLogService.queryList(sysExcepLogListRequest.toSysExcepLog());
        return R.ok();
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @ApiOperation(value = "查询异常记录详情", httpMethod = "POST", notes = "查询异常记录详情")
    public R info(@PathVariable("id") Integer id) {
        SysExcepLog sysExcepLog = sysExcepLogService.queryObject(id);
        return R.ok().put("sysExcepLog", sysExcepLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @ApiOperation(value = "保存", httpMethod = "POST", notes = "保存")
    public R save(@RequestBody SysExcepLog sysExcepLog) {
        sysExcepLogService.save(sysExcepLog);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @ApiOperation(value = "更新", httpMethod = "POST", notes = "更新")
    public R update(@RequestBody SysExcepLog sysExcepLog) {
        sysExcepLogService.update(sysExcepLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @ApiOperation(value = "删除", httpMethod = "POST", notes = "删除")
    public R delete(@RequestBody Integer[] ids) {
        sysExcepLogService.deleteBatch(ids);
        return R.ok();
    }

}
