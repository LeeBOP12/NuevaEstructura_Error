package com.example.postlee.service;

import java.util.List;

import com.example.postlee.enity.Post;


public interface PostService {
	public int create(Post post);
    public int update(Post post);
    public int delete(int id);
    public Post read(int id);
    public List<Post> readAll();
}
