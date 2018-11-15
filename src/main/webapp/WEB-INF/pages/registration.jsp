
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Battleship</title>
</head>
<body>
<style>
    body {        background-color:#DAA520;    }
</style>


    <form method="post" action="/battleship/registration">

        <label for="Username"> Enter you name </label>
        <input id="Username"
               type="text "
               name="Username"
                <%--required>--%>   >
               ${errorHolder.message}
               <%--$(errorholder.message)--%>
        <br>
        <style>
            button {
                display: inline-block;
                padding: 15px 25px;
                font-size: 24px;
                cursor: pointer;
                text-align: center;
                text-decoration: none;
                outline: none;
                color: #fff;
                background-color: #4CAF50;
                border: none;
                border-radius: 15px;
                box-shadow: 0 9px #999;
            }
            button:hover {background-color: #3e8e41}

            button:active {
                background-color: #3e8e41;
                box-shadow: 0 5px #666;
                transform: translateY(4px);
            }
        </style>


        <button type="submit">Click Me</button>



    </form>
</body>
</html>
