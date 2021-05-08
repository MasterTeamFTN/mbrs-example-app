<!DOCTYPE HTML>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h1>Product ${product.id}</h1>
<div>
    <table border="1">
        <tr>
            <th>barcode</th>
            <th>type</th>
            <th>count</th>
            <th>users</th>
        </tr>
        <tr>
            <td>${product.barcode}</td>
            <td>${product.type}</td>
            <td>${product.count}</td>
            <td><a href="${'/user/byProduct/' + product.id}">users of product</a></td>
        </tr>
    </table>
</div>
</body>
</html>