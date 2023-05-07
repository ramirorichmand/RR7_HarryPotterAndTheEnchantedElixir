# 06/05/23 RR7_HarryPotterAndTheEnchantedElixir 🧙‍♂️🧪 

<img src="https://user-images.githubusercontent.com/122550071/236642164-9442dc6f-1c6f-4332-b548-c03157577a7a.jpg" alt="SnapePotionLesson">

## The Challenge 💡

As a personal challenge, I have set out to develop a Spring Boot backend application within 24 hours. The goal of the application is to manage information about magical potions in the Wizarding World. 

To achieve this, I will be implementing various Spring technologies such as <b> Spring Data, Spring Data Queries, Spring database connection, and Spring JPA repositories </b>. Additionally, I will be creating <b>RESTful API endpoints</b> for managing the potions. 

My goal is to demonstrate my proficiency in Spring and backend development while working efficiently under time constraints. 🎯

## MVP 🚀

Here are the features that make up the core of the <b> Harry Potter and the Enchanted Elixir 🧙‍♂️🧪 </b> project:

1. **Student Entity**: The `Student` class is an Entity and can be persisted by its Long IDs. 
2. **Student Repository**: There is a `JpaRepository` interface dedicated to `Student` entities that can persist `Student` objects. 
3. **Room Entity**: The `Room` class is an Entity and can be persisted by its Long IDs.
4. **Room Repository**: There is a `JpaRepository` interface dedicated to `Room` entities that can persist `Room` objects.
5. **Room Endpoints**: Endpoints for creating, finding, deleting, updating, finding available rooms, or finding rooms for owners create the same response as with the PostgreSQL database.
6. **Ingredient Entity**: The `Ingredient` class is an Entity and can be persisted by its Long IDs.
7. **Ingredient Repository**: There is a `JpaRepository` interface dedicated to `Ingredient` entities that can persist `Ingredient` objects.
8. **Recipe Entity**: The `Recipe` class is an Entity and can be persisted by its Long IDs.
9. **Recipe Repository**: There is a `JpaRepository` interface dedicated to `Recipe` entities that can persist `Recipe` objects.
10. **Potions**: Potions are persisted in the database, and all existing potions are listed at `/potions`.
11. **Brew Potion**: At `/potions`, a Student can brew a Potion by sending a POST request. The list of Ingredients is checked if it matches any Potion. If the brew is a discovery, the Recipe is persisted with the list of Ingredients, the Student, and with a name generated from the Student's name (e.g. "John Doe's discovery #2"). The response contains the persisted Potion.
12. **Student Potions**: At `/potions/{student-id}`, all known Potions of a Student are listed.
13. **Generate Potion**: By sending a POST request to `/potions/brew`, a new Potion is generated containing the Student and the status of brewing.
14. **Update Potion**: By sending a PUT request to `/potions/{potion-id}/add`, the Potion with the `potion-id` gets updated with the new Ingredient. The response contains the updated Potion object.

With these features, the "Harry Potter and the Enchanted Elixir" project provides an efficient way to manage information about magical potions in the Wizarding World. 

<img src="https://user-images.githubusercontent.com/122550071/236640722-cf2af8bd-a332-4bef-b5c8-16a48a27ecb9.jpg" alt="PotionsElixir" width="250"/>

<!-- Add BMC --> 

## Show Your Support 🤝

<b> Thank you </b> for taking the time to drop by and check out this Backend API Project ☺️

If you've liked or found this project helpful, please consider supporting me in my journey to create more amazing content and enhance my skills. Your contribution will help me continue delivering the best experience possible for the magical and muggle community alike. 

I'd love to hear your feedback on this project, so feel free to leave your thoughts and suggestions at <b> ramirorichmand@gmail.com </b> 📬

Thank you again for your support! 🙏

<a href="https://www.buymeacoffee.com/ramiro.richmand"><img src="https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png" style="height: 41px !important;width: 174px !important;box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;-webkit-box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;"  target="_blank"></a>
