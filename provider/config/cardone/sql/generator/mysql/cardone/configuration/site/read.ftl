SELECT
<#switch (object_id!)>
<#case "beginDate">
BEGIN_DATE AS beginDate
<#break>
<#case "content">
CONTENT AS content
<#break>
<#case "createdByCode">
CREATED_BY_CODE AS createdByCode
<#break>
<#case "createdDate">
CREATED_DATE AS createdDate
<#break>
<#case "dataStateCode">
DATA_STATE_CODE AS dataStateCode
<#break>
<#case "departmentCode">
DEPARTMENT_CODE AS departmentCode
<#break>
<#case "endDate">
END_DATE AS endDate
<#break>
<#case "explain">
EXPLAIN_ AS explain
<#break>
<#case "flagCode">
FLAG_CODE AS flagCode
<#break>
<#case "flagObjectCode">
FLAG_OBJECT_CODE AS flagObjectCode
<#break>
<#case "jsonData">
JSON_DATA AS jsonData
<#break>
<#case "lastModifiedByCode">
LAST_MODIFIED_BY_CODE AS lastModifiedByCode
<#break>
<#case "lastModifiedDate">
LAST_MODIFIED_DATE AS lastModifiedDate
<#break>
<#case "name">
NAME AS name
<#break>
<#case "orderBy">
ORDER_ AS order
<#break>
<#case "orgCode">
ORG_CODE AS orgCode
<#break>
<#case "siteCode">
SITE_CODE AS siteCode
<#break>
<#case "siteId">
SITE_ID AS siteId
<#break>
<#case "stateCode">
STATE_CODE AS stateCode
<#break>
<#case "systemInfoCode">
SYSTEM_INFO_CODE AS systemInfoCode
<#break>
<#case "version">
VERSION_ AS version
<#break>
<#default>
COUNT(1) AS COUNT_
</#switch>
FROM c1_site
<#include "where.ftl">