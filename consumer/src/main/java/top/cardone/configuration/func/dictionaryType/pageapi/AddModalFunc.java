package top.cardone.configuration.func.dictionaryType.pageapi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 字典类别 - 添加
 */
@Component("/configuration/dictionaryType/addModal.json")
public class AddModalFunc implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return null;
    }
}
