<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html>
  

   <head>
      <title>Website Site</title>
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
      <link rel="stylesheet" href="css/style.css">
      <link href="<c:url value="/resources/css/style.css"/>">
    </head>
  
  
  <!---------- Top Header HTML Code Starts --------->
  
  
<div class="width-100 top-header">
  <div class="container">
    <div class="width-50">
      <p class="head1p1 headquote">Dezven: India's Fastest Online Shopping Destination </p>
    </div>
    <div class="width-50">
      <ul class="head1ul cashback-sect">
        <li>
          <i class="fa fa-users" aria-hidden="true"></i>
          <a class="head1mr" href="#">Refer Your Friend And Earn Rs. 500 Cashback</a>
        </li>
        <li>
          <i class="fa fa-mobile" aria-hidden="true"></i>
          <a href="#"> Download App</a>
        </li>
      </ul>
      </p>
    </div>
  </div>
</div>
<!---------- Top Header HTML Code Ends --------->
  
  
  <!---------- Logo and Search Panel HTML Code Starts --------->
<div class="width-100 search-panel">
  <div class="container">
    <div class="width-20">
      <img src="<c:url value="/resources/imagess/109.jpg"/>" class="logo">
    </div>
    <div class="width-50">
      <input class="search-textbox" type="text" Placeholder="Search for products, brand and more">
      <button class="search-button">
        <i class="fa fa-search" aria-hidden="true"></i>
      </button>
    </div>
    <div class="width-30">
      <ul class="cart-sect">
        <li>
          <i class="fa fa-heart-o" aria-hidden="true"></i>
          <a class="head1mr" href="#">Whislist</a>
        </li>
        <li>
          <i class="fa fa-user-circle-o" aria-hidden="true"></i>
          <a href="home">Login & Signup</a>
        </li>
        <li>
          <i class="fa fa-shopping-cart" aria-hidden="true"></i>
          <a href="#">Cart (0)</a>
        </li>
      </ul>
    </div>
  </div>
</div>
<!---------- Logo and Search Panel HTML Code Ends --------->


<!---------- Main Menu HTML Code Starts --------->
<div class="width-100">
  <div class="container">
    <ul class="main-menu">
      <li>
        <a href="#">Home</a>
      </li>
      <li>
        <a href="#">iPhone</a>
      </li>
      <li>
        <a href="#">Samsung</a>
      </li>
      <li>
        <a href="#">Nokia</a>
      </li>
      <li>
        <a href="#">Motorola</a>
      </li>
      <li>
        <a href="#">iPad</a>
      </li>
      <li>
        <a href="#">Accessories</a>
      </li>
    </ul>
  </div>
</div>
<!---------- Main Menu HTML Code Ends --------->


<!---------- Slider HTML Code Starts --------->
<div class="width-100">
  <img class="wimg100-slider" src="<c:url value="/resources/imagess/OffHeader.jpg"/>">
</div>
<!---------- Slider HTML Code Ends --------->




<!---------- Banner HTML Code Starts --------->
<div class="width-100 margin-top-50">
  <div class="container">
    <div class="width-33">
      <div class="banner-list">
        <a href="#">
          <img class="wimg100" src="<c:url value="/resources/imagess/108.jpg"/>">
        </a>
      </div>
    </div>
    <div class="width-33">
      <div class="banner-list">
        <a href="#">
          <img class="wimg100" src="/107.jpg">
        </a>
      </div>
    </div>
    <div class="width-33">
      <div class="banner-list">
        <a href="#">
          <img class="wimg100" src="images/banner-3.jpg">
        </a>
      </div>
    </div>
  </div>
</div>
<!---------- Banner HTML Code Ends --------->



<!-- Product-Section HTML Code STARTS -->
<div class="width-100 margin-top-50">
  <div class="container">
  
    <c:forEach begin="1" end="5" >  
    <div class="width-25">
      <div class="product-section">
        <div class="product-border">
          <div class="product-img-center">
            <a href="proHome">
              <img class="product-img" src="<c:url value="/resources/imagess/107.jpg"/>">
            </a>
          </div>
          <div>
            <p class="product-name">
              <a href="/proHome">New iphone 11 Max Pro 64 GB</a>
            </p>
            <p class="product-rating">
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <i class="fa fa-star" aria-hidden="true"></i>
              <span>(5)</span>
            </p>
            <p class="product-price">
              <span class="product-discounted-price">Rs.549.00</span>
              <span class="product-original-price">Rs.554</span>
              <span class="product-discount">90%OFF</span>
          </div>
        </div>
      </div>
    </div>
  </c:forEach>
  
  </div>
