package top.cardone.configuration.dao;

import org.springframework.data.domain.Page;
import top.cardone.data.dao.PageDao;

import java.util.List;
import java.util.Map;

/**
 * 字典
 *
 * @author yao hai tao
 */
public interface DictionaryDao extends PageDao {
	/**
	 * 分页
	 *
	 * @param page 对象
	 * @return 分页对象
	 */
	Page<Map<String, Object>> pageByCode(Map<String, Object> page);

	List<Map<String, Object>> findlistByTypeCode(String dictionaryTypeCode);

	/**
	 * 查询对象
	 *
	 * @param findOne 字典标识
	 * @return 字典对象
	 */
	Map<String, Object> findOneByDictionaryId(Map<String, Object> findOne);

	/**
	 * 查询字典下拉列表
	 *
	 * @param findList 关键字
	 * @return 字典下拉列表
	 */
	List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);
}