package com.princeli.pattern.template.course;

import com.princeli.pattern.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * @author : princeli
 * @version 1.0
 * @className MemberDaoTest
 * @date 2019-09-09 21:28
 * @description: TODO
 */
public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result =  memberDao.selectAll();
        System.out.println(result);
    }
}
