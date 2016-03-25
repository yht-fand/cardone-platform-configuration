package top.cardone.configuration.func.dictionary.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * Dictionary - 批量创建
 */
@Component("/web-api/v1/configuration/dictionary/c0002.json")
public class C0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(DictionaryService.class).save(map);
    }
}
