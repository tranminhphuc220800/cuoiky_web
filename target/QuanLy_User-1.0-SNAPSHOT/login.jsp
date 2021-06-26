<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/6/2021
  Time: 10:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <meta charset="utf-8">
    <meta name="description" content>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="fontawesome.min.css">
    <link rel="stylesheet" href="style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <style>
        body{
            background: #A59DA1;
            background-attachment: fixed;
            background-position: center;
            background-size: cover;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            padding:0;
            margin:0;
            font-family: 'Roboto Condensed', sans-serif;
            font-size: 100%;
        }
        h1,h2,h3,h4,h5,h6{
            margin:0;
        }
        p{
            margin:0;
        }
        ul{
            margin:0;
            padding:0;
        }
        label{
            margin:0;
        }
        a{
            transition: 0.5s all;
            -webkit-transition: 0.5s all;
            -moz-transition: 0.5s all;
            -o-transition: 0.5s all;
        }
        a:hover{
            transition: 0.5s all;
            -webkit-transition: 0.5s all;
            -moz-transition: 0.5s all;
            -o-transition: 0.5s all;
        }
        /*--header start here--*/
        .header-main {
            padding: 100px 0px 50px;
            width: 30%;
            margin: 0 auto;
        }
        .header-main h1 {
            font-size: 64px;
            color: #FFFFFF;
            text-align: center;
            padding-bottom: 0.8em;
        }
        .sign-up {
            margin: 2em 0;
        }
        span.hed-white {
            color: #fff;
        }
        .style1 {
            text-align: right;
            padding: 60px 0px 40px 0px;
        }
        .header-left {
            background: #fff;
            padding: 0px;
        }
        .sign-up h2 {
            font-size: 22px;
            color: #fff;
            font-family: 'Roboto Condensed', sans-serif;
            text-align: center;
            background:#A59DA1;
            width: 40px;
            height: 40px;
            line-height: 1.7em;
            border-radius: 50%;
            margin: 0 auto;
        }
        .header-left-bottom {

        }
        .header-left-bottom h3 {
            font-size: 16px;
            font-weight: 400;
            color:#A59DA1;
            line-height: 1.5em;
            margin: 0px 0px 25px 0px;
            font-family: 'Roboto Condensed', sans-serif;
        }
        span.login-color {
            color:#FFB900;
            font-weight: 700;
        }
        .header-left-bottom input[type="text"] {
            background: #A59DA1;
            outline: none;
            font-size: 15px;
            font-weight: 400;
            color: #fff;
            padding: 12px 13px 20px 44px;
            border:none;
            border-bottom:1px solid #fff;
            width: 87%;
            margin: 0 0 20px;
            display: inline-block;
        }
        .header-left-bottom input[type="password"]{
            background: #A59DA1;
            outline: none;
            font-size: 15px;
            font-weight: 400;
            color: #fff;
            border:none;
            border-bottom:1px solid #fff;
            padding: 12px 13px 20px 44px;
            width: 87%;
            margin: 0 0 20px;
            display: inline-block;
        }
        .header-left-bottom input[type="submit"] {
            background: red;
            color: #FFF;
            font-size: 26px;
            padding: 0.3em 1.2em;
            width: 100%;
            font-weight: 500;
            transition: 0.5s all;
            -webkit-transition: 0.5s all;
            -moz-transition: 0.5s all;
            -o-transition: 0.5s all;
            display: inline-block;
            cursor: pointer;
            outline: none;
            border: none;
            border-radius: 3px;
            font-family: 'Roboto Condensed', sans-serif;
        }
        .header-left-bottom input[type="submit"]:hover {
            background: #A59DA1;
            transition: 0.5s all;
            -webkit-transition: 0.5s all;
            -moz-transition: 0.5s all;
            -o-transition: 0.5s all;
        }
        .remember {
            margin: 1em 0em;
        }
    </style>
</head>

<body>
<div class="header">
    <div class="header-main">
        <h1>Login Form</h1>

        <div class="header-bottom">
            <div class="header-right w3agile">

                <div class="header-left-bottom agileinfo">

                    <form action="mphuc" method="post">
                        <input type="text" value="Username" name="username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'User name';}">
                        <input type="password" value="Password" name="password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'password';}">
                        <div class="remember">
			             <span class="checkbox1">
							   <label class="checkbox"><input type="checkbox" name="" checked=""><i> </i>Remember me</label>
						 </span>
                            <div class="clear"> </div>
                        </div>
                        <input type="submit" value="Login">
                    </form>
                </div>
            </div>

        </div>
    </div>
</div>
</form>
</body>
</html>
