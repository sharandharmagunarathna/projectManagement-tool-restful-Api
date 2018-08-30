<?php
$response=NULL;
$sell=NULL;
if(isset($_POST['msrch'])){
$sell="A";
include ('managerwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/projects/manager/$M_Id");
include ('get.php');
}
if(isset($_POST['dsrch'])){
$sell="B";
include ('managerwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/projects/overtime/$D_Id");
include ('get.php');
}


?>
<!DOCTYPE html>
<html lang ="en">
<head>
    <meta charset="utf-8">
	<title>manager</title>
	</head>
<body><br><br>
<style type="text/css">
#wrap {
	width:450px;
}
.left {
	float:left;
		width:240px;
	hight:123px;
	margin-left: 25%;
}
.right {
	float:right;
	width:240px;
	hight:123px;
	margin-right: 25%;
}
* {
    box-sizing: border-box;
}
body {

 background-color: 	 white;
}
input[type=text], select, textarea {
    width: 80%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    resize: vertical;
}
div {
    width: 800px;
   align=center;
}
label {
    padding: 12px 12px 12px 0;
    display: inline-block;
}

input[type=submit] {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    float: right;
}

input[type=submit]:hover {
    background-color: #45a049;
}

.container {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}

.col-25 {
    float: left;
    width: 24%;
    margin-top: 6px;
}

.col-75 {
    float: left;
    width: 48%;
    margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}
h2{
 font:bold 20px/30px Georgia, serif;
}
/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
    .col-25, .col-75, input[type=submit] {
        width: 100%;
        margin-top: 0;
    }
}
</style>
<div>
<div class="center">

<form name="form2" method="post">
<center>
<h3>Manager Task</h3>
<div class="container">
 <div class="row">
     <div class="col-25">
	<label for="fname">Manager ID</label>
	</div>
	<div class="col-75">
	<input type="text" name="m_Id">
	</div>
	
	  <div class="col-25">
      <input type="submit" name="msrch" value="Search">
	  </div>
	</div>
	</div>
	</center>
	
	</div>
	
	
	
	
	
	
	

	
	<center>
<br><br>
	<table border="0" style="width:1050px; height:30px; border-radius: 4px;border: 1px solid #ccc; background-color:#4CAF50;">

            <tr height="30">

            <td width="100" align="center"><b>Manager ID</b></td>
            <td width="150" align="center"><b>Project ID</b></td>

             <td width="300" align="center"><b>Project Name</b></td>
			
			<td width="100" align="center"><b>Hours</b></td>

            <td width="300" align="center"><b>Overtime</b></td>


            <td width="200" align="center"><b>Developer ID</b></td>
			
			<td width="200" align="center"><b>Contribution</b></td>

            </tr>

            </table>

            <table border="0" style="width:1050px;>

        

            <tr style=" background-color:#fffff; ">

             <?php 
			 if($response!=NULL && $sell="A"){
		    $value = json_decode($response,true);
			
			//echo $characters['task_name'];
			//echo $yummy ->task_name;
			foreach ($value as $characters) {
			//echo $value['task_name'];

			
		

	      ?>
 <td width="100" align="center"><?php echo $characters['m_Id'];?></td>
		  <td width="150" align="center"><?php echo $characters['p_Id'];?></td>

             <td width="300" align="center"><?php echo $characters['project_name'];?></td>

            <td width="100" align="center"><?php echo $characters['hours']; ?></td>
			
			<td width="300" align="center"><?php echo $characters['overtime']; ?></td>

           

            <td width="200" align="center"><?php echo $characters['d_Id'];?></td>

             <td width="200" align="center"><?php echo $characters['contribution'];?></td>
            </tr>

        <?php
			}
			 }
			?>

            </table>
	
	
	</center>
	<br><br><br><br>
	<br><br><br><br>
	<br><br>
	<div>
<div class="center">


<center>
<h3>Developer Overtime</h3>
<div class="container">
 <div class="row">
     <div class="col-25">
	<label for="fname">Developer ID</label>
	</div>
	<div class="col-75">
	<input type="text" name="d_Id">
	</div>
	
	  <div class="col-25">
      <input type="submit" name="dsrch" value="Search">
	  </div>
	
	
	</center>
	</form>
	</div>
	</div>
	<br><br><br><br>
	<center>

	<table border="0"  style="width:300px; height:30px; border-radius: 4px;border: 1px solid #ccc; background-color:#4CAF50;">

            <tr height="30">

           
            <td width="150" align="center"><b>Developer ID</b></td>
            <td width="150" align="center"><b>Overtime</b></td>

            </tr>
			
        </table>
<br><br><br>
            <table border="0">

        

            <tr style=" background-color:#fffff; ">

             <?php 
			 if($response!=NULL && $sell = "B"){
		    $characters = json_decode($response,true);
			
			//echo $characters['task_name'];
			//echo $yummy ->task_name;
			//foreach ($characters as $value) {
			//echo $value['task_name'];

			
		

	      ?>
        
		 <td width="150" align="center"><?php echo $characters['d_Id'];?></td>
            <td width="150" align="center"><?php echo $characters['overtime'];?></td></tr>
            

        <?php
			}
			
	
			
			
			?>

            </table>
	
	
	</center>
	
	
</body>
</html>