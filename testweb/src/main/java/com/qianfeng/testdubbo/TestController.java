package com.qianfeng.testdubbo;

//
//                            _ooOoo_  
//                           o8888888o  
//                           88" . "88  
//                           (| -_- |)  
//                            O\ = /O  
//                        ____/`---'\____  
//                      .   ' \\| |// `.  
//                       / \\||| : |||// \  
//                     / _||||| -:- |||||- \  
//                       | | \\\ - /// | |  
//                     | \_| ''\---/'' | |  
//                      \ .-\__ `-` ___/-. /  
//                   ___`. .' /--.--\ `. . __  
//                ."" '< `.___\_<|>_/___.' >'"".  
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |  
//                 \ \ `-. \_ __\ /__ _/ .-` / /  
//         ======`-.____`-.___\_____/___.-`____.-'======  
//                            `=---='  
//  
//         .............................................  
//                  佛祖镇楼                  BUG辟易  
//          佛曰:  
//                  写字楼里写字间，写字间里程序员；  
//                  程序人员写程序，又拿程序换酒钱。  
//                  酒醒只在网上坐，酒醉还来网下眠；  
//                  酒醉酒醒日复日，网上网下年复年。  
//                  但愿老死电脑间，不愿鞠躬老板前；  
//                  奔驰宝马贵者趣，公交自行程序员。  
//                  别人笑我忒疯癫，我笑自己命太贱；  
//  


import com.qianfeng.testduboo.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by jackiechan on 2018/3/21/下午8:16
 */
@RestController
public class TestController {
//这里应该声明一个 service,但是刚才说过,service 最终会变成一个 web 项目,也就是我们无法直接依赖了,但是此处仍然需要声明对象,怎么办?
//解决方式, 我们将 service 的接口声明和实现进行拆分,如何拆分, 将 service 创建为一个项目,jar 包格式的项目?
// 为什么这么创建,因为除了 controller 中会用到 service 外,我们的 serviceimpl 实现中也用到了这个接口

    @Resource
    private TestService service;
    @RequestMapping("/getData")
    @ResponseBody
    public String getData(String name) {
        String data = service.getData(name);
        return data;
    }
}
