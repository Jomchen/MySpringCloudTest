package com.jomchen.web.redis;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Create by Jomchen on 16:45 2017/10/16
 */
@Service("redisService")
public class RedisService {

    @Resource(name = "stringRedisTemplate")
    private ValueOperations<String, Object> vOps;

    private StringRedisTemplate stringRedisTemplate;

    public void putString(String key, Object value) {
        vOps.set(key, value);
    }

    public String getString(String key) {
        return (String)vOps.get(key);
    }


}
