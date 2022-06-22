<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../components/Navbar.jsp"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@1,100&display=swap" rel="stylesheet">
    <title>Login</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,400;1,100&display=swap');
        *{
            font-family: 'Poppins', sans-serif;
        }
        .login-form-container{
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            margin-top: 4rem;
            padding: 4rem;
        }
        .login-form-container h2{
            text-transform: uppercase;
            font-weight: bold;
            font-size: 26px;
        }
        .login-form-input{
            display: flex;
            flex-direction: column;
            padding-top: 1rem;
        }
        .login-form-container input{
            height: 2.8rem;
            width: 21rem;
            background: rgba(148, 164, 220, 0.36);
            border: none;
            border-radius: 2px;
            outline: 0;
            padding-left: 20px;
        }
        .button{
            margin-left: 7rem;
            margin-top: 1.5rem;
            width: 10rem;
            height: 3rem;
            background: #496CE8;
            color: white;
            outline: 0;
            border: none;
            font-size: 18px;
        }

    </style>
</head>
<body>
<div class="login-form-container">
    <h2>Login</h2>
    <form action="/users/login" method="post">
        <div class="login-form-input">
            <label>Email</label>
            <input type="text" name="emailOrUsernameOrPhone" />
        </div>
        <div class="login-form-input">
            <label>Password</label>
            <input type="password" name="password"/>
        </div>
        <button class="button">Submit</button>
    </form>
</div>

</body>
</html>