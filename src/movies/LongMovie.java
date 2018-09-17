package movies;
import java.io.FileInputStream;
public class LongMovie extends Movie
{public LongMovie (String name, int length, FileInputStream trailer) throws Exception
{super(name, length, trailer);
if (length < 10800) {throw new Exception("The movie is too short.");}}}
