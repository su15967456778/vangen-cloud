package vangencloud.vangenservice.service;

import com.github.pagehelper.PageInfo;
import vangencloud.vangenservice.pojo.SysExcepLog;
import vangencloud.vangenservice.pojo.SysExcepLogDto.SysExcepLogDtlResult;
import vangencloud.vangenservice.pojo.SysExcepLogDto.SysExcepLogListPara;

import java.util.List;
import java.util.Map;

/**
 * 前端异常记录流水表
 *
 * @author SLF
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 09:23:47
 */
public interface SysExcepLogService {

    SysExcepLogDtlResult queryObjectById(Integer id);

    List<SysExcepLog> queryList(SysExcepLog sysExcepLog);

    PageInfo<SysExcepLog> queryList(SysExcepLogListPara para);

    int queryTotal();

    int save(SysExcepLog sysExcepLog);

    void update(SysExcepLog sysExcepLog);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);
}
