package com.example.postlee.serviceimpl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postlee.dao.PostDao;
import com.example.postlee.enity.Post;
import com.example.postlee.service.PostService;



@Service
public class PostServiceImpl implements PostService{
    @Autowired
    private PostDao dao;
    
    @Override
    public int create(Post post) {
        return dao.create(post);
    }

    @Override
    public int update(Post post) {
        return dao.update(post);
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public Post read(int id) {
        return dao.read(id);
    }

    @Override
    public List<Post> readAll() {
        return dao.readAll();
    }
    
}
