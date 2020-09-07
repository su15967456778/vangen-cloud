package vangencloud.vangenservice.service;

import vangencloud.vangenservice.pojo.SysExcepLogDtl;

import java.util.List;
import java.util.Map;

/**
 * 前端异常操作过程流水表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 09:23:47
 */
public interface SysExcepLogDtlService {

    SysExcepLogDtl queryObject(Integer id);

    List<SysExcepLogDtl> queryList(SysExcepLogDtl sysExcepLogDtl);

    int queryTotal();

    void save(SysExcepLogDtl sysExcepLogDtl);

    void update(SysExcepLogDtl sysExcepLogDtl);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);
}
