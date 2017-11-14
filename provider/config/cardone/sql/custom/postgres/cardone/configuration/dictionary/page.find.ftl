SELECT
t.DICTIONARY_ID,
t.DICTIONARY_CODE,
t.NAME,
t.VALUE_,
d.PARENT_TREE_CODE as DICTIONARY_TYPE_PARENT_TREE_CODE,
d.PARENT_TREE_NAME as DICTIONARY_TYPE_PARENT_TREE_NAME,
t.DICTIONARY_TYPE_ID,
t.DICTIONARY_TYPE_CODE,
d.NAME AS DICTIONARY_TYPE_NAME,
t.CREATED_BY_CODE,
t.CREATED_DATE,
t.LAST_MODIFIED_BY_CODE,
t.LAST_MODIFIED_DATE,
t.BEGIN_DATE,
t.END_DATE,
t.FLAG_CODE,
t.STATE_CODE,
t.DATA_STATE_CODE
FROM
c1_dictionary t
LEFT JOIN c1_dictionary_type d ON (d.DICTIONARY_TYPE_ID = t.DICTIONARY_TYPE_ID)
<#if cardone.StringUtils.isNotBlank(dictionaryId)>
WHERE t.dictionary_id = :dictionaryId
<#else>
<#include "page.where.ftl">
ORDER BY t.DICTIONARY_TYPE_CODE,
t.ORDER_BY_,
t.DICTIONARY_CODE,
t.CREATED_DATE
limit <#if pageSize??>:pageSize<#else>10</#if> OFFSET <#if offset??>:offset<#else>0</#if>
</#if>