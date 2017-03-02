<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT
t.`DICTIONARY_TYPE_ID`,
t.`DICTIONARY_TYPE_CODE`,
t.`NAME`,
t.`PARENT_CODE`,
p.`NAME` AS PARENT_NAME,
t.`PARENT_TREE_NAME`,
t.`PARENT_TREE_CODE`,
t.CREATED_BY_CODE,
(SELECT s.`NAME` FROM c1_user s WHERE s.user_code = t.CREATED_BY_CODE LIMIT 1) AS CREATED_BY_NAME,
DATE_FORMAT(t.`CREATED_DATE`, '%Y-%m-%d') AS CREATED_DATE,
t.LAST_MODIFIED_BY_CODE,
(SELECT s.`NAME` FROM c1_user s WHERE s.user_code = t.LAST_MODIFIED_BY_CODE LIMIT 1) AS LAST_MODIFIED_BY_NAME,
DATE_FORMAT(t.`LAST_MODIFIED_DATE`, '%Y-%m-%d') AS LAST_MODIFIED_DATE,
DATE_FORMAT(t.BEGIN_DATE, '%Y-%m-%d') AS BEGIN_DATE,
DATE_FORMAT(t.END_DATE, '%Y-%m-%d') AS END_DATE,
IFNULL((SELECT s.`NAME` FROM `c1_dictionary` s WHERE s.DICTIONARY_TYPE_CODE = 'dictionaryTypeFlag' AND s.DICTIONARY_CODE = t.FLAG_CODE LIMIT 1), (SELECT s.`NAME` FROM `c1_dictionary` s WHERE s.DICTIONARY_TYPE_CODE = 'flag' AND s.DICTIONARY_CODE = t.FLAG_CODE LIMIT 1)) AS FLAG_NAME,
t.FLAG_CODE,
IFNULL((SELECT s.`NAME`  FROM `c1_dictionary` s WHERE s.DICTIONARY_TYPE_CODE = 'dictionaryTypeState' AND s.DICTIONARY_CODE = t.STATE_CODE LIMIT 1), (SELECT s.`NAME` FROM `c1_dictionary` s WHERE s.DICTIONARY_TYPE_CODE = 'state' AND s.DICTIONARY_CODE = t.STATE_CODE LIMIT 1)) AS STATE_NAME,
t.STATE_CODE,
IFNULL((SELECT s.`NAME` FROM `c1_dictionary` s WHERE s.DICTIONARY_TYPE_CODE = 'dictionaryTypeDataState' AND s.DICTIONARY_CODE = t.DATA_STATE_CODE LIMIT 1), (SELECT s.`NAME` FROM `c1_dictionary` s WHERE s.DICTIONARY_TYPE_CODE = 'dataState' AND s.DICTIONARY_CODE = t.DATA_STATE_CODE LIMIT 1)) AS DATA_STATE_NAME,
t.DATA_STATE_CODE
FROM
`c1_dictionary_type` t
left join `c1_dictionary_type` p on (p.`DICTIONARY_TYPE_CODE` = t.`PARENT_CODE`)
<#if StringUtils.isNotBlank(dictionaryTypeId)>
WHERE t.dictionary_type_id = :dictionaryTypeId
<#else>
    <#include "page.where.ftl">
ORDER BY t.`PARENT_CODE`,
t.`DICTIONARY_TYPE_CODE`,
t.`CREATED_DATE`
limit <#if offset??>:offset<#else>0</#if> , <#if pageSize??>:pageSize<#else>10</#if>
</#if>