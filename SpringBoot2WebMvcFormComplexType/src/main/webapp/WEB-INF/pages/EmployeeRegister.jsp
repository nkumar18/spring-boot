<html>
<body>
<h3>EMPLOYEE REGISTER FORM</h3>
<form action="save" method="POST">
<pre>
NAME : <input type="text" name="empName"/>
PWD  : <input type="password" name="empPwd"/>
GEN  :
    <input type="radio" name="empGen" value="Male"> Male
    <input type="radio" name="empGen" value="Female"> Female
PROJ : <select name="empProj">
			<option value="">-SELECT-</option>
			<option value="HTC">HTC</option>
			<option value="MNO">MNO</option>
			<option value="XYZ">XYZ</option>
		</select>
ADDR : <textarea name="empAddr"></textarea>
LANG : 
	<input type="checkbox" name="empLangs" value="ENG"> ENG
	<input type="checkbox" name="empLangs" value="HIN"> HIN
	<input type="checkbox" name="empLangs" value="TEL"> TEL
	<input type="checkbox" name="empLangs" value="TAM"> TAL
CLIENTS: <select name="empClient" multiple>
			<option value="NIT">NIT</option>
			<option value="ORCL">ORCL</option>
			<option value="DELL">DELL</option>
			<option value="HP">HP</option>
		 </select>
        	

    	<input type="submit" value="Add Employee"/>
</pre>
</form>
</body>
</html>
