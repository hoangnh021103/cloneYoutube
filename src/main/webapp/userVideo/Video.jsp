<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form method="post">
    <p>Id<input type="text" name="Id" value="${currentUSer.id}"></p>
    <p>Title<input type="text" name="Title" value="${currentUSer.title}"></p>
    <p>Description<input type="text" name="Description" value="${currentUSer.description}"></p>
    <p>Active<input type="checkbox" name="Active"></p>
    <p>Poster<input type="text" name="Poster" value="${currentUSer.poster}"></p>
    <button>save</button>
</form>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Description</th>
        <th>Active</th>
        <th>Poster</th>
    </tr>
    <c:forEach items="${list}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.title}</td>
            <td>${u.description}</td>
            <td>${u.active? "YEs":"No"}</td>
         
            <td><img style="width: 150px;height: 75px" src="${u.poster}" alt=""></td>
            <td>
                <a href="delete-USer1?id=${u.id}">Xoa</a>
                <a href="update-USer1?id=${u.id}">CApNhat</a>
            </td>

        </tr>
    </c:forEach>
</table>
