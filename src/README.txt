Amazing Colors 

For this homework you need to make sure the names of your class, methods, and variables exactly the way it is described in the assignment. 

Create all your files inside the src package. 

Create a class named Colors
Create a private variable of a type ArrayList named colorsList
Create a constructor that will accept ArrayList of Strings as a parameter and will add all elements from that list to the colorsList.
Create getter and setter for colorsList
Method 1: Create a method named addColor()
	- method will accept String color as a parameter and will add that color to the  colorsList. method will not return anything
Method 2: Create a method named addColors()
	- method will accept ArrayList of Strings as a parameter and will add all elements from that list to the colorsList. method will not return anything;
Method 3: Create a method named changeSecondToOrange()
	- method will create new ArrayList and will be assigned all the values from 		     colorsList, but every second element in the new ArrayList will have “Orange” 		color instead of the original. the method will return that new list
Method 4: Create a method named findColor()
	- method will accept String color as a parameter and will search for that color in the colorsList. If the color exist in the colorsList, method will return index of the color. If color doesn’t exist, then method will return -1

Method 5: Create a method named getColorCount()
	-method will accept String color as a parameter and will search for that color in the colorsList and will count how many times this color appears in the colorsList. method will return that count. If no match for that color is found, the method will return 0
Method 6: Create a method named removeDuplicates()
	-method will not accept any parameters. method will check all elements in the list colorsList and will remove all the duplicates(but will leave one copy). method will not return anything. (if list has 3 “Red”→ it will remove 2 and leave one “Red” in the list).

Method 7: Create a method named replaceColor()
	-method will accept two String variables named color1 and replacementColor as parameters. method will check all elements in the list colorsList and will try to find color in the list, if color is found, it will replace given color1 with the replacementColor. method will return true if color will be replaced, and will return false if color was not found in the list.
