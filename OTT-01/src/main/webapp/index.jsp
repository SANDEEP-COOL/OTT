<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
	<script src="https://kit.fontawesome.com/05d425af79.js" crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<style>
		 body {
      background-color: pink;
    }
    .display-none {
      opacity: 0;
      transition: opacity 2.5s;
    }
    .display-block {
      opacity: 1;
      transition: opacity 2.5s;
    }
	</style>
</head>
<body>
	<div class="d-flex justify-content-center align-items-center" style="height: 100vh; width: 12vw">
    <div class="d-flex flex-column justify-content-center align-items-center">
      <i class="fa-solid fa-user p-4 sideBarIcon"></i>
      <i class="fa-solid fa-magnifying-glass p-4 sideBarIcon"></i>
      <i class="fa-solid fa-house p-4 sideBarIcon"></i>
      <i class="fa-solid fa-tv p-4 sideBarIcon"></i>
      <i class="fa-solid fa-clapperboard p-4 sideBarIcon"></i>
      <i class="fa-solid fa-volleyball p-4 sideBarIcon"></i>
    </div>
    <div class="d-flex flex-column justify-content-around display-none" style="height: 384px" id="sideBar">
      <strong>MySpace</strong>
      <strong>Search</strong>
      <strong>Home</strong>
      <strong>Tv</strong>
      <strong>Movies</strong>
      <strong>Sport</strong>
    </div>
  </div>
	<script src="index.js"></script>
</body>



</html>