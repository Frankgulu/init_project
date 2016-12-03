<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<% String basePath = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <!-- 引入Jquery -->
    <script type="text/javascript" src="<%=basePath%>/static/js/jquery.min.js" charset="utf-8"></script>
    <!-- 引入Jquery_easyui -->
    <script type="text/javascript" src="<%=basePath%>/static/js/jquery.easyui.min.js" charset="utf-8"></script>
    <!-- 引入easyUi国际化--中文 -->
    <%--    <script type="text/javascript" src="<%=basePath%>/js/easyui/locale/easyui-lang-zh_CN.js" charset="utf-8"></script>--%>
    <!-- 引入easyUi默认的CSS格式--蓝色 -->
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/themes/default/easyui.css"/>
    <!-- 引入easyUi小图标 -->
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/themes/icon.css"/>
</head>
<body>

<div class="easyui-accordion" style="width:300px;height:800px;">
    <div title="About Accordion" iconCls="icon-ok" style="overflow:auto;padding:10px;">
        <h3 style="color:#0099FF;">Accordion for jQuery</h3>

        <p>Accordion is a part of easyui framework for jQuery. It lets you define your accordion component on web page
            more easily.</p>
    </div>
    <div title="About easyui" iconCls="icon-reload" selected="true" style="padding:10px;">
        easyui help you build your web page easily
    </div>
    <div title="Tree Menu">
        <ul id="tt1" class="easyui-tree">
            <li>
                <span>Folder1</span>
                <ul>
                    <li>
                        <span>Sub Folder 1</span>
                        <ul>
                            <li><span>File 11</span></li>
                            <li><span>File 12</span></li>
                            <li><span>File 13</span></li>
                        </ul>
                    </li>
                    <li><span>File 2</span></li>
                    <li><span>File 3</span></li>
                </ul>
            </li>
            <li><span>File2</span></li>
        </ul>
    </div>
</div>

</body>

</html>
<script>
    $(function () {

    })
</script>