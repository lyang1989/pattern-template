package com.princeli.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * @author : princeli
 * @version 1.0
 * @className RowMapper
 * @date 2019-09-09 20:55
 * @description: TODO
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs,int rowNum) throws Exception;
}
