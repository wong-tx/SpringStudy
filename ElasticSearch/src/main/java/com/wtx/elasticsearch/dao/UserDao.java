package com.wtx.elasticsearch.dao;

import com.wtx.elasticsearch.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author wongtx
 * @version 1.0
 * @date 2020/7/28 20:29
 */
public interface UserDao extends ElasticsearchRepository<User, Long> {
}
