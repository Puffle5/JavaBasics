package movies;
import java.io.FileInputStream;
public class Movie
{String name;
int length;
FileInputStream trailer;
public Movie(String name, int length, FileInputStream trailer) throws Exception
{if(length < 3600) {throw new Exception();}
this.name = name; //!!!!!!!!!!!!!!!!!!!!!!!
this.length = length;
this.trailer = trailer;}
public static boolean equalTrailers(FileInputStream movie1, FileInputStream movie2) throws Exception
{int movieByte1, movieByte2;
while ((movieByte1 = movie1.read()) != -1) {
    movieByte2 = movie2.read();
    if (movieByte2 == -1) {return false;}
    if (movieByte1 != movieByte2) {return false;}
}
return true;
}
public int compareMovieLengths (Movie m1, Movie m2)
{if (m1.length > m2.length) {return -1;}
else if (m1.length < m2.length) {return 1;}
else {return 0;}
}
public int compareWith(Movie m) {
  if (this.length > m.length) {return -1;}
  else if (this.length < m.length) {return 1;}
  else {return 0;}}

}
