📜 Description

The Core Service acts as the main entry point for the Cafe Rating System.
It aggregates information from multiple microservices (User, Cafe, Rating) to provide a seamless user experience.
Users can search cafes by location, view cafe details, filter by top-rated cafes, give ratings, and review their past ratings.

📋 Responsibilities

Communicate with Cafe Service to get cafe details.

Communicate with Rating Service to filter and display top-rated cafes.

Allow users to select cafes and give new ratings.

Fetch and display user’s previous reviews.

🛠 Tech Stack

Spring Boot

RestTemplate (for communication with other services)

Lombok

Maven
