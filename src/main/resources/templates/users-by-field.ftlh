<html>
<head>
    <title>Users</title>
</head>
<body>
<h1>Users by field</h1>
<div>
    <table border="1">
        <tr>
            <th>id</th>
            <th>name</th>
            <th>address</th>
            <th>storage</th>
        </tr>
        <#list users as user>
            <tr>
                <td><a href="${'/user/' + user.id}">${user.id}</a></td>
                <td>${user.name}</td>
                <td>${user.address.streetName}</td>
                <td>${user.storage.location}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>