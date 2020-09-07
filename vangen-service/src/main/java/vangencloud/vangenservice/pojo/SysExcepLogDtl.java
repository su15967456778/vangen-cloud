package vangencloud.vangenservice.pojo;

import java.io.Serializable;
import java.util.Date;


/**
 * 前端异常操作过程流水表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 09:23:47
 */
public class SysExcepLogDtl implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键id
    private Integer id;
    //操作类型
    private String operType;
    //操作具体内容
    private String operData;
    //操作时间
    private Date operTime;
    //数据创建时间
    private Date createTime;
    //数据更新时间
    private Date updateTime;
    //前端异常流水表id
    private Integer excepLogId;

    /**
     * 获取：主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置：主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

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

    /**
     * 获取：数据创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置：数据创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：数据更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置：数据更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取：前端异常流水表id
     */
    public Integer getExcepLogId() {
        return excepLogId;
    }

    /**
     * 设置：前端异常流水表id
     */
    public void setExcepLogId(Integer excepLogId) {
        this.excepLogId = excepLogId;
    }
}
