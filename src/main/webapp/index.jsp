<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Library Management System</title>
    <style>
        body {
            margin: 0;
            font-family: 'Roboto', sans-serif;
            background-color: #f4f4f4;
        }

        header {
            background-color: #007BFF;
            color: white;
            padding: 20px 50px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            flex-wrap: wrap;
            position: sticky;
            top: 0;
            z-index: 1000;
        }

        header h1 {
            margin: 0;
            flex: 1 1 100%;
            font-size: 2.5rem;
            text-transform: uppercase;
            letter-spacing: 1px;
            transition: color 0.3s ease;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
        }

        header h1:hover {
            color: #ffd700;
        }

        nav {
            display: flex;
            gap: 20px;
            margin-top: 10px;
        }

        nav a {
            color: white;
            text-decoration: none;
            font-weight: bold;
            transition: color 0.3s ease;
        }

        nav a:hover {
            color: #ffd700;
        }

        .auth-buttons {
            margin-left: auto;
            display: flex;
            gap: 10px;
            margin-top: 10px;
            position: sticky;
            top: 0;
        }

        .auth-buttons a {
            background-color: white;
            color: #007BFF;
            padding: 8px 16px;
            text-decoration: none;
            border-radius: 5px;
            font-weight: bold;
            border: 1px solid white;
            transition: all 0.3s ease;
        }

        .auth-buttons a:hover {
            background-color: #0056b3;
            color: white;
        }

        /* Hero Section */
        .hero-section {
            background-image: url('./images/lib1.jpg');
            background-size: cover;
            background-position: center;
            height: 80vh;
            position: relative;
            display: flex;
            align-items: center;
            justify-content: center;
            text-align: center;
            color: white;
        }

        .hero-section::before {
            content: "";
            position: absolute;
            top: 0; left: 0;
            width: 100%; height: 100%;
            background: rgba(0, 0, 0, 0.5);
            z-index: 1;
        }

        .hero-content {
            position: relative;
            z-index: 2;
            max-width: 800px;
            padding: 20px;
        }

        .hero-content h1 {
            font-size: 3rem;
            margin-bottom: 10px;
            font-weight: bold;
            text-transform: uppercase;
            letter-spacing: 1px;
            transition: transform 0.3s ease;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.7);
        }

        .hero-content h1:hover {
            transform: scale(1.1);
        }

        .hero-content p {
            font-size: 1.5rem;
            margin-bottom: 30px;
            font-style: italic;
            transition: color 0.3s ease;
            text-shadow: 1px 1px 4px rgba(0, 0, 0, 0.5);
        }

        .hero-content p:hover {
            color: #ffd700;
        }

        .hero-button {
            background-color: #ff6600;
            color: white;
            padding: 15px 30px;
            border: none;
            text-decoration: none;
            font-size: 1.2rem;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .hero-button:hover {
            background-color: #cc5200;
        }

        .main-content {
            padding: 40px;
            text-align: center;
        }

        .main-content p {
            font-size: 18px;
            margin-bottom: 30px;
        }

        .nav-buttons a {
            display: inline-block;
            margin: 10px;
            background-color: #007BFF;
            color: white;
            padding: 15px 30px;
            text-decoration: none;
            font-size: 18px;
            border-radius: 6px;
            transition: background-color 0.3s ease;
        }

        .nav-buttons a:hover {
            background-color: #0056b3;
        }

        .top-selling {
            padding: 40px 20px;
            background-color: #fff;
            text-align: center;
        }

        .top-selling h2 {
            font-size: 32px;
            margin-bottom: 30px;
            color: #007BFF;
            text-transform: uppercase;
            letter-spacing: 1px;
        }

        .book-list {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;
            gap: 30px;
        }

        .book-card {
            background-color: #ffffff;
            border-radius: 12px;
            width: 260px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.12);
            overflow: hidden;
            text-align: left;
            transition: transform 0.4s ease, box-shadow 0.4s ease;
            position: relative;
        }

        .book-card:hover {
            transform: scale(1.05);
            box-shadow: 0 12px 30px rgba(0, 123, 255, 0.3);
        }

        .book-card img {
            width: 100%;
            height: 300px;
            object-fit: cover;
            object-position: center top;
            transition: transform 0.4s ease;
        }

        .book-card:hover img {
            transform: scale(1.1);
        }

        .book-info {
            padding: 15px;
            background: linear-gradient(135deg, #f7f7f7, #eaeaea);
        }

        .book-info h3 {
            margin: 10px 0 5px;
            font-size: 20px;
            color: #333;
        }

        .book-info p {
            margin: 4px 0;
            font-size: 14px;
            color: #555;
        }

        .review {
            font-style: italic;
            color: #666;
            margin-top: 10px;
            font-size: 13px;
        }

        footer {
            background-color: #f0f0f0;
            color: #333;
            padding: 40px 20px;
            text-align: center;
            font-size: 16px;
            line-height: 1.8;
        }

        footer p {
            margin: 10px 0;
        }

        footer a {
            color: #007BFF;
            text-decoration: none;
        }

        footer a:hover {
            text-decoration: underline;
        }

        @media (max-width: 768px) {
            nav, .auth-buttons {
                flex-direction: column;
                align-items: flex-start;
            }

            .nav-buttons a {
                width: 80%;
            }

            .book-list {
                flex-direction: column;
                align-items: center;
            }

            .hero-content h1 {
                font-size: 2rem;
            }

            .hero-content p {
                font-size: 1.2rem;
            }
        }
    </style>
</head>
<body>

<header>
   <h1>Welcome to the Library Hub!</h1>
    <nav>
        <a href="./index.jsp">Home</a>
        <a href="./jsp/about.jsp">About Us</a>
        <a href="./jsp/search.jsp">Search Books</a>
    </nav>
    <div class="auth-buttons">
        <a href="./jsp/login.jsp">Login</a>
        <a href="./jsp/register.jsp">Register</a>
    </div>
</header>

<!-- HERO SECTION -->
<section class="hero-section">
    <div class="hero-content">
        <h1>Join the Library Revolution Now!</h1>
        <p>YOUR LIBRARY. YOUR RULES.</p>
        <a href="#explore" class="hero-button">Explore Now</a>
    </div>
</section>

<!-- MAIN SECTION -->
<div class="main-content" id="explore">
    <p>Welcome to our smart and efficient Library Management System — explore, borrow, and manage books with ease!</p>
    <div class="nav-buttons">
        <a href="./books/">Manage Books</a>
        <a href="./members/">Manage Members</a>
        <a href="./loans/">Manage Loans</a>
    </div>
</div>

<!-- TOP SELLING BOOKS SECTION -->
<section class="top-selling">
    <h2>Reader's Favorites</h2>
    <div class="book-list">
        <div class="book-card">
            <img src="./images/atomichabits.jpg" alt="Atomic Habits">
            <div class="book-info">
                <h3>Atomic Habits</h3>
                <p>by James Clear</p>
                <p>Price: ₹499</p>
                <p class="review">"Life changing habits, explained simply!"</p>
            </div>
        </div>

        <div class="book-card">
            <img src="./images/alchemist.jpg" alt="The Alchemist">
            <div class="book-info">
                <h3>The Alchemist</h3>
                <p>by Paulo Coelho</p>
                <p>Price: ₹350</p>
                <p class="review">"Inspirational story with deep meaning."</p>
            </div>
        </div>

        <div class="book-card">
            <img src="./images/ikigai.png" alt="Ikigai">
            <div class="book-info">
                <h3>Ikigai</h3>
                <p>by Héctor García</p>
                <p>Price: ₹420</p>
                <p class="review">"Soothing and motivating read that inspires purpose."</p>
            </div>
        </div>

        <div class="book-card">
            <img src="./images/richdad.png" alt="Rich Dad Poor Dad">
            <div class="book-info">
                <h3>Rich Dad Poor Dad</h3>
                <p>by Robert Kiyosaki</p>
                <p>Price: ₹430</p>
                <p class="review">"Every student and entrepreneur must read this."</p>
            </div>
        </div>
    </div>
</section>

<!-- CUSTOMER REVIEWS SECTION -->
<section class="top-selling">
    <h2>Customer Reviews</h2>
    <div class="book-list">

        <div class="book-card">
            <img src="./images/review1.jpg" alt="User Review 1">
            <div class="book-info">
                <h3>Anjali Sharma</h3>
                <p>⭐⭐⭐⭐⭐</p>
                <p>"This library portal made my semester so easy. Borrowing books has never been smoother! The interface is user-friendly, and the borrowing process is incredibly fast."</p>
                <p class="review">– Verified Member</p>
            </div>
        </div>

        <div class="book-card">
            <img src="./images/review2.jpg" alt="User Review 2">
            <div class="book-info">
                <h3>Rahul Mehta</h3>
                <p>⭐⭐⭐⭐</p>
                <p>"The library facilities are top-notch. I love the quiet study zones and the comfortable seating arrangements. It’s always a great place to focus!"</p>
                <p class="review">– Member since 2023</p>
            </div>
        </div>

        <div class="book-card">
            <img src="./images/review3.jpg" alt="User Review 3">
            <div class="book-info">
                <h3>Fatima Khan</h3>
                <p>⭐⭐⭐⭐⭐</p>
                <p>"The collection of books is incredible! There’s something for everyone, from academic texts to bestselling novels. I always find what I need!"</p>
                <p class="review">– Reader & Contributor</p>
            </div>
        </div>

    </div>
</section>

<!-- FOOTER -->
<footer>
    <p>&copy; 2025 Library Management System</p>
    <p>Developed with 💙 for book lovers and knowledge seekers</p>
    <p>Contact us at <a href="mailto:support@library.com">support@library.com</a></p>
    <p>Follow us on
        <a href="#">Facebook</a> |
        <a href="#">Twitter</a> |
        <a href="#">Instagram</a>
    </p>
</footer>

</body>
</html>
