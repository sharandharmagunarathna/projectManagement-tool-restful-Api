<?php
$response=NULL;
$methdev=NULL;
$meth=NULL;
if(isset($_POST['Vproj'])){
$meth="B";
include ('projectwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/projects/project/$P_Id");
include ('get.php');

}
if(isset($_POST['Vall'])){
$meth="A";
include ('projectwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/projects");
include ('get.php');

}

if(isset($_POST['VallDev'])){
$methdev="A";
include ('developerwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/projects/devallproject");
include ('get.php');

}
if(isset($_POST['delproj'])){

include ('projectwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/projects/project/$P_Id");
include ('delete.php');
$response=NULL;
}

if(isset($_POST['Addproj'])){

include ('projectwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/projects/dev/newproject");
include ('post.php');
$response=NULL;
}

if(isset($_POST['updproj'])){

include ('projectwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/projects/project");
include ('put.php');
$response=NULL;
}
//developer project
if(isset($_POST['VDev'])){
$methdev="A";
$response=NULL;
include ('developerwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/projects/developer/{$developre_Id}-{$P_Id}");
include ('get.php');

}
if(isset($_POST['Vall'])){
$meth="A";
include ('projectwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/projects");
include ('get.php');

}
if(isset($_POST['delDev'])){

include ('developerwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/projects/project/$P_Id");
include ('delete.php');
$response=NULL;
}

if(isset($_POST['AddDev'])){

include ('developerwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/projects/devproject");
include ('post.php');
$response=NULL;
}

if(isset($_POST['updDev'])){

include ('developerwork.php');                                                                                  

$ch = curl_init("http://localhost:8080/Imginarync/webapi/projects/project");
include ('put.php');
$response=NULL;
}
?>
<!DOCTYPE html>
<html lang ="en">
<head>
    <meta charset="utf-8">
	<title>project</title>
	</head>
<body><br><br>
<style type="text/css">
#wrap {
	width:450px;
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
  
      border-radius: 5px;
    background-color: #f2f2f2;
    padding: 50px;
}
.left {
	float:left;
		width:500px;
	hight:123px;
	margin-left: 1%;
}
.right {
	float:right;
	width:500px;
	hight:123px;
	margin-right: 10%;
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


<div class="left">

<form name="form2" method="post">
<center>
<h3>Project</h3>
    <table>
	<tr><th align =left>Project ID:</th><th><input type="text" name="p_Id" id="p_Id"></th></tr>
	<tr><th align =left>Project Name:</th><th><input type="text" name="project_name" id="project_name"></th><tr>
	<tr><th align =left>Manager ID:</th><th><input type="text" name="m_Id" id="m_Id"></th><tr>
	<tr><th align =left>Start Date:</th><th><input type="text" name="start_date" id="start_date"></th><tr>
	<tr><th align =left>End Date:</th><th><input type="text" name="end_date" id="end_date"></th><tr>
	
	
	
	<tr><th align =left><input type="submit" name="Addproj" value="Add Project"></th>
	<th align =right>	<input type="submit" name="updproj" value="Update Project"></th></tr>
    <tr><th align =left><input type="submit" name="delproj" value="Delete Project"></th>
	<th align =right><input type="submit" name="Vproj" value="View Project"></th></tr>
	<tr><th align =left><input type="submit" name="Vall" value="View All Project"></th></tr>
	</table>
	</center>
	
	</div>
	

	<div class="right">
	
	<h3 align="center">Developer Project</h3>
    <table>
	<tr><th align =left>Project ID:</th><th><input type="text" name="Dp_Id" id="Dp_Id"></th></tr>
	<tr><th align =left>Developer ID:</th><th><input type="text" name="d_Id" id="d_Id"></th><tr>
	<tr><th align =left>Hours:</th><th><input type="text" name="hours" id="hours"></th><tr>
	<tr><th align =left>Overtime:</th><th><input type="text" name="overtime" id="overtime"></th><tr>
	<tr><th align =left>Contribution:</th><th><input type="text" name="contribution" id="contribution"></th><tr>
	
	
	
	<tr><th></th>
	<th><th></tr>
	<tr><th></th>
	<th><th></tr>
	<tr><th></th>
	<th><th></tr>
	<tr><th></th>
	<th><th></tr>
	<tr><th></th>
	<th><th></tr>
	<tr><th></th>
	<th><th></tr>
	<tr><th></th>
	<th><th></tr>
	<tr><th></th>
	<th><th></tr>

	
	
	
	<tr><th align =left><input type="submit" name="AddDev" value="Add Developer"></th>
	<th align =right>	<input type="submit" name="updDev" value="Update Developer"></th></tr>
    <tr><th align =left><input type="submit" name="delDev" value="Delete Developer"></th>
	<th align =right><input type="submit" name="VDev" value="View Developer"></th></tr>
	<th align =center><input type="submit" name="VallDev" value="View all Developers"></th></tr>
	</table>
	</div>
	<br><br>
	</form>
	<br><br><br><br>
	<br><br><br><br>
	<br><br><br><br>
	<br><br><br><br>
	<br><br><br><br>
	<br><br><br><br>
	<br><br><br><br>
	<br><br><br><br>



	<table  align="right"  id="devtbl" border="0" style="width:500px; height:30px;">

            <tr style=" background-color:#4CAF50; height:30px;border-radius:4px; ">

            <td width="50" align="center"><b>Project ID</b></td>
            <td width="50" align="center"><b>Developer ID</b></td>
			<td width="50" align="center"><b>Hours</b></td>
			<td width="50" align="center"><b>Overtime</b></td>
			<td width="50" align="center"><b>Contribution</b></td>
			 </tr>
			 

           <?php 
		  
			
			
			if ($methdev=="A" && $response!=NULL) {
				$value = json_decode($response,true);
			foreach ($value as  $characters){
			
			
		

	     ?>
			<tr style=" background-color:#fffff; ">
		     <td width="50" align="center"><?php echo $characters['p_Id'];?></td>
             <td width="50" align="center"><?php echo $characters['d_Id'];?></td>
		     <td width="50" align="center"><?php echo $characters['hours'];?></td>
             <td width="50" align="center"><?php echo $characters['overtime'];?></td>
			 <td width="50" align="center"><?php echo $characters['contribution'];?></td></tr>
			<?php
			}
			}
			?>
			 
			 </table>
			 </div>
			 
	</form></center>
	</div>
	</div>
	<br><br><br><br>
	<br><br><br><br>
	<br><br><br><br>
	<br><br><br><br>
	<br><br><br><br>
	<br><br><br><br>
	
	<center>

	<table border="0" style="width:1300px; height:30px; background-color:#4CAF50;border-radius: 4px;">

            <tr height="30">

            <td width="100" align="center"><b>Project ID.</b></td>

             <td width="300" align="center"><b>Project Name.</b></td>
			
			<td width="100" align="center"><b>Hours</b></td>

            <td width="150" align="center"><b>Overtime</b></td>

            <td width="100" align="center"><b>Manager ID</b></td>

            <td width="150" align="center"><b>Developer ID</b></td>
			
			<td width="100" align="center"><b>Contribution</b></td>
			
			<td width="150" align="center"><b>Start Date</b></td>
			
			<td width="100" align="center"><b>End Date</b></td>

            </tr>

            </table>

            <table id="tabl" border="0">

        

           

             <?php 
			 
			 if($response!=NULL and $meth=="A"){
		    $value = json_decode($response,true);
			//echo "A working";
			//echo $characters['task_name'];
			//echo $yummy ->task_name;
			foreach ($value as  $characters){

			
		

	      ?>
			 <tr style=" background-color:#fffff; ">
			
		  <td width="100" align="center"><?php echo $characters['p_Id'];?></td>

             <td width="300" align="center"><?php echo $characters['project_name'];?></td>

            <td width="100" align="center"><?php echo $characters['hours']; ?></td>
			
			<td width="150" align="center"><?php echo $characters['overtime']; ?></td>

            <td width="100" align="center"><?php echo $characters['m_Id'];?></td>
			
			 <td width="150" align="center"><?php echo $characters['d_Id'];?></td>
			 
			  <td width="100" align="center"><?php echo $characters['contribution'];?></td>

            <td width="150" align="center"><?php echo $characters['start_date'];?></td>

             <td width="100" align="center"><?php echo $characters['end_date'];?></td>
            </tr>

        <?php
			}
			 }
			 else if($response!=NULL and $meth=="B"){
				// echo "B working";
		    $characters = json_decode($response,true);
			
			//echo $characters['task_name'];
			//echo $yummy ->task_name;
			//foreach ($value as  $characters){

			
		

	      ?>
			 <tr style=" background-color:#fffff; ">
			
		  <td width="100" align="center"><?php echo $characters['p_Id'];?></td>

             <td width="300" align="center"><?php echo $characters['project_name'];?></td>

            <td width="100" align="center">0</td>
			
			<td width="150" align="center">0</td>

            <td width="100" align="center"><?php echo $characters['m_Id'];?></td>
			
			<td width="150" align="center">0</td>
			 
			<td width="100" align="center">0</td>

           <td width="150" align="center"><?php echo $characters['start_date'];?></td>

             <td width="100" align="center"><?php echo $characters['end_date'];?></td>
            </tr>
			 
			<?php
			}
			 
			?>

            </table>
	
	<br><br><br><br>
	</center>
	<script>
    
                var table = document.getElementById('tabl');
                
                for(var i = 0; i < table.rows.length; i++)
                {
                    table.rows[i].onclick = function()
                    {
                         //rIndex = this.rowIndex;
                         document.getElementById("p_Id").value = this.cells[0].innerHTML;
						//  document.getElementById("Dp_Id").value = this.cells[0].innerHTML;
                         document.getElementById("project_name").value = this.cells[1].innerHTML;
                         document.getElementById("m_Id").value = this.cells[4].innerHTML;
						 document.getElementById("start_date").value = this.cells[7].innerHTML;
                         document.getElementById("end_date").value = this.cells[8].innerHTML;
                         //document.getElementById("hours").value = this.cells[5].innerHTML;
						 //document.getElementById("overtime").value = this.cells[6].innerHTML;
                         //document.getElementById("contribution").value = this.cells[7].innerHTML;

                    };
                }
				
				
				
				
    
         </script>
	<script>
	var table1 = document.getElementById('devtbl');
                
                for(var j = 0; j < table1.rows.length; j++)
                {
                    table1.rows[j].onclick = function()
                    {
                         //rIndex = this.rowIndex;
							document.getElementById("Dp_Id").value = this.cells[0].innerHTML;
							document.getElementById("d_Id").value = this.cells[1].innerHTML;
						    document.getElementById("hours").value = this.cells[2].innerHTML;
						    document.getElementById("overtime").value = this.cells[3].innerHTML;
						    document.getElementById("contribution").value = this.cells[4].innerHTML;
                    };
                }
    
	
	</script>
	
	
	
	
</body>
</html>