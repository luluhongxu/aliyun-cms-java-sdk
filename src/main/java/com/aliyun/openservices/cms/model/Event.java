package com.aliyun.openservices.cms.model;

import com.aliyun.openservices.cms.common.Version;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by eli.lyj on 2017/8/18.
 */
public abstract class Event<T> implements Serializable{
    private static final long serialVersionUID = -8512637407845365729L;
    protected final String ver = Version.EVENT_VERSION_1_0;

    protected String trace;//提供简单的跟踪功能
    protected String name;//事件名
    protected String regionId;//事件发生的regionId
    protected String status = "INFO";//事件状态
    protected Date time;//事件发生事件
    /**
     * 事件详情
     */
    protected T content;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    public String getVer() {
        return ver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
