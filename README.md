

Book 
- CRUD Operations: Create, Read, Update, Delete books
- Search Functionality: Search by book name, author or type
- Filtering: Filter books by category/type

User 
- User Registration: Add new users to system
- User Profiles: View and update user details
- User Deletion: Remove users from system
- User Lookup: Get all users or individual by ID

Borrowing 
- Book Checkout: Record book borrow transactions
- Book Returns: Update records when books are returned

Backend Architecture
- RESTful API design with Spring Boot
- MVC pattern with Controllers, Services and Repositories
- JPA/Hibernate for database operations
- MySQL relational database
- Maven build system

Core Components
- Entities: Book, User, Borrow 
- Repositories: Spring Data JPA repositories for data access
- Services: Business logic layer
- Controllers: REST endpoint handlers
- Exception Handling: Basic error handling for missing entities

Database Schema
- Books Table: Stores book information (title, author, etc.)
- Users Table: Stores user account information
- Borrow Records Table: Tracks book loans with timestamps
- Relationships: Many-to-one between Borrow and Book/User


API Endpoints :

Book Endpoints
- POST `/book/add` - Add new book
- GET `/book/all` - Get all books
- GET `/book/one/{id}` - Get book by ID
- PUT `/book/edit/{id}` - Update book
- DELETE `/book/del/{id}` - Delete book
- GET `/book/search/{keyword}` - Search books
- GET `/book/filterByType/{btype}` - Filter by type
- GET `/book/sortByTitle` - Sort by title
- GET `/book/sortByAuthor` - Sort by author
- GET `/book/sortByPublicationYear` - Sort by year

User Endpoints
- POST `/user/add` - Add new user
- GET `/user/all` - Get all users
- GET `/user/one/{id}` - Get user by ID
- PUT `/user/edit/{id}` - Update user
- DELETE `/user/del/{id}` - Delete user

Borrow Endpoints
- POST `/borrow/borrowBook` - Borrow a book
- PUT `/borrow/returnBook` - Return a book


