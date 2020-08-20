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



# Example On Hibernate Insert Query </br>

- <b>Airline.java</b>        (My POJO class) </br>
- <b>SaveMainLogic.java</b>  (java file to write our hibernate logic)</br>
- <b>airlines.hbm.xml</b>    (Xml mapping file )</br>
- <b>hibernate.cfg.xml</b>   (Xml configuration file)</br>


# Airline.java

package com.airlines.test;

public class Airline {

	private Integer aId;
	private String aName;
	private String aType;
	private String aCountry;

	public Integer getaId() {
		return aId;
	}

	public void setaId(Integer aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaType() {
		return aType;
	}

	public void setaType(String aType) {
		this.aType = aType;
	}

	public String getaCountry() {
		return aCountry;
	}

	public void setaCountry(String aCountry) {
		this.aCountry = aCountry;
	}

	@Override
	public String toString() {
		return "Airline [aId=" + aId + ", aName=" + aName + ", aType=" + aType + ", aCountry=" + aCountry + "]";
	}
}

>

# airlines.hbm.xml



<!DOCTYPE hibernate-mapping PUBLIC
"-//Hibernate/Hibernate Mapping DTD 3.0//EN"
"http://hibernate.sourceforge.net/hibernate-mapping-3.0.dtd">

<hibernate-mapping>
	<class name="com.test.Airline" table="AirlineTable">
		<id name="aId" column="AirlineIdNo">
			<generator class="assigned" />
		</id>
		<property name="aName" column="AirlineName" />

		<property name="aType" />
		<property name="aCountry" />

	</class>
</hibernate-mapping>


# hibernate.cfg.xml

<?xml version='1.0' encoding='UTF-8'?>
<!DOCTYPE hibernate-configuration PUBLIC
"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
"http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
	<session-factory>

		<!-- Related to the connection START -->
		<property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>   <!-- // oracle.jdbc.driver.OracleDriver -->
		<property name="connection.url">jdbc:mysql://localhost:3306/Airlines</property>
		<property name="connection.user">root</property>
		<property name="connection.password">root</property>
		<!-- Related to the connection END -->

		<!-- Related to hibernate properties START -->
		<property name="show_sql">true</property>
		<property name="dialet">org.hibernate.dialect.MySQLDialect</property>
		<property name="hbm2ddl.auto">update</property>
		<!-- Related to hibernate properties END -->

		<!-- Related to mapping START -->   
		<mapping resource="airlines.hbm.xml" />     <!-- // Our mapping xml file name -->
		<!-- Related to the mapping END -->

	</session-factory>
</hibernate-configuration>


# DeleteMainLogic.java
# SaveMainLogic.java
# SelectMainLogic.java
# UpdateMainLogic.java
