# Screenplay Demo

Project Base for saucedemo.com: Automation of Web Element Interactions and Purchase Flow.

### Project Objective:

Develop an automated project that interacts with the web elements of the https://www.saucedemo.com page and simulates a product purchase flow.

### Tools Used:

- **Programming Language:** Java

- **Automation Framework:** Serenity BDD + Screenplay

### Automated Interactions:

1 - **Login**:
- Automate the login process with valid credentials.

- Verify successful authentication on the platform.

2 - **Product Exploration**:
- Navigate through available product sections.
- Select specific products to add to the cart.

3- **Shopping Cart**:
- Automate shopping cart management.
- Verify the ability to add products.

4- **Purchase Information**: 
- Fill out forms required to complete the purchase.

### How to Execute the Project:

To run the project, follow the steps below:

1 - Open the command terminal.

2 - Navigate to the project directory.

3 - Execute the following command in the terminal:

```gradle
./gradlew clean test -Duser_name=<userName> -Dpassword=<password> aggregate
```
**Make sure to replace *<userName* and *password>* with the login credentials for the [saucedemo page](https://www.saucedemo.com).**

4 - Press Enter to initiate tests execution.