package com.dhl.rest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dhl.rest.domain.User;


@Mapper
public interface UserMapper {

	@Select("select * from Employee")
	List<User> getAll();
	
	
}
