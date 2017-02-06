<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Question</title>
</head>
<body>
	<table align="center">
		<s:form method="post" action="insertQuestion">
			<tr>
				<td>Subject:</td>
				<td>
					<select name="subject" id="subject">
						<option value="">Select Subject</option>
						<option value="java">Java</option>
						<option value="english">English</option>
						<option value="general">General</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><s:textfield label="Question" key="question" /></td>
				<td><s:textfield label="OptionA" key="optionA" /></td>
				<td><s:textfield label="OptionB" key="optionB" /></td>
				<td><s:textfield label="OptionC" key="optionC" /></td>
				<td><s:textfield label="OptionD" key="optionD" /></td>
				<td><s:radio list="{'A','B','C','D'}" label="Answer"
						name="answer"></s:radio></td>
				<td><s:submit /> <s:reset />
		</s:form>
	</table>
</body>
</html>