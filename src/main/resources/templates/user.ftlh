<!DOCTYPE HTML>
<html>
<head>
    <title>User</title>
</head>
<body>
<h1>User ${user.id}</h1>
<div>
    <table border="1">
        <tr>
            <th>name</th>
            <th>address</th>
            <th>storage</th>
        </tr>
        <tr>
            <td>${user.name}</td>
            <td>${user.address.id}</td>
            <td>${user.storage.id}</td>
        </tr>
    </table>
</div>
</body>
</html>