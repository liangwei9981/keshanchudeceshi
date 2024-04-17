package com.liangwei.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lw
 * @create 2024-04-15 19:22
 * @description
 */
public class Mi {
    public static void main(String[] args) {
        List<User> resultList = new ArrayList<>();
        List<String> consNoList = new ArrayList<>();
        consNoList.add("1");
        consNoList.add("2");
        User temp = new User();
        temp.setGroupCode("N");
        temp.setIsDeleted(0);
        temp.setCreateTime(LocalDate.now());

        for (String consNo : consNoList) {
            temp.setConsNo(consNo);
            resultList.add(temp);
        }

        System.out.println(1);
    }
}
