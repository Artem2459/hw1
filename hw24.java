//Book (Книга):
//Атрибути: title, author, year, id
//Методи: addBook(), removeBook(), editBook(), searchByTitle(), searchByAuthor()
//Зв'язки: асоціація з класом Loan (багато-до-багатьох)
//Reader (Читач):
//Атрибути: firstName, lastName, phoneNumber, cardNumber
//Методи: registerReader(), removeReader(), editReader()
//Зв'язки: асоціація з класом Loan (багато-до-багатьох), залежність від класу Loan (один-до-одного)
//Loan (Видача книг):
//Атрибути: dueDate, fine
//Методи: issueBook(), returnBook(), calculateFine()
//Зв'язки: асоціація з класами Book та Reader (багато-до-багатьох), агрегація з класом Reservation (багато-до-багатьох)
//Reservation (Резервація):
//Зв'язки: агрегація з класом Loan (багато-до-багатьох)
//LibrarySystem (Система бібліотеки):
//Методи: addBookToLibrary(), removeBookFromLibrary(), registerReader(), removeReader(), issueBookToReader(), returnBookFromReader(), reserveBookForReader(), cancelReservation()
//Зв'язки: залежність від класів Book, Reader та Loan
//FileHandler (Обробник файлів):
//Методи: saveToFile(), loadFromFile()
//Зв'язки: залежність від класу LibrarySystem
