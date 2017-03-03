SELECT d.NAVIGATION_CODE ,d.NAME, d.PARENT_CODE FROM c1_NAVIGATION d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE  FIND_IN_SET(:term, d.`PARENT_TREE_CODE`) OR LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`NAVIGATION_CODE`)
</#if>
ORDER BY d.ORDER_, d.NAVIGATION_CODE