</div>
<!---------- Product-Section HTML Code Ends --------->



<!-- Featured-Section HTML Code STARTS -->
<div class="width-100 margin-top-50 feature-sect">
  <div class="container">
    <div class="width-20 featured-padding">
      <div class="featured-border">
        <div class="width-20 featured-content">
          <i class="fa fa-truck" aria-hidden="true"></i>
        </div>
        <div class="width-80 featured-content margin-top-8">
          <h4>Instant Delivery</h4>
          <p>One day shipping on all order</p>
        </div>
      </div>
    </div>
    <div class="width-20">
      <div class="featured-border">
        <div class="featured-bord">
          <div class="width-20 featured-content">
            <i class="fa fa-circle-o" aria-hidden="true"></i>
          </div>
          <div class="width-80 featured-content margin-top-8">
            <h4>ONLINE SUPPORT 24/7</h4>
            <p>Support online 24 hours a day</p>
          </div>
        </div>
      </div>
    </div>
    <div class="width-20">
      <div class="featured-border">
        <div class="width-20 featured-content">
          <i class="fa fa-life-ring" aria-hidden="true"></i>
        </div>
        <div class="width-80 featured-content margin-top-8">
          <h4>TRY AND BUY</h4>
          <p>Try Product, If you like it then buy it</p>
        </div>
      </div>
    </div>
    <div class="width-20">
      <div class="featured-border">
        <div class="width-20 featured-content">
          <i class="fa fa-gift" aria-hidden="true"></i>
        </div>
        <div class="width-80 featured-content margin-top-8">
          <h4>INSTANT DISCOUNT</h4>
          <p>Upto 50% instant discount on all product</p>
        </div>
      </div>
    </div>
    <div class="width-20">
      <div class="featured-border">
        <div class="width-20 featured-content">
          <i class="fa fa-credit-card" aria-hidden="true"></i>
        </div>
        <div class="width-80 featured-content margin-top-8">
          <h4>SECURE PAYMENT</h4>
          <p>All cards accepted</p>
        </div>
      </div>
    </div>
  </div>
</div>
<!---------- Featured-Section HTML Code Ends --------->


<!-- Footer-Section HTML Code STARTS -->
<div class="width-100 margin-top-50 footer">
  <div class="container">
    <div class="width-25">
      <h2 class="quicklink-heading">Account Detail</h2>
      <ul class="quicklink-menu">
        <li><a href="#">Home</a></li>
        <li><a href="#">About us</a></li>
        <li><a href="#">Search</a></li>
        <li><a href="#">Cart</a></li>
        <li><a href="#">Checkout</a></li>
      </ul>
    </div>
    <div class="width-25">
      <h2 class="quicklink-heading">Quick Link</h2>
      <ul class="quicklink-menu">
        <li><a href="#">My Profile</a></li>
        <li><a href="#">Change Password</a></li>
        <li><a href="#">Order History</a></li>
        <li><a href="#">My Whislist</a></li>
        <li><a href="#">My Cashback</a></li>
      </ul>
    </div>
    <div class="width-25">
      <h2 class="quicklink-heading">Quick Link</h2>
      <ul class="quicklink-menu">
        <li><a href="#">Login</a></li>
        <li><a href="#">Faq</a></li>
        <li><a href="#">Contact us</a></li>
        <li><a href="#">Download App</a></li>
        <li><a href="#">Refer & Earn Cashback</a></li>
      </ul>
    </div>
    <div class="width-25">
      <h2 class="quicklink-heading">GET IN TOUCH</h2>
      <ul class="get-in-touch">
        <li><i class="fa fa-envelope-o" aria-hidden="true"></i> E-MAIL:<a href="#" class="footer-e-mail"> info@dezven.com</a></li>
        <li><i class="fa fa-headphones" aria-hidden="true"></i> WHATS-APP: +91 -123 456 789</li>
        <li><i class="fa fa-fax" aria-hidden="true"></i> CONTACT NO.: +91 -(123)-4567890</li>
        <li><i class="fa fa-globe" aria-hidden="true"></i> WEBSITE:<a href="#" class="footer-website"> https://www.dezven.com</a></li>
      </ul>
      <ul class="social-media">
        <li><a href="#"><img src="images/icon-facebook.png"></a></li>
        <li><a href="#"><img src="images/icon-twitter.png"></a></li>
        <li><a href="#"><img src="images/icon-linkedin.png"></a></li>
        <li><a href="#"><img src="images/icon-instagram.png"></a></li>
      </ul>
    </div>
  </div>
