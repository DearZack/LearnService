package io.github.dearzack.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by Zack on 2017/4/23.
 */
@Component
@ConfigurationProperties(prefix = "person")
public class PersonConfig {
    private String name;

    private int high;

    @Override
    public String toString() {
        return "PersonConfig{" +
                "name='" + name + '\'' +
                ", high=" + high +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
