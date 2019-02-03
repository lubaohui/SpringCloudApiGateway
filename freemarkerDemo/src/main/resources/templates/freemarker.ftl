<!DOCTYPE html>
<html>
<script src="$msburl/common/js/jquery-1.7.2.min.js"></script>
<script src="$msburl/common/js/jquery.validate-1.9.0.min.js"></script>
<script src="$!ctx/product/js/commonUtil.js"></script>
<script src="$!ctx/product/js/insuranceProductSCB.js"></script>
<script type="text/javascript" src="$msburl/common/js/WdatePicker.js"></script>
<script src="$msburl/common/js/Y.js"></script>
<script src="$msburl/common/js/jQuery.blockUI.js"></script>
#parse('input.vm')
#parse('common.vm')
<link rel="stylesheet" href="$msburl/common/css/style.css" />

<script>
    //alert(document.documentElement.clientWidth);
</script>

<head>
	<meta charset="UTF-8">
	<title>welcome to freemarker</title>
</head>
<body>
<h4>亲爱的${toUserName}，你好！</h4>

<#list messages as m>
	<p> ${m}，请不要告诉其他人，切记！</p>
</#list>

<#list mapMsg>
map message list:
    <ul>
		<#items as msg>
		    <li>#{msg?index}: ${msg.title}, ${msg.content}</li>
		</#items>
	</ul>
</#list>

<#include "subtpl.ftl">

祝：开心！
</br>
${fromUserName}
</br>
${time?date}

<br/>
<#include "copyright.ftl">

<div data-role="navbar" class="specnav">
    <ul>
        #foreach($key1 in $productMapAQSC.keySet())
        #if($key1 == $key)
        <li>
            <a href="#page$key1" class="ui-btn-active ui-state-persist" id="currentLi$key1">$productMapAQSC.get($key1).getProductName()</a>
        </li>
        #else
        <li>
            <a href="#page$key1" id="currentLi$key1">$productMapAQSC.get($key1).getProductName()</a>
        </li>
        #end
        #end
    </ul>
</div>

</body>
</html>