package com.di.tcp.config;

import reactor.blockhound.BlockHound;
import reactor.blockhound.integration.BlockHoundIntegration;

public class JHipsterBlockHoundIntegration implements BlockHoundIntegration {

    @Override
    public void applyTo(BlockHound.Builder builder) {
        builder.allowBlockingCallsInside("org.springframework.validation.beanvalidation.SpringValidatorAdapter", "validate");
        builder.allowBlockingCallsInside("com.di.tcp.service.MailService", "sendEmailFromTemplate");
        builder.allowBlockingCallsInside("com.di.tcp.security.DomainUserDetailsService", "createSpringSecurityUser");
        builder.allowBlockingCallsInside("org.springframework.web.reactive.result.method.InvocableHandlerMethod", "invoke");
        builder.allowBlockingCallsInside("org.springdoc.core.service.OpenAPIService", "build");
        builder.allowBlockingCallsInside("org.springdoc.core.service.AbstractRequestService", "build");
    }
}
