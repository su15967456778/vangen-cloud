package vangencloud.vangenservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vangencloud.vangenservice.mapper.SysExcepLogMapper;
import vangencloud.vangenservice.pojo.SysExcepLog;
import vangencloud.vangenservice.service.SysExcepLogService;

import java.util.List;
import java.util.Map;


@Service("sysExcepLogService")
public class SysExcepLogServiceImpl implements SysExcepLogService {
    @Autowired
    private SysExcepLogMapper sysExcepLogMapper;

    @Override
    public SysExcepLog queryObject(Integer id) {
        return sysExcepLogMapper.queryObject(id);
    }

    @Override
    public List<SysExcepLog> queryList(SysExcepLog sysExcepLog) {
        return sysExcepLogMapper.queryList(sysExcepLog);
    }

    @Override
    public int queryTotal() {
        return sysExcepLogMapper.queryTotal();
    }

    @Override
    public void save(SysExcepLog sysExcepLog) {
        sysExcepLogMapper.save(sysExcepLog);
    }

    @Override
    public void update(SysExcepLog sysExcepLog) {
        sysExcepLogMapper.update(sysExcepLog);
    }

    @Override
    public void delete(Integer id) {
        sysExcepLogMapper.delete(id);
    }

    @Override
    public void deleteBatch(Integer[] ids) {
        sysExcepLogMapper.deleteBatch(ids);
    }

}
