<html>
<head><title></title>
<body>
<div id="header">

</div>
 
<div id="content">
     

  
  <table class="datatable">
    <tr>
        <th>Vehicle Name</th>
    </tr>
    <#list vehicleList as vehicle>
    <tr>
        <td>${vehicle.name}</td>
    </tr>
    </#list>
  </table>
 
</div>  
</body>
</html>  