package com.imooc.miaosha.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.imooc.miaosha.domain.MiaoshaUser;

@Mapper
public interface MiaoshaUserDao {

	@Select("select * from miaosha_user where id = #{id}")
	public MiaoshaUser getById(Long id);
	
	@Update("update miaosha_user set password = #{password} where id = #{id}")
	public void update(MiaoshaUser toBeUpdate);

	
}
