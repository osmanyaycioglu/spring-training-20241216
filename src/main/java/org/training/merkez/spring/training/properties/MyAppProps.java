package org.training.merkez.spring.training.properties;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.training.merkez.spring.training.models.Address;
import org.training.merkez.spring.training.models.Phone;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "my.app.props")
@Validated
public class MyAppProps {
    @NotBlank
    private String application;
    @NotNull
    private String description;
    private String testVersion;
    private String gitVersion;
    private String rule;
    @Max(65535)
    private Integer socketPort;
    private EirProps eirProps;
    private List<String> locations;
    private List<Address> addresses;
    private Map<String, Phone> phoneMap;

}
