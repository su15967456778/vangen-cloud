package vangencloud.vangenservice.pojo;

import java.io.Serializable;
import java.util.Date;


/**
 * 前端异常记录流水表
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-09-07 09:23:47
 */
public class SysExcepLog implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键id
    private Integer id;
    //前端异常文件
    private String excepFilePath;
    //异常代码块
    private String excepContent;
    //异常行编号
    private Integer excepLine;
    //异常列编号
    private Integer excepColumn;
    //异常发生时间
    private Date excepTime;
    //异常报错信息
    private String excepMsg;
    //异常堆栈信息
    private String excepStack;
    //错误当前路由
    private String excepUrl;
    //异常useragent
    private String excepUserAgent;
    //状态码
    private String excepStatusCode;
    //请求内容
    private String excepReq;
    //响应内容
    private String excepRes;
    //异常用户 id 或者name 待定 后端处理
    private String username;
    //数据创建时间
    private Date createTime;
    //数据更新时间
    private Date updateTime;

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
     * 获取：前端异常文件
     */
    public String getExcepFilePath() {
        return excepFilePath;
    }

    /**
     * 设置：前端异常文件
     */
    public void setExcepFilePath(String excepFilePath) {
        this.excepFilePath = excepFilePath;
    }

    /**
     * 获取：异常代码块
     */
    public String getExcepContent() {
        return excepContent;
    }

    /**
     * 设置：异常代码块
     */
    public void setExcepContent(String excepContent) {
        this.excepContent = excepContent;
    }

    /**
     * 获取：异常行编号
     */
    public Integer getExcepLine() {
        return excepLine;
    }

    /**
     * 设置：异常行编号
     */
    public void setExcepLine(Integer excepLine) {
        this.excepLine = excepLine;
    }

    /**
     * 获取：异常列编号
     */
    public Integer getExcepColumn() {
        return excepColumn;
    }

    /**
     * 设置：异常列编号
     */
    public void setExcepColumn(Integer excepColumn) {
        this.excepColumn = excepColumn;
    }

    /**
     * 获取：异常发生时间
     */
    public Date getExcepTime() {
        return excepTime;
    }

    /**
     * 设置：异常发生时间
     */
    public void setExcepTime(Date excepTime) {
        this.excepTime = excepTime;
    }

    /**
     * 获取：异常报错信息
     */
    public String getExcepMsg() {
        return excepMsg;
    }

    /**
     * 设置：异常报错信息
     */
    public void setExcepMsg(String excepMsg) {
        this.excepMsg = excepMsg;
    }

    /**
     * 获取：异常堆栈信息
     */
    public String getExcepStack() {
        return excepStack;
    }

    /**
     * 设置：异常堆栈信息
     */
    public void setExcepStack(String excepStack) {
        this.excepStack = excepStack;
    }

    /**
     * 获取：错误当前路由
     */
    public String getExcepUrl() {
        return excepUrl;
    }

    /**
     * 设置：错误当前路由
     */
    public void setExcepUrl(String excepUrl) {
        this.excepUrl = excepUrl;
    }

    /**
     * 获取：异常useragent
     */
    public String getExcepUserAgent() {
        return excepUserAgent;
    }

    /**
     * 设置：异常useragent
     */
    public void setExcepUserAgent(String excepUserAgent) {
        this.excepUserAgent = excepUserAgent;
    }

    /**
     * 获取：状态码
     */
    public String getExcepStatusCode() {
        return excepStatusCode;
    }

    /**
     * 设置：状态码
     */
    public void setExcepStatusCode(String excepStatusCode) {
        this.excepStatusCode = excepStatusCode;
    }

    /**
     * 获取：请求内容
     */
    public String getExcepReq() {
        return excepReq;
    }

    /**
     * 设置：请求内容
     */
    public void setExcepReq(String excepReq) {
        this.excepReq = excepReq;
    }

    /**
     * 获取：响应内容
     */
    public String getExcepRes() {
        return excepRes;
    }

    /**
     * 设置：响应内容
     */
    public void setExcepRes(String excepRes) {
        this.excepRes = excepRes;
    }

    /**
     * 获取：异常用户 id 或者name 待定 后端处理
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置：异常用户 id 或者name 待定 后端处理
     */
    public void setUsername(String username) {
        this.username = username;
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
}
