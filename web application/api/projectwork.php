<?php

$P_Id=$_POST['p_Id'];

$project_name=$_POST['project_name'];

$start_date=$_POST['start_date'];

$end_date=$_POST['end_date'];

$manager_Id=$_POST['m_Id'];




$data = array("p_Id"=>$P_Id,"project_name"=>$project_name,"start_date"=>$start_date,"end_date"=>$end_date,"m_Id"=>$manager_Id,);


$data_string = json_encode($data);                                                                                   




?>