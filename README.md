🎓 Java Collections Exercises – Lists, Sets, Maps & Iterators
👨‍💻 Author: Alejandro Garcia
🧠 Learning Focus: Java Collections Framework & File Handling
🛠️ IDE: IntelliJ IDEA
💡 Java SDK: 23

📄 Description – Statement of the Exercise
This repository contains Java exercises structured around mastering the Java Collections Framework, focusing on Lists, Sets, Maps, and Iterators. File reading/writing and custom class behavior are also explored across two levels of difficulty.

📘 Level 1
📅 Exercise 1 – Months List and Set
- Create a class `Month` with a `name` attribute.
- Add 11 months to an `ArrayList<Month>` (exclude August), then insert August in its correct position.
- Ensure the list maintains chronological order.
- Convert the ArrayList into a `HashSet<Month>` and confirm duplicates are not allowed.
- Iterate through the list using both a `for` loop and an `Iterator`.

🔁 Exercise 2 – Reversing List with ListIterator
- Create and populate a `List<Integer>`.
- Use a `ListIterator` to copy its contents into a second list in reverse order.

🗺️ Exercise 3 – Countries & Capitals Game
- Read from `countries.txt`, which stores country-capital pairs.
- Store pairs in a `HashMap<String, String>`.
- Ask the user’s name, then quiz them on 10 random countries.
- Award points for correct answers.
- Save the final score to `classificacio.txt`.

📘 Level 2
🍴 Exercise 1 – Unique Restaurants
- Create a class `Restaurant` with attributes `name` and `score`.
- Ensure no duplicate restaurants (same name and score) are allowed in a `HashSet<Restaurant>`.

📊 Exercise 2 – Sorting Restaurants
- Sort `Restaurant` objects by name (ascending) and score (descending).
- Use appropriate Java Collections sorting tools.

💻 Technologies Used
☕ Java 23  
🧠 IntelliJ IDEA  
🗃️ Git & GitHub  

📋 Requirements
✅ Java JDK 23 installed  
✅ IntelliJ IDEA (Community or Ultimate)  
✅ Git installed  
✅ countries.txt resource file available in the project directory

🛠️ Installation
1. Clone the repository:
```bash
git clone https://github.com/<your-username>/<your-repository>.git
```
2. Open the project in IntelliJ IDEA:
- Go to **File > Open > [select the cloned folder]**
3. Set the Java SDK:
- Go to **File > Project Structure > Project SDK > Select JDK 23**

▶️ Execution
- Navigate to the corresponding `Main` class file for each level/exercise.
- Right-click and select **Run** to execute the exercise.
- View results in the IntelliJ console.

🌐 Deployment
This is an educational repository and not intended for production.  
To package it for testing:
- Go to **Build > Build Artifacts > .jar**
- Run using:
```bash
java -jar YourProjectName.jar
```

🤝 Contributions
🔹 Contributions welcome as the repository grows.  
🔹 You may:
- ⭐ Star the repo  
- 🍴 Fork and experiment  
- 🛠️ Submit issues or suggestions  

🎯 Learning Goals
This collection is part of a structured journey through Java’s Collection Framework.  
Key concepts covered:
- Lists, Sets, Maps usage  
- Iterators and ListIterators  
- Custom class equality & hashing  
- Sorting and comparing objects  
- File I/O in Java

Thanks for visiting and happy coding! 🚀
