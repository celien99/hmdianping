package com.hmdp.service;

import com.hmdp.dto.Result;
import com.hmdp.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;


public interface IBlogService extends IService<Blog> {
    Result queryBlogById(String id);

    Result queryHotBlog(Integer current);

    Result likeBlog(Long id);

    Result queryBlogLikes(String id);

}
