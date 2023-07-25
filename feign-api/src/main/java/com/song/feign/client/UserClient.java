package com.song.feign.client;

import com.song.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("userservice")
//@FeignClient(value = "userservice", configuration = DefaultFeignConfiguration.class) //局部生效
public interface UserClient {
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);


}
