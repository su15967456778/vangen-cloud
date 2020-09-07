package vangencloud.vangenservice.pojo.SysExcepLogDtlDto;

import java.io.Serializable;
import java.util.Date;


/**
 * 前端异常操作过程流水表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 09:23:47
 */
public class SysExcepLogDtlListRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    //操作类型
    private String operType;
    //操作具体内容
    private String operData;
    //操作时间
    private Date operTime;

    /**
     * 获取：操作类型
     */
    public String getOperType() {
        return operType;
    }

    /**
     * 设置：操作类型
     */
    public void setOperType(String operType) {
        this.operType = operType;
    }

    /**
     * 获取：操作具体内容
     */
    public String getOperData() {
        return operData;
    }

    /**
     * 设置：操作具体内容
     */
    public void setOperData(String operData) {
        this.operData = operData;
    }

    /**
     * 获取：操作时间
     */
    public Date getOperTime() {
        return operTime;
    }

    /**
     * 设置：操作时间
     */
    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }
}
