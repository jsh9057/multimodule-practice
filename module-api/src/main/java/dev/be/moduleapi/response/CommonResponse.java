package dev.be.moduleapi.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import dev.be.modulecommon.enums.CodeEnum;
import lombok.*;

@Getter
@Setter
@Builder
@JsonInclude(Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> {
    private String returnCode;
    private String returnMessage;
    private T info;

    public CommonResponse(CodeEnum codeEnum){
        setReturnCode(codeEnum.getCode());
        setReturnMessage(codeEnum.getMessage());
    }

    public CommonResponse(T info){
        setReturnCode(CodeEnum.SUCCESS.getCode());
        setReturnMessage(CodeEnum.SUCCESS.getMessage());
        setInfo(info);
    }

    public CommonResponse(CodeEnum codeEnum, T info){
        setReturnCode(codeEnum.getCode());
        setReturnMessage(codeEnum.getMessage());
        setInfo(info);
    }
}
