<!DOCTYPE html>
<html>
<head>
<style>
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
    width: px;
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
    width: 100%;
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
<body>
<center><br><br>
<h2>Home Page</h2>

<div class="container">
  <form action="/action_page.php">
    <div class="row">
      <div class="col-25">
   <a href="task.php">Go to the task page</a><br>
   <br>
   
    <a href="manager.php">Go to the Manager page</a><br>
	<br>

	 <a href="project.php">Go to the Project page</a>
      </div>
    
    </div>
    
  </form>
</div>

</center>
</body>
</html>