<?php




curl_setopt($ch, CURLOPT_POST, true);
curl_setopt($ch, CURLOPT_HTTPHEADER, array(
                                            'Content-Type: application/json',
                                            'Content-Length: ' . strlen($data_string)
                                            ));

curl_setopt($ch, CURLOPT_CUSTOMREQUEST, "GET");
curl_setopt($ch, CURLOPT_POSTFIELDS, $data_string);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true); 


$response = curl_exec($ch);
$err = curl_error($ch);

if ($err) {
  
    echo "<script>alert('Data Loaded Failed!');</script>";
}
else {
    echo "<script>alert('Data Loaded complete!');</script>";
	
}


?>