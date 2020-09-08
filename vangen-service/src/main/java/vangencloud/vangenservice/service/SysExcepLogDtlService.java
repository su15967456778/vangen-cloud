package vangencloud.vangenservice.service;

import vangencloud.vangenservice.pojo.SysExcepLogDtl;
import vangencloud.vangenservice.pojo.SysExcepLogDto.SysExcepLogSaveRequest;

import java.util.List;
import java.util.Map;

/**
 * 前端异常操作过程流水表
 *
 * @author SLF
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 09:23:47
 */
public interface SysExcepLogDtlService {

    SysExcepLogDtl queryObject(Integer id);

    List<SysExcepLogDtl> queryList(SysExcepLogDtl sysExcepLogDtl);

    int queryTotal();

    void save(SysExcepLogDtl sysExcepLogDtl);

    void saveDtl(SysExcepLogSaveRequest sysExcepLogSaveRequest);

    void update(SysExcepLogDtl sysExcepLogDtl);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);
}
