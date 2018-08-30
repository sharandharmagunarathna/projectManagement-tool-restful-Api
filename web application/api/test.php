<?php

$t_Id=$_POST['t_Id'];

$task_name=$_POST['task_name'];

$start_date=$_POST['start_date'];

$end_date=$_POST['end_date'];

$numbe_of_hours=$_POST['numbe_of_hours'];

$overtime=$_POST['overtime'];

$desc=$_POST['desc'];
//$data = array("t_Id"=>$t_Id,"task_name"=>$task_name,"start_date"=>$start_date,"end_date"=>$end_date,
//"numbe_of_hours"=>$numbe_of_hours,"overtime"=>$overtime,"description"=>$desc);

$data = array("t_Id"=>$t_Id);
$data_string = json_encode($data);                                                                                   

include 'get.php';

?>