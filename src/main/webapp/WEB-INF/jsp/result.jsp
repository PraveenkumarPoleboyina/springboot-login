<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Profile</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            padding: 40px;
            background-color: #f8f9fa;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        .container {
            display: flex;
            justify-content: center;
            align-items: flex-start;
            gap: 30px;
            margin-top: 30px;
            flex-wrap: wrap; /* makes it responsive on smaller screens */
        }

        img {
            max-width: 400px;
            max-height: 400px;
            width: auto;
            height: auto;
            object-fit: contain; /* ensures full image is shown */
            border: 2px solid #ccc;
            border-radius: 8px;
        }

        iframe {
            width: 400px;
            height: 300px;
            border: 1px solid #ccc;
        }
    </style>
</head>
<body>
    <h2>Welcome, ${name}</h2>

    <div class="container">
        <img src="${imagePath}" alt="My Image">
        <iframe src="${resumePath}" title="Resume PDF"></iframe>
    </div>
</body>
</html>
