package top.cardone.configuration.service.impl;

import top.cardone.configuration.dao.I18nInfoDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.SimpleDefaultService;

/**
 * 国际化信息服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class I18nInfoServiceImpl extends SimpleDefaultService<I18nInfoDao> implements top.cardone.configuration.service.I18nInfoService {
}