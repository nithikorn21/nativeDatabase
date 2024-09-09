package com.db.nativeDatabase.Config;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.jta.JtaTransactionManager;

@Configuration 
public class EclipseLinkJpaConfiguration extends JpaBaseConfiguration { 

    protected EclipseLinkJpaConfiguration(DataSource dataSource, JpaProperties properties,
            ObjectProvider<JtaTransactionManager> jtaTransactionManager) {
        super(dataSource, properties, jtaTransactionManager);
        //TODO Auto-generated constructor stub
    }

    @Override 
    protected AbstractJpaVendorAdapter createJpaVendorAdapter() { 
        return new EclipseLinkJpaVendorAdapter(); 
    }

    @Override
    protected Map<String, Object> getVendorProperties() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVendorProperties'");
    }
    
    //...
}