</div>
<!---------- Footer-Section HTML Code Ends --------->



<!-- Footer-bottom Section HTML Code STARTS -->

<div class="width-100 footer2-bacbor">
  <p class="footer2-content">Copyright Â© 2023, dezven.com. All Rights Reserved</p>
</div>
<!---------- Footer-bottom Section HTML Code Ends --------->




<style >

@charset "UTF-8";


/********** Common CSS Starts **********/  
html, body {
     font-family: Roboto, sans-serif, arial;
     font-size: 14px;
     color: #242424;
     font-weight: 400;
}
 html {
     -webkit-text-size-adjust:100%;
     -ms-text-size-adjust:100%;
     font-size:10px;
     -webkit-tap-highlight-color:transparent 
}
 * {
     margin:0px;
     padding:0px;
     -webkit-box-sizing:border-box;
     -moz-box-sizing:border-box;
     box-sizing:border-box;
     margin:0;
     padding:0;
     outline:0 
}
 .container {
     width:1150px;
     margin:0px auto;
     display:table;
}
 .width-100 {
     width:100%;
     float:left;
}
 .width-50 {
     width:50%;
     float:left;
}
 .width-25 {
     width:25%;
     float:left;
}
 .width-75 {
     width:75%;
     float:left;
}
 .width-80 {
     width:80%;
     float:left;
}
 .width-60 {
     width:60%;
     float:left;
}
 .width-40 {
     width:40%;
     float:left;
}
 .width-33 {
     width:33%;
     float:left;
}
 .width-30 {
     width:30%;
     float:left;
}
 .width-20 {
     width:20%;
     float:left;
}
 .main-section {
     width:100%;
     float:left;
     padding-top:80px;
     padding-bottom:80px;
}
 .bg-grey {
     background:#f0f3fa;
}
 .heading-section {
     font-size: 25px;
     text-align: center;
}
 .heading-section span {
     color: #787eff;
}
 .subhead-section {
     font-size: 16px;
     text-align: center;
     margin-bottom: 40px;
}
/********** Common CSS Ends **********/


/********** Top Header CSS Code Starts  **********/
.top-header {
  background: #f13f31;
  padding: 8px 0px;
  border-bottom: 1px solid #3131315e;
}
.head1p1 {
  font-size: 12px;
  color: #ffffff;
  font-family :"Helvetica Neue", Helvetica, Arial, sans-serif;
}
.head1ul {
  list-style: none;
  float: right;
}
.head1ul li {
  float: left;
  padding-left: 10px;
}
.head1ul li a {
  font-size: 12px;
  color: #ffffff;
  font-family :"Helvetica Neue", Helvetica, Arial, sans-serif;
  text-decoration: none;
}
.head1ul li i {
  font-size: 15px;
  color: #ffffff;
}
/********** Top Header CSS Code Ends  **********/


/**********  Logo and Search Panel CSS Code Starts  **********/
.search-panel {
  background: #f13f31;
  padding: 12px 0px;
}
.search-textbox {
  padding-left: 16px;
  height: 40px;
  width: 80%;
  border: 1px solid #fff;
  float: left;
}
.search-button {
  height: 42px;
  width: 55px;
  border: none;
  background: white;
  float: left;
}
.search-button i {
  color: #f13f31;
}
.cart-sect {
  list-style: none;
  float: right;
  margin-top: 8px;
}
.cart-sect li {
  float: left;
  padding: 0px 6px;
}
.cart-sect li a {
  font-size: 14px;
  color: #ffffff;
  font-family : "Helvetica Neue", Helvetica, Arial, sans-serif;
  text-decoration: none;
}
.cart-sect li i {
  font-size: 14px;
  color: #ffffff;
}


.wimg100-slider{
height: 280px;
    width: 100%;
}
/**********  Logo and Search Panel CSS Code Ends  **********/


/**********  Main Menu CSS Code Starts  **********/
.main-menu {
  list-style: none;
}
.main-menu a {
  font-weight: 500;
  color: #2b304a;
  font-size: 17px;
  font-family: Roboto, sans-serif, arial;
  text-decoration: none;
}
.main-menu li {
  float: left;
  padding: 12px 20px;
}
/**********  Main Menu CSS Code Ends  **********/

