<!DOCTYPE HTML>
<html>
<head>
    <title>Storage List</title>
</head>
<body>
<h1>Storage List</h1>
<div>
    <table border="1">
        <tr>
            <th>id</th>
            <th>location</th>
            <th>users</th>
        </tr>
        <#list storages as storage>
            <tr>
                <td><a href="${storage.id}">${storage.id}</a></td>
                <td>${storage.location}</td>
                <td><a href="${'/user/byStorage/' + storage.id}">users of storage</a></td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>