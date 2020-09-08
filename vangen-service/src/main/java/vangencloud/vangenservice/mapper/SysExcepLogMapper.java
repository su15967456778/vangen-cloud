package vangencloud.vangenservice.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import vangencloud.vangenservice.pojo.SysExcepLog;
import vangencloud.vangenservice.pojo.SysExcepLogDto.SysExcepLogDtlResult;
import vangencloud.vangenservice.pojo.SysExcepLogDto.SysExcepLogListPara;
import vangencloud.vangenservice.service.BaseMapper;

import java.util.List;

/**
 * 前端异常记录流水表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 09:23:47
 */
@Mapper
public interface SysExcepLogMapper extends BaseMapper<SysExcepLog> {

    List<SysExcepLog> queryByListRequest(SysExcepLogListPara para);

    SysExcepLogDtlResult queryObjectById(@Param("id") Integer id);

}
