<?php
$response=NULL;

if(isset($_POST['vtask'])){
	$chek = $_POST['t_Id'];
if($chek>0){
include ('taskwork.php');                                                                                  

	$ch = curl_init("http://localhost:8080/Imginarync/webapi/tasks/$t_Id");
	include ('get.php');
}

}
if(isset($_POST['deltask'])){
	$chek = $_POST['t_Id'];
if($chek>0){
include ('taskwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/tasks/$t_Id");
include ('delete.php');
}
}

if(isset($_POST['Addtask'])){
	$chek = $_POST['t_Id'];
if($chek>0){
include ('taskwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/tasks/task");
include ('post.php');
}
}

if(isset($_POST['updtask'])){
	$chek = $_POST['t_Id'];
if($chek>0){
include ('taskwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/tasks/$t_Id");
include ('put.php');
}
}
?>

<!DOCTYPE html>
<html lang ="en">
<head>
    <meta charset="utf-8">
	<title>Task</title>
	<style>
            table1 tr:not(:first-child){
                cursor: pointer;transition: all .25s ease-in-out;
            }
            table1 tr:not(:first-child):hover{background-color: #ddd;}
			body {

 background-color: lightblue;
}

h1 {
    color: white;
    text-align: center;
}

p {
    font-family: verdana;
    font-size: 20px;
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
    width: 490px;
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
    width: 75%;
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
	</head>
	
<body><br><br><center><h3>Task Page</h3>
<div class="container">
<form name="form1" method="post" >
    <table >
	<tr><th align =left>Task ID:</th><th><input type="text" name="t_Id" id="t_Id"></th></tr>
	<tr><th align =left>Task Name:</th><th><input type="text" name="task_name" id="task_name"></th><tr>
	<tr><th align =left>Start Date:</th><th><input type="text" name="start_date" id="start_date"></th><tr>
	<tr><th align =left>End Date:</th><th><input type="text" name="end_date" id="end_date"></th><tr>
	<tr><th align =left>No of Hours:</th><th><input type="text" name="numbe_of_hours" id="numbe_of_hours"></th><tr>
	<tr><th align =left>Over time:</th><th><input type="text" name="overtime" id="overtime"></th><tr>
	<tr><th align =left><label for="name">description:</label></th><th>
	<input type="text" name="desc" id="desc"></th><tr>
	<tr><th></th>
	<tr><th></th>
	<tr><th></th>
	<tr><th></th>
	<tr><th align =left><input type="submit" name="Addtask" value="Add Task"></th>
	<th align =right><input type="submit" name="updtask" value="Update Task"></th></tr>
    <tr><th align =left><input type="submit" name="deltask" value="Delete Task"></th>
	<th align = right><input type="submit" name="vtask" value="View Task"></th></tr>
	</table>
	</form></center>
	<br><br>
	<center>
	
	<table border="0" style="width:1050px; height:30px; border-radius: 4px;border: 1px solid #ccc; background-color:#4CAF50;" id="table"; >

            <tr height="30">

            <td width="75" align="center"><b>Task ID.</b></td>

             <td width="200" align="center"><b>Task Name.</b></td>

            <td width="75" align="center"><b>Hours</b></td>
			
			<td width="100" align="center"><b>Overtime</b></td>

            <td width="300" align="center"><b>Description</b></td>

            <td width="100" align="center"><b>Start date</b></td>

            <td width="200" align="center"><b>End date</b></td>

            </tr>

            </table>

            <table id="table1" border="0" >

        

            

             <?php 
			 if($response!=NULL){
		    $characters = json_decode($response,true);
			
			//echo $characters['task_name'];
			//echo $yummy ->task_name;
			//foreach ($characters as $value) {
			//echo $value['task_name'];

			//}
		

	      ?>
	<tr>
		  <td width="75" align="center"><?php echo $characters['t_Id'];?></td>

             <td width="200" align="center"><?php echo $characters['task_name'];?></td>

            <td width="75" align="center"><?php echo $characters['numbe_of_hours']; ?></td>
			
			<td width="100" align="center"><?php echo $characters['overtime']; ?></td>

            <td width="300" align="center"><?php echo $characters['description'];?></td>

            <td width="100" align="center"><?php echo $characters['start_date'];?></td>

             <td width="200" align="center"><?php echo $characters['end_date'];?></td>
            
					</tr>
     
			<?php
			 }
			 ?>
            </table>
			
		<br><br><br><br>

	
	</center>
	

	<script>
    
                var table = document.getElementById('table1');
                
                for(var i = 0; i < table.rows.length; i++)
                {
                    table.rows[i].onclick = function()
                    {
                         //rIndex = this.rowIndex;
                         document.getElementById("t_Id").value = this.cells[0].innerHTML;
                         document.getElementById("task_name").value = this.cells[1].innerHTML;
                         document.getElementById("numbe_of_hours").value = this.cells[2].innerHTML;
						 document.getElementById("overtime").value = this.cells[3].innerHTML;
                         document.getElementById("desc").value = this.cells[4].innerHTML;
                         document.getElementById("start_date").value = this.cells[5].innerHTML;
						 document.getElementById("end_date").value = this.cells[6].innerHTML;

                    };
                }
    
         </script>
		 
		 
		 
	
</body>
</html>