package vangencloud.vangenservice.mapper;


import org.apache.ibatis.annotations.Mapper;
import vangencloud.vangenservice.pojo.SysExcepLog;
import vangencloud.vangenservice.service.BaseMapper;

/**
 * 前端异常记录流水表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 09:23:47
 */
@Mapper
public interface SysExcepLogMapper extends BaseMapper<SysExcepLog> {

}