/**********  Product-Section CSS Code Starts  **********/
.product-section {
	padding-left:15px;
	padding-right:15px;
	margin-bottom:20px;
}
.product-img {
	width:218px;
	height:270px;
}
.product-img-center {
	text-align:center;
}
.product-border {
	border: 1px solid #d1d1d1;
	padding:20px;
}
.product-name a {
	color: #232b33;
	text-decoration: none;
	font-size: 17px;
	font-family : Roboto, sans-serif, arial;
}
.product-rating {
	color: #FFC315;
	font-size: 14px;
	padding-top: 6px;
}
.product-rating span {
	font-weight: 600;
	color: #3c3b3b8c;
	font-size: 12px;
	font-family: Roboto, sans-serif, arial;
}
.product-discounted-price {
	color: #333;
	font-size: 18px;
	letter-spacing: 0.1px;
	font-weight: 600;
	font-family: Roboto, sans-serif, arial;
}
.product-original-price {
	color: #6f6f6f;
	text-decoration: line-through;
	font-size:14px;
	font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
}
.product-discount {
	border: 1px solid #ccc;
	background: #fff;
	display: inline-block;
	font-size: 10px;
	color: #999;
	padding: 5px;
	border-radius: 1px;
	float:right;
}
.product-price {
	margin-top:15px;
}
/**********   Product-Section CSS Code Ends  **********/


/**********  Feature-Section CSS Code Starts  **********/
.featured-content i {
	font-size: 37px;
	padding: 7px 0 0 10px;
	color: #eb372a;
}
.featured-content h4 {
	color: #666;
	font-size: 14px;
	margin: 0 0 5px;
	text-transform: uppercase;
	font-weight:500;
	font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
}
.featured-content p {
	font-size: 13px;
	color:#333333;
	font-family:"Helvetica Neue", Helvetica, Arial, sans-serif;
}
.margin-top-8 {
	margin-top:8px;
}
.featured-border {
	border: 1px solid #ebebeb;
	width:100%;
	float:left;
	padding:15px 0px;
}
/**********   Feature-Section CSS Code Ends  **********/

/**********  Footer-Section CSS Code Starts  **********/
.footer {
  background: #232f3e;
  padding: 50px 0px;
}
.quicklink-menu {
  list-style: none;
  padding-left: 10px;
}
.quicklink-menu li a {
  color: #fff;
  line-height: 2.5;
  font-size: 15px;
  text-decoration: none;
  font-family : "Helvetica Neue", Helvetica, Arial, sans-serif;
}
.social-media {
  list-style: none;
  margin-top: 10px;
}
.social-media li a img {
  width: 30px;
}
.social-media li {
  float: left;
  padding: 0px 8px;
}
.quicklink-heading {
  font-size: 18px;
  font-weight: bold;
  color: #fff;
  font-family : "Helvetica Neue", Helvetica, Arial, sans-serif;
  margin-bottom: 10px;
}
.get-in-touch {
  list-style: none;
  padding-left: 10px;
}
.get-in-touch li i {
  color: #ed372c;
  font-size: 20px;
}
.get-in-touch li {
  color: #fff;
  line-height: 2.5;
  font-size: 15px;
  text-decoration: none;
  font-family : "Helvetica Neue", Helvetica, Arial, sans-serif;
}
.footer-e-mail {
  font-size: 15px;
  font-weight: bold;
  color: #fff;
  font-family : "Helvetica Neue", Helvetica, Arial, sans-serif;
  text-decoration: none;
}
.footer-website {
  font-size: 12px;
  font-weight: bold;
  color: #fff;
  font-family : "Helvetica Neue", Helvetica, Arial, sans-serif;
  text-decoration: none;
}
.footer2-bacbor {
  background: #232f3e;
  padding: 10px 0px;
  border-top: 1px solid #898989;
}
.footer2-content {
  font-size: 14px;
  color: #fff;
  font-family : "Helvetica Neue", Helvetica, Arial, sans-serif;
  text-align: center;
}
/**********   Footer-Section CSS Code Ends  **********/



/**********  Footer-bottom Section CSS Code Starts  **********/
.footer2-bacbor {
  background: #232f3e;
  padding: 10px 0px;
  border-top: 1px solid #898989;
}
.footer2-content {
  font-size: 14px;
  color: #fff;
  font-family : "Helvetica Neue", Helvetica, Arial, sans-serif;
  text-align: center;
}
/**********   Footer-bottom Section CSS Code Ends  **********/


   
</style>


  
</html>
