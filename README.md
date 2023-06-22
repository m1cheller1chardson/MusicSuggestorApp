# Music Suggestor App
​
Full-stack application that recommends a song to the user based on the genre selected, developed using Java and Vue.js. Includes use of Relational Databases, Spring Boot, PostgreSQL, and Postman. 

# Database
Inside the <project-root>/database/ directory, you'll find an executable Bash script (.sh file) and several SQL scripts (.sql files). These can be used to build and rebuild a PostgreSQL database for the capstone project.

From a terminal session, execute the following commands:

cd <project-root>/database/
./create.sh
This Bash script drops the existing database, if necessary, creates a new database named final_capstone, and runs the various SQL scripts in the correct order. You don't need to modify the Bash script unless you want to change the database name.

Each SQL script has a specific purpose as described here:

# File Name	# Description
data.sql	This script populates the database with any static setup data or test/demo data. The project team should modify this script.
dropdb.sql	This script destroys the database so that it can be recreated. It drops the database and associated users. The project team shouldn't have to modify this script.
schema.sql	This script creates all of the database objects, such as tables and sequences. The project team should modify this script.
user.sql	This script creates the database application users and grants them the appropriate privileges. The project team shouldn't have to modify this script.
See the next section for more information on these users.
Database users
The database superuser—meaning postgres—must only be used for database administration. It must not be used by applications. As such, two database users are created for the capstone application to use as described here:

Username	Description
final_capstone_owner	This user is the schema owner. It has full access—meaning granted all privileges—to all database objects within the capstone schema and also has privileges to create new schema objects. This user can be used to connect to the database from PGAdmin for administrative purposes.
final_capstone_appuser	The application uses this user to make connections to the database. This user is granted SELECT, INSERT, UPDATE, and DELETE privileges for all database tables and can SELECT from all sequences. The application datasource has been configured to connect using this user.
Spring Boot
Note: Spring Boot has been configured to run on port 9000 for this project. You might be used to port 8080 from earlier in the cohort, but it's changed so as not to conflict with the Vue server that you'll be running concurrently.

Datasource
