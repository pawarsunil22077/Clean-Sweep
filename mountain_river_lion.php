<?php 
//This code is to clean sweep a data set in a single file

//1. Establish a connection to the database
$dbconn = mysqli_connect(host, username, password, dbname);
if (!$dbconn) {
    die("Connection failed: " . mysqli_connect_error());
}
 
 //2. Create a query to select all data in the table
 $data_query = "SELECT * FROM data_set";
 
 //3. Execute the query
 $data_result = mysqli_query($dbconn, $data_query);
 
 //4. Check if query is successful
 if($data_result == FALSE) {
   echo "Error: " . mysqli_error($dbconn);
 }
 
 //5. Loop through the result set
 while($data_row = mysqli_fetch_assoc($data_result)) {
 
   //6. Discard any not valid data
   if (!validateData($data_row)) {
     echo "Discarding data\n";
     continue;
   }
   
   //7. Sanitize the data
   $data_row = sanitizeData($data_row);
   
   //8. Transform the data 
   $data_row = transformData($data_row);
   
   //9. Update the data in the table
   updateData($dbconn, $data_row);
 }
 
 //10. Close the connection
 mysqli_close($dbconn);

//Function to validate data
function validateData($data_row) {
   if (!isset($data_row['name']) || 
       !isset($data_row['email']) || 
       !isset($data_row['age'])) {
     return FALSE;
   }
   
   return TRUE;
}

//Function to sanitize data
function sanitizeData($data_row) {
  $sanitized_data_row = array();
  
  //Sanitizing the name
  $sanitized_data_row['name'] = filter_var($data_row['name'], FILTER_SANITIZE_STRING);
  
  //Sanitizing the email address
  $sanitized_data_row['email'] = filter_var($data_row['email'], FILTER_SANITIZE_EMAIL);
  
  //Sanitizing the age
  $sanitized_data_row['age'] = filter_var($data_row['age'], FILTER_SANITIZE_NUMBER_INT);
  
  return $sanitized_data_row;
}

//Function to transform data
function transformData($data_row) {
   
   //Transforming the name
   $transformed_data_row['name'] = ucwords($data_row['name']);
   
   //Transforming the email
   $transformed_data_row['email'] = strtolower($data_row['email']);
   
   //Transforming the age 
   $transformed_data_row['age'] = (int)$data_row['age'];
   
   return $transformed_data_row;
}

//Function to update data
function updateData($dbconn, $data_row) {
  //Creating the query
  $update_query = "UPDATE data_set
                   SET name = '{$data_row['name']}', 
                       email = '{$data_row['email']}', 
                       age = '{$data_row['age']}'
                   WHERE id = {$data_row['id']}";
                   
  //Executing the query
  $update_result = mysqli_query($dbconn, $update_query); 
   
  //Checking if query was successful
  if($update_result == FALSE) {
    echo "Error: " . mysqli_error($dbconn);
  }
}
?>