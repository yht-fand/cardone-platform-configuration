package webapi.v1.configuration.errorInfo.func;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 错误信息 - 创建
 */
@Component("/web-api/v1/configuration/errorInfo/c0004.json")
public class C0004Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }
}
