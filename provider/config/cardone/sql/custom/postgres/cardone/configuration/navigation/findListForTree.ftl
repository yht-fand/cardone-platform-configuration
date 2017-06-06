SELECT t.NAVIGATION_CODE, t.NAME , t.PARENT_CODE, t.URL FROM c1_NAVIGATION t
WHERE t.data_state_code = '1'
<#if cardone.StringUtils.isNotBlank(id)>
AND  :id = ANY(string_to_array(t.PARENT_TREE_CODE, ','))
</#if>
<@cardone.permissionSql permissionColumnName="t.NAVIGATION_CODE" permissions=permissions />
ORDER BY t.ORDER_BY_, t.NAVIGATION_CODE