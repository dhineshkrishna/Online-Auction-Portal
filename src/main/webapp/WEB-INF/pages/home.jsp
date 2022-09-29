<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Hello</h1>
<form th:action="@{/users/save}"
    th:object="${user}" method="post"
    enctype="multipart/form-data"
    >

    <div>

    <label>Photos: </label>
    <input type="file" name="image" accept="image/png, image/jpeg" />

    </div>

</form>
<button type="submit" width=200px height=50px>Submit</button>
</body>
</html>