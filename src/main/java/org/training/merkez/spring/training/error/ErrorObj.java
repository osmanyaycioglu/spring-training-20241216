package org.training.merkez.spring.training.error;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@NoArgsConstructor
public class ErrorObj {
    private List<ErrorObj> errorObjs;
    private String errorDesc;
    private Integer errorCode;

    @Builder(setterPrefix = "with")
    public ErrorObj(final List<ErrorObj> errorObjsParam,
                    final String errorDescParam,
                    final Integer errorCodeParam) {
        errorObjs = errorObjsParam;
        errorDesc = errorDescParam;
        errorCode = errorCodeParam;
    }
}
