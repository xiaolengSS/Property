package cn.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages="cn.bdqn")
@MapperScan(basePackages = {"cn.bdqn.mapper"})
@EnableTransactionManagement
public class PropertyApplication {
    //创建了一个sprig容器【将Beasn纳入到spring管理中】
    //启动Tomcat服务器
    public static void main(String[] args) {
        SpringApplication.run(PropertyApplication.class,args);
    }
}
