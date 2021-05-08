<!DOCTYPE HTML>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Products List</h1>
<div>
    <fieldset>
        <legend>Add Product</legend>
        <form name="product" action="${springMacroRequestContext.getContextPath()}/product/add" method="post">
            Barcode : <input type="number" name="barcode" /><br/>
            Type: <input type="text" name="type" /><br/>
            Count: <input type="number" name="count" /><br/>
            <input type="submit" value="Save" />
        </form>
    </fieldset>
    <br/>

</div>
</body>
</html>