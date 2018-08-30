<?php




curl_setopt($ch, CURLOPT_POST, true);
curl_setopt($ch, CURLOPT_HTTPHEADER, array(
                                            'Content-Type: application/json',
                                            'Content-Length: ' . strlen($data_string)
                                            ));

curl_setopt($ch, CURLOPT_CUSTOMREQUEST, "POST");
curl_setopt($ch, CURLOPT_POSTFIELDS, $data_string);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true); 

$response = curl_exec($ch);
$err = curl_error($ch);

if ($err) {
 
    echo "<script>alert('Data Transfer Failed!');</script>";
}
else {
    echo "<script>alert('Data Transfer complete!');</script>";
	
}

?>