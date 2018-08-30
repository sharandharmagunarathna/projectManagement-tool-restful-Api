<?php

//$string =http_build_query($data);
echo $data_string;
$ch = curl_init("http://localhost:8080/Imginarync/webapi/tasks/T_Id");
//curl_setopt($ch, CURLOPT_POST, true);
//($ch, CURLOPT_HTTPHEADER, "application/json");
curl_setopt($ch, CURLOPT_HTTPHEADER, array(
                                            'Content-Type: application/json',
                                            'Content-Length: ' . strlen($data_string)
                                            ));

curl_setopt($ch, CURLOPT_CUSTOMREQUEST, "GET");
curl_setopt($ch, CURLOPT_POSTFIELDS, $data_string);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true); 

$response = curl_exec($ch);
echo $response;

?>