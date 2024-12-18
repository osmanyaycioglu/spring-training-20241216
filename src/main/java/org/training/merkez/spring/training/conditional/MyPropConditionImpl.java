package org.training.merkez.spring.training.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Profile;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.List;

public class MyPropConditionImpl implements Condition {

    @Override
    public boolean matches(final ConditionContext context,
                           final AnnotatedTypeMetadata metadata) {
        MultiValueMap<String, Object> attrs = metadata.getAllAnnotationAttributes(MyPropCondition.class.getName());
        if (attrs != null) {
            List<Object> keyLoc = attrs.get("key");
            String key = (String) keyLoc.get(0);
            List<Object> valueLoc = attrs.get("value");
            String value = (String) valueLoc.get(0);
            String       propertyLoc = context.getEnvironment()
                                              .getProperty(key);
            if (propertyLoc != null && propertyLoc.equals(value)){
                return true;
            }
            return false;
        }
        return true;
    }
}
