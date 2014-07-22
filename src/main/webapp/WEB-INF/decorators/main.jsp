<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ssm测试<decorator:title default="首页"></decorator:title></title>
<decorator:head></decorator:head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery1.11.mini.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/bootstrap-responsive.min.css" />
</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12"
				style="background-color: #dedef8; box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444;">
				xxx</div>
		</div>
		<div class="row-fluid">
			<div class="col-sm-2"
				style="background-color: #dedef8; box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444;">
				<h4>水平的定义列表</h4>
				<dl class="dl-horizontal">
					<dt>增加记录</dt>
					<dd>
						<a href="http://localhost:8080/ssm/aop/create.do"> [Add] </a>
					</dd>
					<dt>修改记录</dt>
					<dd>
						<a href="http://localhost:8080/ssm/aop/update.do"> [Update] </a>
					</dd>
					<dt>删除记录</dt>
					<dd>
						<a href="http://localhost:8080/ssm/aop/delete.do"> [Delete] </a>
					</dd>
					<dt>查询记录</dt>
					<dd>
						<a href="http://localhost:8080/ssm/aop/retrieve.do">
							[Retrieve] </a>
					</dd>
				</dl>
			</div>
			<div class="col-sm-10"
				style="background-color: #dedef8; box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444;">
				<decorator:body></decorator:body>
			</div>
		</div>
		<div class="row-fluid">
			<div class="span12"
				style="background-color: #dedef8; box-shadow: inset 1px -1px 1px #444, inset -1px 1px 1px #444; text-align: center;">
				lvhao127@gamil.com</div>
		</div>
	</div>

</body>
</html>