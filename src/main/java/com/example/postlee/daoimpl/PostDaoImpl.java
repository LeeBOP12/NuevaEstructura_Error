package com.example.postlee.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.postlee.dao.PostDao;
import com.example.postlee.enity.Post;

@Component
public class PostDaoImpl implements PostDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Post post) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Post post) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Post read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
