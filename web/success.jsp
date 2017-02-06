<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success</title>
</head>
<body>
	<h1>Success Page!</h1>
	<s:property value="tutorialSiteName" />
	<s:property value="returnString" />
	<table align="center">
		<tr>
			<td>Subject:</td>
			<td><s:property value="subject"/></td>
		</tr>
		<tr>
			<td>Question:</td>
			<td><s:property value="question"/></td>
		</tr>
		<tr>
			<td>OptionA:</td>
			<td><s:property value="optionA"/></td>
		</tr>
		<tr>
			<td>OptionB:</td>
			<td><s:property value="optionB"/></td>
		</tr>
		<tr>
			<td>OptionC:</td>
			<td><s:property value="optionC"/></td>
		</tr>
		<tr>
			<td>OptionD:</td>
			<td><s:property value="optionD"/></td>
		</tr>
		<tr>
			<td>Answer:</td>
			<td><s:property value="answer"/></td>
		</tr>
	</table>
</body>
</html>