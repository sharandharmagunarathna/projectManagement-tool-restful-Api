<?php

$P_Id=$_POST['Dp_Id'];

$developre_Id=$_POST['d_Id'];

$hours=$_POST['hours'];

$overtime=$_POST['overtime'];

$contribution=$_POST['contribution'];


$data = array("Dp_Id"=>$P_Id,"d_Id"=>$developre_Id,"hours"=>$hours,"overtime"=>$overtime,"contribution"=>$contribution);


$data_string = json_encode($data);                                                                                   




?>