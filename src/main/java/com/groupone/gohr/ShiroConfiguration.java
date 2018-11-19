package com.groupone.gohr;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.sql.DataSourceDefinition;

/**
 * className:ShiroConfiguration
 * discriptoin:
 * author:朱得鑫
 * createTime:2018-11-15 11:16
 */
@Configuration
public class ShiroConfiguration {

    /**
     * 自定义的Realm
     */
    @Bean(name = "myShiroRealm")
    public JdbcRealm myShiroRealm() {
        JdbcRealm jdbcRealm= new JdbcRealm();

        jdbcRealm.setPermissionsLookupEnabled(true);
        return jdbcRealm;
    }

    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myShiroRealm());
        return securityManager;
    }

    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultWebSecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        return shiroFilterFactoryBean;
    }
}
