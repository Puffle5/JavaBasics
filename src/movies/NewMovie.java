package movies;
public class NewMovie
{public static void main(String[] args) throws Exception
{Movie shrek = new Movie("Shrek", 7200, null);
Movie matrix = new Movie("Matrix", 10000, null);
Movie terminator_2 = new LongMovie("Terminator", 20000, null);
Movie[] movies = new Movie[3];
movies[0] = shrek;
movies[1] = matrix;
movies[2] = terminator_2;
for (int i=0; i<movies.length; i++)
{for (int j=0; j<movies.length; j++)
{if (i==j) {continue;}
if (Movie.equalTrailers(movies[i].trailer, movies[j].trailer)==true)
{System.out.println(movies[i].name+" "+movies[j].name);}}}
for (int z=0;z<movies.length;z++)
{for (int y=1;y<movies.length;y++)
{if(movies[y].compareWith(movies[y-1]) == -1){
Movie help = movies[y];
movies[y] = movies[y-1];
movies[y-1] = help;
} else if (movies[y].compareWith(movies[y-1]) == 0)
{if (movies[y-1].name.compareTo(movies[y].name)<0)
{Movie help = movies[y];
movies[y] = movies[y-1];
movies[y-1] = help;}}}}
for (int a=0;a<movies.length;a++)
    {System.out.println(movies[a].name);}}}
