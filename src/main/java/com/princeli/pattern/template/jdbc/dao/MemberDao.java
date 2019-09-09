package com.princeli.pattern.template.jdbc.dao;

import com.princeli.pattern.template.jdbc.JdbcTemplate;
import com.princeli.pattern.template.jdbc.Member;
import com.princeli.pattern.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author : princeli
 * @version 1.0
 * @className MemberDao
 * @date 2019-09-09 21:18
 * @description: TODO
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql ="select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        },null);
    }
}
