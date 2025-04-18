<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

    <meta charset="UTF-8">
    <title>Library Management System</title>
    <style>
        body {
            margin: 0;
            font-family: 'Roboto', sans-serif;
            background-color: #f4f4f4;
        }

     header {
         background-color: #e3f2fd; /* Light blue */
         color: #0d47a1; /* Darker blue text */
         padding: 10px 30px;
         display: flex;
         justify-content: space-between;
         align-items: center;
         flex-wrap: wrap;
         position: sticky;
         top: 0;
         z-index: 1000;
         box-shadow: 0 2px 6px rgba(0,0,0,0.1);
     }




                nav {
                    display: flex;
                    gap: 15px;
                }

               nav a {
                   color: #0d47a1;
                   text-decoration: none;
                   font-weight: bold;
                   font-size: 16px;
                   padding: 8px 10px;
                   transition: color 0.3s ease;
               }

               nav a:hover {
                   color: #1565c0; /* Slightly deeper blue on hover */
               }


                .auth-buttons {
                    display: flex;
                    gap: 8px;
                }

                .auth-buttons a {
                    background-color: #0d47a1;
                    color: white;
                    padding: 6px 14px;
                    text-decoration: none;
                    border-radius: 4px;
                    font-weight: bold;
                    font-size: 14px;
                    border: none;
                    transition: all 0.3s ease;
                }

                .auth-buttons a:hover {
                    background-color: #1565c0;
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
    <nav>
        <a href="./index.jsp">Home</a>
        <a href="./jsp/about.jsp">About Us</a>
        <a href="./jsp/search.jsp">Search Books</a>
    </nav>
    <div class="auth-buttons">
        <a href="login.jsp">Login</a>
        <a href="register.jsp">Register</a>
    </div>
</header>

<!-- HERO SECTION -->
<section class="hero-section">
    <div class="hero-content">
        <h1>Join the Library Revolution Now!</h1>
        <p>YOUR LIBRARY, YOUR RULES.</p>
        <a href="#explore" class="hero-button">Explore Now</a>
    </div>
</section>

<!-- MAIN SECTION -->
<div class="main-content" id="explore">
    <p>Welcome to our smart and efficient Library Management System — explore, borrow, and manage books with ease!</p>
    <div class="nav-buttons">

        <a href="./members/">Books</a>

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
    <h2>Reviews</h2>
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
<footer style="background-color: #f9f9f9; color: #333; padding: 60px 20px; font-family: 'Segoe UI', sans-serif; border-top: 1px solid #ddd;">

    <!-- Footer Title -->
    <div style="text-align: center; margin-bottom: 40px;">
        <h2 style="color: #0077b6; font-size: 28px; margin-bottom: 10px;">📚 Contact Us</h2>
        <p style="font-size: 16px; color: #555;">Explore more links, updates & contact info below</p>
    </div>

    <!-- Main Footer Content -->
    <div style="max-width: 1200px; margin: auto; display: flex; flex-wrap: wrap; justify-content: space-between; gap: 40px;">

        <!-- About -->
        <div style="flex: 1 1 250px;">
            <h3 style="color: #0077b6;">Library Hub</h3>
            <p>Empowering readers with modern tools. Explore, reserve, and enjoy your favorite books — all in one place.</p>
        </div>

        <!-- Quick Links -->
        <div style="flex: 1 1 200px;">
            <h4 style="color: #0077b6;">Quick Links</h4>
            <ul style="list-style: none; padding: 0; line-height: 1.8;">
                <li><a href="./index.jsp" style="color: #555; text-decoration: none;">Home</a></li>
                <li><a href="./jsp/about.jsp" style="color: #555; text-decoration: none;">About Us</a></li>
                <li><a href="./jsp/search.jsp" style="color: #555; text-decoration: none;">Search Books</a></li>
                <li><a href="./jsp/login.jsp" style="color: #555; text-decoration: none;">Login</a></li>
                <li><a href="./jsp/register.jsp" style="color: #555; text-decoration: none;">Register</a></li>
            </ul>
        </div>

        <!-- Newsletter -->
        <div style="flex: 1 1 300px;">
            <h4 style="color: #0077b6;">Stay Connected</h4>
            <p>Join our newsletter to receive updates on new arrivals and events.</p>
            <form style="margin-top: 10px;">
                <input type="email" placeholder="Your email" style="padding: 10px; width: 70%; border: 1px solid #ccc; border-radius: 4px 0 0 4px;">
                <button type="submit" style="padding: 10px 15px; background-color: #0077b6; color: #fff; border: none; border-radius: 0 4px 4px 0; cursor: pointer;">Subscribe</button>
            </form>
        </div>

        <!-- Contact Info -->
        <div style="flex: 1 1 250px;">
            <h4 style="color: #0077b6;">Contact Us</h4>
            <p>Email: <a href="mailto:support@library.com" style="color: #0077b6;">support@library.com</a></p>
            <p>Phone: +91-9876543210</p>
            <p>Location: 123 Knowledge Street, Booktown, India</p>
        </div>
    </div>

    <hr style="margin: 40px 0; border-color: #ccc;">

    <!-- Bottom Bar -->
    <div style="text-align: center;">
        <p style="margin: 10px 0;">&copy; 2025 Library Management System. All rights reserved.</p>
        <div style="margin-top: 10px; font-size: 20px;">
            <a href="#" style="color: #0077b6; margin: 0 10px;"><i class="fab fa-facebook"></i></a>
            <a href="#" style="color: #0077b6; margin: 0 10px;"><i class="fab fa-twitter"></i></a>
            <a href="#" style="color: #0077b6; margin: 0 10px;"><i class="fab fa-instagram"></i></a>
        </div>
    </div>
</footer>

</body>
</html>
