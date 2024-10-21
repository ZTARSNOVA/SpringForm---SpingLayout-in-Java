# 👩🏻‍💻SpringLayout in Java - SpringForm & ClassLibrary

SpringForm & ClassLibrary are Java applications that implement GUI forms using the Swing library. SpringForm manages contact information (Name, Telephone, Email, Address), while ClassLibrary handles books. It features a tabbed interface for registering and searching books, with data stored in a text file.

# 📚ClassLibrary 
ClassLibrary is a Java Swing application that allows users to manage a book collection through a tabbed interface. Users can register books by providing details like title, author, year, plot, and setting. The application stores this data in a text file for persistence and displays the information in a table. Additionally, it includes a search function to find books by title, dynamically updating the table with the results.

-----------------------------------------------------

 _💡This project was developed as part of a graded assignment for the Object-Oriented Programming course at Universidad San Ignacio de Loyola._

-----------------------------------------------------

### 🟪 Register books

Users can easily register new books by entering details such as the book's title, author, year of publication, plot, and setting. Once registered, the data is stored in a text file (Libros.txt) to ensure that it persists between sessions. The registration form has fields for each of these attributes, and the interface checks that all fields are filled out before the book can be added, ensuring data completeness.

<div align="center">
  <img src="https://github.com/user-attachments/assets/48894d7f-5f8c-4479-9e2d-3fe4db6393ae" alt="Form Interface" width="400"/>
</div>

### 🟪 Search books

A built-in search functionality allows users to quickly search for books by their title. As users type in a search term, the application scans the stored book records and updates the display to show any matching entries. If no matches are found, a notification appears indicating that the book was not located. This makes it easy to manage and locate specific books, even in large collections.

<div align="center">
  <img src="https://github.com/user-attachments/assets/52ea7471-3924-4b6a-89ba-3c6c98bf7390" alt="Search Results" width="400"/>
</div>

### 🟪 Data persistence

All the book information, including title, author, year, plot, and setting, is saved in a text file (Libros.txt) to maintain a persistent record. This means that even after closing and reopening the application, the registered books are reloaded from the file and displayed in the application’s table. This ensures that users do not lose any data between sessions.

<div align="center">
  <img src="https://github.com/user-attachments/assets/dc4f6090-b2cb-421c-bf18-347250470ba8" alt="Book Table" width="400"/>
</div>
