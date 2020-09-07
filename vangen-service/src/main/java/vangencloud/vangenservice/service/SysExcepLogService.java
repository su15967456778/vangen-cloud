package vangencloud.vangenservice.service;

import vangencloud.vangenservice.pojo.SysExcepLog;

import java.util.List;
import java.util.Map;

/**
 * 前端异常记录流水表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 09:23:47
 */
public interface SysExcepLogService {

    SysExcepLog queryObject(Integer id);

    List<SysExcepLog> queryList(SysExcepLog sysExcepLog);

    int queryTotal();

    void save(SysExcepLog sysExcepLog);

    void update(SysExcepLog sysExcepLog);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);
}
