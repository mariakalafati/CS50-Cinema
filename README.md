YOUR PROJECT TITLE: Cinema
#### Video Demo:  <https://youtu.be/_XO1imqCHWE>
#### Description:
Cinema
Cinema is an application that demonstrates a ticket booking platform in a cinema.
The cinema displays movies that are identified via a title and a code.
The cinema has a specific number of hallsand each hall has a unique code, numer of lines, seats per line, 3D availability and price.
Each hall has an evening and night display which s characterized by the movie title and start time.
Each display has a table of availability which is updated with every ticket purchase.
The ticket displays the code, price, hall, line and seat, movie and time and the reservation timestamp.
Application usage
The user can either preview the availability of each display of every hall and can reserve and print the ticket, if available.
Customer.java
Customer.java is the main application. Here the programmer can set the cinema name and the number of halls the cinema has.
This is the application that handles the interface the user/client will interact with as it displayes the options, displays availability and allows ticket booking.
Hall1.java Hall2.java
Each all the cinema has has its one java file that handles its opperations. Hall1.java and Hall2.java are equivilant.
Hall1.java
The applications start by defining the hall numer and continue with defining the hall characteristics as id, numer of lines, seats per line, 3D availability, and prices.
The application then defines the movies and start times and creates their availability tables.
The function of printHall is then implemented that prints the Hall, id, 3D avaiability, movie, start time and price followed by a print of the availability table created previously.
This is executed for each movie.
Finally the book function is created that checks is the booking the user is trying to make is available.
If so prints the ticket which includes the id, price, hall, line and seat, movie and time and the reservation timestamp.
If a booking was made the Availability table is updated.
Hall2.java
The applications start by defining the hall numer and continue with defining the hall characteristics as id, numer of lines, seats per line, 3D availability, and prices.
The application then defines the movies and start times and creates their availability tables.
The function of printHall is then implemented that prints the Hall, id, 3D avaiability, movie, start time and price followed by a print of the availability table created previously.
This is executed for each movie.
Finally the book function is created that checks is the booking the user is trying to make is available.
If so prints the ticket which includes the id, price, hall, line and seat, movie and time and the reservation timestamp.
If a booking was made the Availability table is updated.
This is Cinema