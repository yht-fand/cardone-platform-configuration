package top.cardone.configuration.func.systemInfo.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.configuration.service.SystemInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * SystemInfo - 复合
 */
@Component("/web-api/v1/configuration/systemInfo/m0002.json")
public class M0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(SystemInfoService.class).findOne(map);
    }
}