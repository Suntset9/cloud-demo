package cn.itcast.order.service;


import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import com.song.feign.client.UserClient;
import com.song.feign.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    //@Autowired
    //private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

    //Feign客户端发起请求
    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        // 2. 利用Feign发起http请求，查询用户
        User user = userClient.findById(order.getUserId());
        //3.存入order
        order.setUser(user);
        // 4.返回
        return order;
    }

    //restTemplate发起请求

    //public Order queryOrderById(Long orderId) {
    //    // 1.查询订单
    //    Order order = orderMapper.findById(orderId);
    //    //2.远程查询user
    //    String url ="http://userservice/user/"+order.getUserId();
    //    //2.1 发起调用
    //    User user = restTemplate.getForObject(url, User.class);
    //    //3.存入order
    //    order.setUser(user);
    //    // 4.返回
    //    return order;
    //}
}
