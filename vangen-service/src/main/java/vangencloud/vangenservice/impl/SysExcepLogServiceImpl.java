package vangencloud.vangenservice.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vangencloud.vangenservice.mapper.SysExcepLogMapper;
import vangencloud.vangenservice.pojo.SysExcepLog;
import vangencloud.vangenservice.pojo.SysExcepLogDto.SysExcepLogDtlResult;
import vangencloud.vangenservice.pojo.SysExcepLogDto.SysExcepLogListPara;
import vangencloud.vangenservice.service.SysExcepLogService;

import java.util.List;
import java.util.Map;


@Service("sysExcepLogService")
public class SysExcepLogServiceImpl implements SysExcepLogService {
    @Autowired
    private SysExcepLogMapper sysExcepLogMapper;

    @Override
    public SysExcepLogDtlResult queryObjectById(Integer id) {
        return sysExcepLogMapper.queryObjectById(id);
    }


    @Override
    public List<SysExcepLog> queryList(SysExcepLog sysExcepLog) {
        return sysExcepLogMapper.queryList(sysExcepLog);
    }

    @Override
    public PageInfo<SysExcepLog> queryList(SysExcepLogListPara para) {
        PageHelper.startPage(para.getPage().getPageNum(), para.getPage().getPageSize(), para.getPage().getOrderBy());
        List<SysExcepLog> list = sysExcepLogMapper.queryByListRequest(para);
        return new PageInfo<>(list);
    }

    @Override
    public int queryTotal() {
        return sysExcepLogMapper.queryTotal();
    }

    @Override
    public int save(SysExcepLog sysExcepLog) {
        sysExcepLogMapper.save(sysExcepLog);
        return sysExcepLog.getId();
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
