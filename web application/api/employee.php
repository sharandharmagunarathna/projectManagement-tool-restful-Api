<!DOCTYPE html>
<html lang ="en">
<head>
    <meta charset="utf-8">
	<title>employee</title>
	</head>
<body><br><br><center><h3>Add New Employee</h3>
<form action="test.php" method="post">
    <table>
	<tr><th align =left>Employee ID:</th><th><input type="text" name="e_Id"></th></tr>
	<tr><th align =left>First Name:</th><th><input type="text" name="first_name"></th><tr>
	<tr><th align =left>Last Name:</th><th><input type="text" name="last_name"></th><tr>
	<tr><th align =left>Designation:</th><th><input type="text" name="designation"></th><tr>
	<tr><th align =left>Email Address:</th><th><input type="text" name="email"></th><tr>
	<tr><th align =left>Teliphone number:</th><th><input type="text" name="tel_number"></th><tr>
	<!--<tr><th align =left><label for="name">description:</label></th><th>
	<input type="text" name="desc" id="desc"></th><tr>-->
	<tr><th></th>
	<tr><th><input type="radio" name="vehicle" value="manager">Manager</button></th>
	<th align =right><input type="radio" name="vehicle" value="developer">Developer</th></tr>
	
	<tr><th></th>
	<th><th></tr>
	<tr><th></th>
	<th><th></tr>
	<tr><th align =left><button type="button">Add Employee</button></th>
	<th align =right><button type="button">Update Employee</button></th></tr>
    <tr><th align =left><button type="button">Delete Employee</button></th>
	<th align = right><button type="button">View  Employee</button></th></tr>
	</table>
	</form></center><br><br><br>
	<center>
	<table border="0" style="width:1050px; height:30px; background-color:#7CE1D6;">

            <tr height="30">

            <td width="75" align="center"><b>Project ID.</b></td>

             <td width="300" align="center"><b>Project Name.</b></td>
			
			<td width="100" align="center"><b>Hours</b></td>

            <td width="300" align="center"><b>Overtime</b></td>

            <td width="100" align="center"><b>Manager ID</b></td>

            <td width="200" align="center"><b>Developer ID</b></td>
			
			<td width="200" align="center"><b>Contribution</b></td>

            </tr>

            </table>

            <table border="0">

        

            <tr style=" background-color:#fffff; ">

             <?php 
		    $characters = json_decode($response,true);
			
			//echo $characters['task_name'];
			//echo $yummy ->task_name;
			//foreach ($characters as $value) {
			//echo $value['task_name'];

			
		

	      ?>

		  <td width="75" align="center"><?php echo $characters['t_Id'];?></td>

             <td width="200" align="center"><?php echo $characters['task_name'];?></td>

            <td width="75" align="center"><?php echo $characters['numbe_of_hours']; ?></td>
			
			<td width="100" align="center"><?php echo $characters['overtime']; ?></td>

            <td width="300" align="center"><?php echo $characters['description'];?></td>

            <td width="100" align="center"><?php echo $characters['start_date'];?></td>

             <td width="200" align="center"><?php echo $characters['end_date'];?></td>
            

        <?php
			//}
			?>

            </table>
	
	
	</center>
	
	<br><br><br><br>
</body>
</html>