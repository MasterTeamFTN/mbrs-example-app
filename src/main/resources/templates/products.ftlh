<!DOCTYPE HTML>
<html>
    <head>
        <title>Product List</title>
    </head>
    <body>
    <h1>Products List</h1>
    <div>
        <table border="1">
            <tr>
                <th>id</th>
                <th>barcode</th>
                <th>type</th>
                <th>count</th>
                <th>users</th>
            </tr>
            <#list products as product>
                <tr>
                    <td><a href="${product.id}">${product.id}</a></td>
                    <td>${product.barcode}</td>
                    <td>${product.type}</td>
                    <td>${product.count}</td>
                    <td><a href="${'/user/byProduct/' + product.id}">users of product</a></td>
                </tr>
            </#list>
        </table>
        <a href="${'create/'}">Create product</a>
    </div>
    </body>
</html>