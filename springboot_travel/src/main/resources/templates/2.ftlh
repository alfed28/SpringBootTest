<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<#--字符串-->
    ${hello}<br>

<#--    boolean不能直接输出，需要转成字符串,两种方式-->
    ${flag?c}<br>
    ${flag?string("yes","no")}<br>

<#--日期,不能直接输出，需要先转成日期型或字符串型-->
<#--年月日-->
    ${date?date}<br>
<#--时分秒-->
    ${date?time}<br>
<#--年月日时分秒-->
    ${date?datetime}<br>
<#--指定格式-->
    ${date?string("yyyy年MM月dd日 HH:mm:ss")}<br>

<#--数据类型-->
<#--直接输出-->
    ${age}<br>
    ${age2}<br>
<#--    转换成字符串-->
    ${age?c}<br>
<#--货币-->
    ${age2?string.currency}<br>
<#--转换成百分比-->
    ${age2?string.percent}<br>
<#--保留指定小数位,保留两位-->
    ${age3?string["0.##"]}<br>

<#--如果值不存在，直接输出会报错-->
<#--    ${str}-->
<#-- 使用!，当值不存在时，默认显示空字符串 -->
    ${str!}<br>
<#-- 使用!"xx"，当值不存在时，默认显示指定字符串 -->
    ${str!"这是一个默认值"}<br>
<#-- 使用??，判断字符串是否为空；返回布尔类型。如果想要输出，需要将布尔类型转换成字符串 -->
<#--?? ：判断变量是否存在如果变量存在，返回 true，否则返回 false-->
    ${(str??)?string}<br>

</body>
</html>
