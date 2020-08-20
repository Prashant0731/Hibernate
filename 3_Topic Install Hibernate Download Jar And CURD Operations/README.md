# Where To Download, How To Install Hibernate

> <b> STEP -1 :</b>
Go to Hibernate related jars here <b> http://sourceforge.net/projects/hibernate/files/hibernate3 </b>

> <b> STEP -2 :</b>
Above URL choose <b> hibernate 3.2.2-ga.zip,</b> as we are in initial stage this version stable.</br>
Unzip it, and now you can find some jar files in the <b>lib folder </b>, actually we doesn’t require all the jar files, 
<br> Now just select the following jar files..


- Anttr-2.7.6.jar
- asm.jar
- asm-attrs.jar
- cglib-2.1.3.jar
- commons-collections-2.1.1.jar
- commons-logging-1.0.4.jar
- ehcash.jar
- dom4j-1.6.1.jar
- <b> hibernate3.jar </b>
- jta.jar
- log4j-1.2.3.jar</br>


> <b>hibernate3.jar</b>  is the main file, & few annotation we need to add 4 – 6 other jar files. </br>


> <b> Remember: </b> 
- Hibernate jars we must include one more jar file, which is nothing but related to our database.</br> 
This is depending on your database, So finally we need total of 12 jar files to run the hibernate related program.


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Steps To Use Hibernate In Any Java Application

- This is the exact flow of any hibernate application</br>

- Whether the java application will run in the server or without server, and the application may be desktop or       stand alone, swing, awt, servlet…what ever, but the steps are common to all.


> 1. Import the hibernate API, they are many more, but these 2 are more than enough… 


> 2. To load configuration xml, we need to create object of Configuration class, which is given in org.hibernate.cfg.*;  
and we need to call configure() method in that class, by passing xml configuration file name as parameter.

- configuration file name is your choice, but by default am have been given hibernate.cfg.xml. 
-  once we write the line _ cfg.configure(“hibernate.cfg.xml”), configuration object cfg will reads this xml file hibernate.cfg.xml.
   > cf will reads data from hibernate.cfg.xml</br>
   > Stores the data in different variables</br>
   > finally all these variables are grouped and create one high level hibernate object we can call as SessionFactory object.</br>
   > So Configuration class only can create this SessionFactory object</br>

- SessionFactory is an interface not a class, and SessionFactoryImpl is the implimented class for SessionFactory
- SessionFactory object sf contains all the data regarding the configuation file so we can call sf as heavy weight object </br> 

> 3. Creating an object of session. 

 -    Session is an interface and SessionImpl is implemented class, both are given in org.hibernate.*;
 -    When ever session is opened then internally a database connection will be opened, in order to get a session or open a session we need to call openSession() method in SessionFactory.

> 4. Create a logical Transaction.   <b> (Only required when we insert, update, delete operation in db.) </b> </br>
-   To begin a logical transaction in hibernate then we need to call a method beginTransaction() given by Session Interface.</br>



> 5. Use the methods given by Session Interface, 

- Now call commit() in Transaction. as tx.commit();
- When we open session a connection to the database will be created. we must close that connection. as session. close().
- finally close the SessionFactory as sf.close()


