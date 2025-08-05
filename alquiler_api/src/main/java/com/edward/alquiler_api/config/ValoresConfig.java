package com.edward.alquiler_api.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ValoresConfig {

    @Value("${server.servlet.context-path}")
    private String contextPath;
}
