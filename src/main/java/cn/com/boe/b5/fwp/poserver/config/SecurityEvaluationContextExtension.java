package cn.com.boe.b5.fwp.poserver.config;

import org.springframework.data.spel.spi.EvaluationContextExtension;

public class SecurityEvaluationContextExtension implements EvaluationContextExtension {
    @Override
    public String getExtensionId() {
        return null;
    }
}
