# Description

Assuming that you are the architect of a robust application which has a MVC architecture pattern and fetches data from a relational database, you received a requirement to create a new feature that will display a large amount of data on screen. This data is the result of combining tables in the database and it is causing a huge performance issue in the application. List at least 5 (five) solutions you would propose to do a POC explaining why each one could potentially solve the issue.

# Solutions

1. Non-SQL databases

   For some applications we can choose to mix relational and non-relational databases to extract the better performance from a software. This data can be stored, queried and extracted from a non-relational databases, and we can also have a summary for this data in a relational database to help correlate statistics for other tasks

2. Summary Tables

   Using the same idea from previous solution, we can choose persist the data into a table in a relational databases, but we can also have a summary table that correlate the data on persist phase only with specific values that can be helpful on the filters/orders in the view

3. Async exportation

   Other idea it's building a slower query but make a queue to the asked queries, this way the user can ask the data to view with necessary filters, and the software will build a report with the result

4. Pagination

   If its necessary show the data only in the page, without mixing the database types, we could use pagination from main table and make a lazy relationship between the classes, this will make the software query the data only when it's necessary

5. Try optimization

   The last option is try to optimize the tables and software to query all the data without waste too much time, thinking about create indexes on database, make cache from queries or using an accelerator (like DAX for dynamoDB)