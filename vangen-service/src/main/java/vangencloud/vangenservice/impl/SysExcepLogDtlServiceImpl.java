package vangencloud.vangenservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vangencloud.vangenservice.mapper.SysExcepLogDtlMapper;
import vangencloud.vangenservice.pojo.SysExcepLogDtl;
import vangencloud.vangenservice.pojo.SysExcepLogDto.SysExcepLogSaveRequest;
import vangencloud.vangenservice.service.SysExcepLogDtlService;

import java.util.List;


@Service("sysExcepLogDtlService")
public class SysExcepLogDtlServiceImpl implements SysExcepLogDtlService {
    @Autowired
    private SysExcepLogDtlMapper sysExcepLogDtlMapper;

    @Override
    public SysExcepLogDtl queryObject(Integer id) {
        return sysExcepLogDtlMapper.queryObject(id);
    }

    @Override
    public List<SysExcepLogDtl> queryList(SysExcepLogDtl sysExcepLogDtl) {
        return sysExcepLogDtlMapper.queryList(sysExcepLogDtl);
    }

    @Override
    public int queryTotal() {
        return sysExcepLogDtlMapper.queryTotal();
    }

    @Override
    public void save(SysExcepLogDtl sysExcepLogDtl) {
        sysExcepLogDtlMapper.save(sysExcepLogDtl);
    }

    @Override
    public void saveDtl(SysExcepLogSaveRequest sysExcepLogSaveRequest) {
        for (SysExcepLogDtl sysExcepLogDtl : sysExcepLogSaveRequest.getSysExcepLogDtls()) {
            sysExcepLogDtl.setExcepLogId(sysExcepLogSaveRequest.getId());
            sysExcepLogDtlMapper.save(sysExcepLogDtl);
        }
    }

    @Override
    public void update(SysExcepLogDtl sysExcepLogDtl) {
        sysExcepLogDtlMapper.update(sysExcepLogDtl);
    }

    @Override
    public void delete(Integer id) {
        sysExcepLogDtlMapper.delete(id);
    }

    @Override
    public void deleteBatch(Integer[] ids) {
        sysExcepLogDtlMapper.deleteBatch(ids);
    }

}
