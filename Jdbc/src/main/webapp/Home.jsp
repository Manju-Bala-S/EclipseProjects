<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: pink; /* Set the body background color to pink */
        }

        form {
            width: 50%;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 8px;
            background-color: #f8f8f8;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 15px;
        }

        th, td {
            padding: 10px;
            border: 1px solid #ddd;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        label {
            margin-bottom: 5px;
            display: block;
        }

        input[type="number"], input[type="password"], input[type="submit"] {
            width: calc(100% - 20px); /* 100% width minus 20px for consistent spacing */
            padding: 8px;
            box-sizing: border-box;
            margin-bottom: 10px; /* Adjust as needed */
        }

        .show-password {
            margin-top: 5px;
        }

        h2 {
            text-align: center;
        }

        /* Styling for the "Register" button */
        input[type="submit"][value="Register"] {
            width: 48%; /* Set a smaller width for the Register button */
            margin-right: 4%; /* Add some right margin to separate the buttons */
        }

        /* Clearfix to ensure the buttons are on the same line */
        .clearfix::after {
            content: "";
            display: table;
            clear: both;
        }
    </style>
    <title>Home Page</title>
</head>
<body>

    <form action="login" method="post">
        <h2>Faculty Page</h2>
        <table>
            <tr>
                <td><label for="id">Id:</label></td>
                <td><input type="number" id="id" name="id" required></td>
            </tr>
            <tr>
                <td><label for="password">Password:</label></td>
                <td>
                    <input type="password" id="password" name="password" required>
                    <input type="checkbox" id="showPassword" class="show-password">Show Password
                </td>
            </tr>
            <!-- Add more rows for additional form fields as needed -->
        </table>

        <div class="clearfix">
            <input type="submit" value="Login">
            <center>
            Don't have an account?  <input type="submit" value="Register">
            </center>
        </div>
    </form>

    <script>
        document.getElementById('showPassword').addEventListener('change', function () {
            var passwordField = document.getElementById('password');
            passwordField.type = this.checked ? 'text' : 'password';
        });
    </script>

</body>
</html>
