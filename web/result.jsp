<%-- 
    Document   : result
    Created on : Nov 10, 2025, 8:31:52 PM
    Author     : HP
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Hinh Chu Nhat cua toi</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1>DAY LA KET QUA</h1>
        <p>Hinh Chu Nhat DAi: <strong>${hcn.getChieuDai()}</strong></p>
        <p>Hinh Chu Nhat RONG: <strong>${hcn.getChieuRong()}</strong></p>
        
        <p>Dien Tich: <strong>${hcn.tinhDienTich()}</strong></p>
        <p>Chu Vi: <strong>${hcn.tinhChuVi()}</strong></p>
        <a href="index.html">Quay lại trang nhập</a>
    </body>
</html>
