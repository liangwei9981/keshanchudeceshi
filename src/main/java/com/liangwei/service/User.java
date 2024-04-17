package com.liangwei.service;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author lw
 * @create 2024-04-14 18:07
 * @description
 */

@Component
public class User {

    private String groupCode;

    private int isDeleted;

    private LocalDate createTime;

    private String consNo;

    public String getGroupCode() {
        return groupCode;
    }

    public String getConsNo() {
        return consNo;
    }

    public void setConsNo(String consNo) {
        this.consNo = consNo;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }
}
