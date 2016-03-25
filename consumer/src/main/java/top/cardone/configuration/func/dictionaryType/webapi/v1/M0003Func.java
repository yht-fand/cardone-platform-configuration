package top.cardone.configuration.func.dictionaryType.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * DictionaryType - 复合
 */
@Component("/web-api/v1/configuration/dictionaryType/m0003.json")
public class M0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(DictionaryTypeService.class).findOne(map);
    }
}