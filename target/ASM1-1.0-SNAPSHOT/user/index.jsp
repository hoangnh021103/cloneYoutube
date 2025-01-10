<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form method="post">
    <p>id<input type="text" name="id" value="${currentUser.id}"></p>
    <p>email<input type="text" name="email" value="${currentUser.email}"></p>
    <p>password<input type="password" name=password value="${currentUser.password}"></p>
    <p>full Name<input type="text" name="fullname" value="${currentUser.fullname}"></p>
    <p>admin<input type="checkbox" name="admin"></p>
    <button>save</button>
</form>

<table border="1">
    <tr>
        <th>ID</th>
        <th>email</th>
        <th>Password</th>
        <th>Full Name</th>
        <th> admin</th>
    </tr>
    <c:forEach items="${list}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.email}</td>
            <td>${u.password}</td>
            <td>${u.fullname}</td>
            <td>${u.admin? "admin":"user"}</td>
            <td>
                <a href="delete-user?id=${u.id}">Xoa</a>
                <a href="update-user?id=${u.id}">CApNhat</a>
            </td>
        </tr>
    </c:forEach>
</table>
